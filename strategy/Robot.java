package strategy;

import java.util.ArrayList;

public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    /**
     * @param name the name of the robot
     */
    public Robot(String name) {
        this.name = name;
        this.character = new ArrayList<>();
    }

    /**
     * @param moveBehavior the move behavior of specific robot
     */
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    /**
     * calls move function in move behavior class
     */
    public void move() {
        moveBehavior.move(character);
    }

    public abstract String toString(); // abstract method utilized inside of different robot classes ex. DogRobot

    /**
     * @return returns name of robot
     */
    public String getName() {
        return this.name;
    }

}
