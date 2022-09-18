package factory;

/**
 * Nolan Blevins
 * 
 * This class is for creating the lucky charms cereal.
 * It uses the methods of the cereal class and sets the variables.
 */
public class LuckyCharms extends Cereal {
    /**
     * Instantiates all of the lucky charms variables, such
     * as the name price and toys.
     */
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys.add("My Little Pony Stickers");
        toys.add("Elsa Ring");
        toys.add("Play doe");
        toys.add("Tiny Truck");
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
                "\t" + "- Shape into X's and O's" + "\n" +
                "\t" + "- Create Marshmallow shapes" + "\n" +
                "\t" + "- Mix grain and Marshmallows" + "\n";
    }

}
