package factory;

public class LuckyCharms extends Cereal{
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys.add("My Little Pony Stickers");
        toys.add("Elsa Ring");
        toys.add("Play doe");
        toys.add("Tiny Truck");
    }
    @Override
    public String prepare() {
        return super.prepare()+"\n"+
        "\t"+"- Gather the grain"+"\n"+
        "\t"+"- Shape into X's and O's"+"\n"+
        "\t"+"- Create Marshmallow shapes"+"\n"+
        "\t"+"- Mix grain and Marshmallows"+"\n";
    }

    
    
    
}
