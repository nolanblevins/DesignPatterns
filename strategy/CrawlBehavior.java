package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {

    
    public void move(ArrayList<String> character) // used by the DogRobot class for its move behavior
    {
        move(character, 1);
    }
    
}
