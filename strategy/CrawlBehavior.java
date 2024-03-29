package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {
    private static final int CRAWL_SPEED = 1;

    /*
     * passes character and speed into move method in order to move character
     * 
     * @see strategy.MoveBehavior#move(java.util.ArrayList)
     */
    public void move(ArrayList<String> character) {
        move(character, CRAWL_SPEED);
    }

}
