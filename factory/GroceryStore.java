package factory;

public class GroceryStore {

    public Cereal createCereal(String type){
        Cereal cereal = null;
        if(type.equalsIgnoreCase("frosted flakes")){
            cereal = new FrostedFlakes();
        }else if(type.equalsIgnoreCase("lucky charms")){
            cereal = new LuckyCharms();
        }else if(type.equalsIgnoreCase("fruit loops")){
            cereal = new FruitLoops();
        }
        return cereal;
        
    }
    
}
