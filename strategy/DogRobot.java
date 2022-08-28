package strategy;

public class DogRobot extends Robot {

    /**
     * Sets DogRobot values
     * 
     * @param name         The name of the robot
     * @param character    The displayed character
     * @param moveBehavior calls designated behvior for robot
     */
    public DogRobot(String name) {
        super(name);
        moveBehavior = new CrawlBehavior();
        character.add("++o");
    }

    // prints concatenated string of robot name plus the type of robot
    public String toString() {
        return this.name + " is a Dog Robot";
    }

}
