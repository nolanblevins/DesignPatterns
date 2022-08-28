package strategy;

import java.util.ArrayList;

public class RunBehavior extends MoveBehavior{
    private static final int RUN_SPEED = 3;

    /* 
     * passes character and speed into move method in order to move character
     * @see strategy.MoveBehavior#move(java.util.ArrayList)
     */
    public void move(ArrayList<String> character) {
        move(character, RUN_SPEED);
    }
    
}
