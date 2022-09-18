package factory;

import java.util.ArrayList;

/**
 * Nolan Blevins
 * 
 * This class is the cereal object which contains a few methods utilized by the
 * different cereals such as Frosted Flakes. Its also used to create the base
 * cereal and
 * instantiate some of its properties.
 */
public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys;

    /**
     * This is a parameterized constructor used to instantiate variables.
     * 
     * @param name  name of the cereal
     * @param price price of the cereal
     */
    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
        toys = new ArrayList<>();

    }

    /**
     * This method returns the preparation of cereal, and is
     * added onto by the different cereal types.
     * 
     * @return returns a String for the prepartion of cereal.
     */
    public String prepare() {
        return "Preparing the " + name;

    }

    /**
     * This method randomly selects a toy, returns the name of cereal and that its
     * being boxed, returns that pictures are being added, the cereal is poured in
     * and that a random toy is added.
     * 
     * @return returns a String for the boxing of cereal.
     */
    public String boxCereal() {
        int index = (int) (Math.random() * toys.size());
        return "Boxing" + name + "\n" +
                "\t" + "- Drawing fun pictures of " + name + " on the box" + "\n" +
                "\t" + "- Pouring the " + name + " into the box" + "\n" +
                "\t" + "- adding the surprise " + toys.get(index) + "\n";
    }

    /**
     * This method returns the price of the cereal and that its being added
     * to the named cereal.
     * 
     * @return returns a string containing the price and being added to the box
     */
    public String priceCereal() {
        return "Putting the price tag of " + price + " on the " + name + " box" + "\n";
    }
}
