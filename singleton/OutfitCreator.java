package singleton;

import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    private ArrayList <ClothingItem> tops;
    private ArrayList <ClothingItem> bottoms;
    private ArrayList <ClothingItem> wholes;
    Random rand;
    private static OutfitCreator outfitCreator;

    private OutfitCreator() {
        this.bottoms = (FileReader.getClothing("singleton/bottoms.txt", ClothingPart.BOTTOM));
        this.tops = (FileReader.getClothing("singleton/tops.txt", ClothingPart.TOP));
        this.wholes = (FileReader.getClothing("singleton/wholes.txt", ClothingPart.WHOLE));
    }

    public static OutfitCreator getInstance(){
        if(outfitCreator == null){
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }
    public String getOutfit(Season season){
        // pick random outfit type and infdividual pieces
        String outfit = null;
        int randIndex;
        rand = new Random();
        int randomInt =  rand.nextInt(1);
        if(randomInt == 0) {
            randIndex = rand.nextInt(bottoms.size());
            outfit = bottoms.get(randIndex).toString();
            randIndex = rand.nextInt(tops.size());
            outfit += " and a "+tops.get(randIndex).toString();
        }
        else if(randomInt == 1) {
            randIndex = rand.nextInt(wholes.size());
            outfit = "a "+wholes.get(randIndex).toString();
        }
        return outfit;
        

    }

    



}

