package factory;

public class FrostedFlakes extends Cereal {
    public FrostedFlakes() {
        super("Frosted Flakes", 2.99);
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");

    }
    @Override
    public String prepare() {
        return super.prepare();
    }
}
