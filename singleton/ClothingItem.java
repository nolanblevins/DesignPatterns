package singleton;

import java.util.ArrayList;


public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList<>();
        

    }
    public boolean hasSeason(Season season) {
        if(season == Season.FALL || season == Season.WINTER || season == Season.SPRING || season ==Season.SUMMER){
            return true;
        }
        return false;

    }
    public void addSeason(Season season) {
        if(hasSeason(season)){
            seasons.add(season);
        }

    }
    public String toString() {
        return color+" "+name;

    }
    

}
