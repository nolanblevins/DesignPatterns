package factory;

/**
 * Nolan Blevins
 * 
 * This class is the factory class used to create the cereal.
 */
public class GroceryStore {

    /**
     * This method takes in a string that should be the name of the
     * cereal and checks that against the different cereal names.
     * When it reaches a cereal name that is the same as the passed through cereal
     * it creates a cereal object of that type.
     * 
     * @param type is the cereal type being passed through
     * @return returns the cereal thats created
     */
    public Cereal createCereal(String type) {
        Cereal cereal = null;
        if (type.equalsIgnoreCase("frosted flakes")) {
            cereal = new FrostedFlakes();
        } else if (type.equalsIgnoreCase("lucky charms")) {
            cereal = new LuckyCharms();
        } else if (type.equalsIgnoreCase("fruit loops")) {
            cereal = new FruitLoops();
        }
        return cereal;

    }

}
