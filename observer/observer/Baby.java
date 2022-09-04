package observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * Author: Nolan Blevins
 * 
 * Main subject of the project, this class is used for the baby object and all
 * of its methods,
 * the baby is the object being observed by the observers. Class contains
 * methods for different actions
 * the baby would commit.
 */
public class Baby implements Subject {
    private String name;
    private ArrayList<Observer> observers;
    private Random rand;

    /**
     * @param name the babys name
     */
    public Baby(String name) {
        this.name = name;
        this.observers = new ArrayList<Observer>();

    }

    /**
     * @return returns name of the baby as a string
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method generates a random message and prints that message when called.
     * receiveLove is called by mom class when the baby has an angry cry.
     */
    public void receiveLove() {
        rand = new Random();
        String[] randMsg = { getName() + " feels appreciated and loved",
                getName() + " pushes everyone away and continues to cry" };
        System.out.println(randMsg[rand.nextInt(randMsg.length)]);
    }

    /**
     * Method picks between two random messages and prints it.
     * eat is called by mom class when the baby is hungry crying.
     */
    public void eat() {
        rand = new Random();
        String[] randMsg = { getName() + " has a happy full tummy", getName() + " throws all his food on the floor" };
        System.out.println(randMsg[rand.nextInt(randMsg.length)]);
    }

    /**
     * Method displays that the baby is being changed.
     * Called by mom class when baby is having a wet cry.
     */
    public void getChanged() {
        System.out.println(getName() + " is having a diaper change");
    }

    /**
     * Method is used to register observers.
     * This method adds the observer to the array list of observers when called.
     * 
     * @param Observer observer is the object in which is observing the baby.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    /**
     * Method is used to remove observers.
     * This method removes the observer passed through from the array list of
     * observers.
     * 
     * @param Observer observer is the object in which is observing the baby.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    /**
     * Method passes through a type of cry and notifys the observers of that cry
     * 
     * @param cry type of cry is passed through and used to notify observers
     */
    @Override
    public void notifyObserver(Cry cry) {
        for (Observer observer : observers) {
            observer.update(cry);
        }

    }

    /**
     * Method prints emotion of baby as angry and then
     * notify the babys observers that the baby is angry.
     */
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! " + getName() + " is feeling abandoned and angry");
        notifyObserver(Cry.ANGRY);

    }

    /**
     * Method prints emotion of baby as wet and then
     * notify the babys observers that the baby is wet.
     */
    public void wetCry() {
        System.out.println("Aaaaaaa! " + getName() + " is WET!");
        notifyObserver(Cry.WET);

    }

    /**
     * Method prints emotion of baby as hungry and then
     * notify the babys observers that the baby is hungry.
     */
    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + getName() + " is starving!!!!");
        notifyObserver(Cry.HUNGRY);

    }
}
