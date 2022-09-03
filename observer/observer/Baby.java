package observer;

import java.util.ArrayList;
import java.util.Random;
public class Baby implements Subject {
    private String name;
    private ArrayList<Observer> observers;
    private Random rand;

    public Baby(String name){
        this.name = name;
        this.observers = new ArrayList<Observer>();

    }
    public String getName() {
        return this.name;
    }
    public void receiveLove(){
        rand = new Random();
        String [] randMsg = {getName()+" feels appreciated and loved", getName()+" pushes everyone away and continues to cry"};
        System.out.println(randMsg[rand.nextInt(randMsg.length)]);   
    }
    public void eat(){
        rand = new Random();
        String [] randMsg = {getName()+" has a happy full tummy", getName()+" throws all his food on the floor"};
        System.out.println(randMsg[rand.nextInt(randMsg.length)]);   
    }
    public void getChanged(){
        System.out.println(getName()+" is having a diaper change");
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }
    @Override
    public void notifyObserver(Cry cry) {
        for(Observer observer : observers)  {
            observer.update(cry);
        }
        
    }
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! "+getName()+" is feeling abandoned and angry");
        notifyObserver(Cry.ANGRY);

    }
    public void wetCry() {
        System.out.println("Aaaaaaa! "+getName()+" is WET!");
        notifyObserver(Cry.WET);

    }
    public void hungryCry() {
        System.out.println("Neh Neh Neh! "+getName()+" is starving!!!!");
        notifyObserver(Cry.HUNGRY);
        
    }
}
