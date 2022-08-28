package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {

    public void move(ArrayList<String> character) // used by the HumanRobot class for its move behavior
    {
        move(character, 2);

    }
    
}
