package singleton;

import java.util.ArrayList;

/**
 * Nolan Blevins
 * 
 * This class is used to create the object of clothing item
 * and contains methods to help create the item with the season enum
 * 
 */
public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    /**
     * Parameterized constructor for the clothing items.
     * 
     * @param name  is the name of the article of clothing
     * @param part  is the type of clothing article ie; top, bottom or whole
     * @param color is the color of the clothing article
     */
    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<>();

    }

    /**
     * This method is used to check whether the article of clothing is appropriate
     * for the passed season
     * 
     * @param season is an enumeration of seasons and is used to determine the
     *               appropriateness of an article of clothing dependent on the
     *               season
     * @return will return true if the clothing article has the season being passed
     *         through
     */
    public boolean hasSeason(Season season) {
        if (seasons.contains(season)) {
            return true;
        }
        return false;

    }

    /**
     * This method is used to add the appropriate seasons to the article of clothinh
     * using the enum and the boolean method of hasSeasons which returns true if the
     * article of clothing has that season
     * 
     * @param season is an enumeration of seasons used to check the appropriateness
     *               of an article of clothing dependent on the season
     */
    public void addSeason(Season season) {
        seasons.add(season);

    }

    /**
     * This method is a toString returning a concatenated version of the clothing
     * articles properties
     * 
     * @return will return the color and then name of the clothing article
     */
    public String toString() {
        return color + " " + name;

    }

}
