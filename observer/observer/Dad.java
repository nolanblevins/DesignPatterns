package observer;

import java.util.Random;

/**
 * Author: Nolan Blevins
 * 
 * Observer of the baby. This class implements observer methods and
 * updates dads actions based upon the type of baby cry.
 */
public class Dad implements Observer {
    private Subject baby;
    private Random rand;

    /**
     * registers dad as an observer of the baby
     * 
     * @param baby passes through the baby object which is the subject
     * 
     */
    public Dad(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * update method updates the dad based upon the type of cry, which in
     * this case is printing a random message.
     * 
     * @param cry type of cry is passed through and used to notify observers
     * 
     */
    public void update(Cry cry) {
        rand = new Random();
        String[] randMsg = { "Dad puts a pillow over his head", "Dad nudges mom", "Dad screams ...aaaaa" };
        System.out.println(randMsg[rand.nextInt(randMsg.length)]);
    }

}
