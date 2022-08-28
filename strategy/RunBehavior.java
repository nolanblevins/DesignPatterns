package strategy;

import java.util.ArrayList;

public class RunBehavior extends MoveBehavior{

    public void move(ArrayList<String> character) // used by the iRobot class for its move behavior
    {
        move(character, 3);

    }
    
}
