package factory;

/**
 * Nolan Blevins
 * 
 * This class is for creating the frosted flake cereal.
 * It uses the methods of the cereal class and sets the variables.
 */
public class FrostedFlakes extends Cereal {
    /**
     * Instantiates all of the frosted flake variables, such
     * as the name price and toys.
     */
    public FrostedFlakes() {
        super("Frosted Flakes", 2.99);
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");

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
                "\t" + "- Shape into flakes" + "\n" +
                "\t" + "- Sprinkle with frosting" + "\n";
    }
}
