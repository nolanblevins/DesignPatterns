package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {

    /* 
     * passes character and speed into move method in order to move character
     * @see strategy.MoveBehavior#move(java.util.ArrayList)
     */
    public void move(ArrayList<String> character) {
        move(character, 2);
    }
    
}
