package observer;

/**
 * Author: Nolan Blevins
 * 
 * Observer of the baby. This class implements observer methods and
 * updates moms actions based upon the type of baby cry. Responds with different
 * action dependent
 * on type of cry.
 */
public class Mom implements Observer {
    private Subject baby;

    /**
     * registers mom as an observer of the baby
     * 
     * @param baby passes through the baby object which is the subject
     * 
     */
    public Mom(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * update method passes type of cry through and then displays the mothers
     * reaction and or action to the babies cry
     * 
     * @param cry type of cry is passed through and used to notify observers
     * 
     */
    public void update(Cry cry) {
        if (cry.equals(Cry.ANGRY)) {
            System.out.println("Mom hugs " + ((Baby) baby).getName());
            ((Baby) baby).receiveLove();

        } else if (cry.equals(Cry.HUNGRY)) {
            System.out.println("Mom feeds " + ((Baby) baby).getName());
            ((Baby) baby).eat();

        } else if (cry.equals(Cry.WET)) {
            System.out.println("Mom changes " + ((Baby) baby).getName());
            ((Baby) baby).getChanged();
        }

    }

}
