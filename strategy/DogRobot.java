package strategy;
import java.util.ArrayList;

public class DogRobot extends Robot {

    public DogRobot(String name) 
    {
        super(name);
        moveBehavior = new CrawlBehavior();
        character.add("++o"); 
    }
    // prints concatenated string of robot name plus the type of robot
    public String toString()
    {
        return this.name + " is a Dog Robot";
    }
    
}
