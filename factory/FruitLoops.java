package factory;

/**
 * Nolan Blevins
 * 
 * This class is for creating the fruit loop cereal.
 * It uses the methods of the cereal class and sets the variables.
 */
public class FruitLoops extends Cereal {
    /**
     * Instantiates all of the fruit loop variables, such
     * as the name price and toys.
     */
    public FruitLoops() {
        super("Fruit Loops", 1.89);
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man Ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
    }

    /**
     * This method adds on to the cereals prepare method and
     * overrides its return.
     * 
     * @return returns the cereals prepare method plus added on steps
     */
    @Override
    public String prepare() {
        return super.prepare() + "\n" +
                "\t" + "- Gather the grain" + "\n" +
                "\t" + "- Shape into circles" + "\n" +
                "\t" + "- Randomly color the circles" + "\n" +
                "\t" + "- Let circles dry" + "\n";
    }
}
