package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {
    private static final int WALK_SPEED = 2;

    /* 
     * passes character and speed into move method in order to move character
     * @see strategy.MoveBehavior#move(java.util.ArrayList)
     */
    public void move(ArrayList<String> character) {
        move(character, WALK_SPEED);
    }
    
}
