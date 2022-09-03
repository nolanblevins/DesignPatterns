package observer;

import java.util.Random;

public class Dad implements Observer {
    private Subject baby;
    private Random rand;
    
    public Dad(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }
    
    public void update(Cry cry) { 
        rand = new Random();
        String [] randMsg = {"Dad puts a pillow over his head", "Dad nudges mom", "Dad screams ...aaaaa"};
        System.out.println(randMsg[rand.nextInt(randMsg.length)]);   
    }
    
}
