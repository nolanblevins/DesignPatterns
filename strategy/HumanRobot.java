package strategy;
import java.util.ArrayList;


public class HumanRobot extends Robot {

    public HumanRobot(String name) 
    {
        super(name);
        moveBehavior = new WalkBehavior();
        character.add(0," O");
        character.add(1,"-|-");
        character.add(2,"/ \\");
    }
    // prints concatenated string of robot name plus the type of robot
    public String toString() 
    {
        return this.name + " is a Human Robot";
    }
    
}
