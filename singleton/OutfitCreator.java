package singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Nolan Blevins
 * 
 * This class is used to create outfits based upon the season.
 * Inside of the class there is a method to create the outfit and only a single
 * instance of the object can be created at a time.
 */
public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    Random rand;
    private static OutfitCreator outfitCreator;

    /**
     * This method calls the file reader class in order to populate the arraylists
     * of specific clothing articles using text files.
     */
    private OutfitCreator() {
        this.bottoms = (FileReader.getClothing("singleton/bottoms.txt", ClothingPart.BOTTOM));
        this.tops = (FileReader.getClothing("singleton/tops.txt", ClothingPart.TOP));
        this.wholes = (FileReader.getClothing("singleton/wholes.txt", ClothingPart.WHOLE));
    }

    /**
     * This method allows for the OutfitCreator to only have one instance created at
     * a time.
     * 
     * @return will return an instance of the outfit creator as long as one is not
     *         already created
     */
    public static OutfitCreator getInstance() {
        if (outfitCreator == null) {
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }

    /**
     * This method takes an input of season then randomly decides between a top and
     * bottom outfit or a whole outfit with a 50% of each.
     * Then it randomly picks pieces of clothing. If that clothing article fits the
     * season it adds it to the outfit. If it doesnt fit the season it picks
     * a different article in that list until the outfit is created. The outfit is
     * then returned.
     * 
     * @param season is the season that the created outfit must be appropriate for
     * @return will return a string of the created outfit
     */
    public String getOutfit(Season season) {
        String outfit = null;
        int randIndex;
        rand = new Random();
        int randomInt = rand.nextInt(2);

        if (randomInt == 0) {
            randIndex = rand.nextInt(bottoms.size());
            while (!bottoms.get(randIndex).hasSeason(season)) {
                randIndex = rand.nextInt(bottoms.size());
            }
            outfit = bottoms.get(randIndex).toString();

            randIndex = rand.nextInt(tops.size());
            while (!tops.get(randIndex).hasSeason(season)) {
                randIndex = rand.nextInt(tops.size());
            }
            outfit += " and a " + tops.get(randIndex).toString();
        } else if (randomInt == 1) {
            randIndex = rand.nextInt(wholes.size());
            while (!wholes.get(randIndex).hasSeason(season)) {
                randIndex = rand.nextInt(wholes.size());
            }
            outfit = "a " + wholes.get(randIndex).toString();
        }
        return outfit;
    }

}
