package strategy;
import java.util.ArrayList;


public class iRobot extends Robot {

    public iRobot(String name) 
    {
        super(name);
        moveBehavior = new RunBehavior();
        character.add(0,"( )");
        character.add(1,">|<");
        character.add(2,"/ \\");
    }
    // prints concatenated string of robot name plus the type of robot
    public String toString() 
    {
        return this.name + " is an iRobot";
    }
    
    
}
