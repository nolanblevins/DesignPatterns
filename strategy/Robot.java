package strategy;

import java.util.ArrayList;

public abstract class Robot 
{
    public String name;
    public ArrayList<String> character;
    public MoveBehavior moveBehavior;

    public Robot(String name)
    {
        this.name = name;
        this.character = new ArrayList<>();
    }
    public void setMoveBehavior(MoveBehavior moveBehavior)
    {
        this.moveBehavior = moveBehavior;
    }
    public void move()
    {
        moveBehavior.move(character);
    }
    public abstract String toString(); // abstract method utilized inside of different robot classes ex. DogRobot
    
    public String getName()
    {
        return this.name;
    }
    
}
