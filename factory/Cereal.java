package factory;

import java.util.ArrayList;

public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys;
    
    public Cereal(String name, double price){
        this.name = name;
        this.price = price;
        toys = new ArrayList<>();
        
    }
    public String prepare() {
        return "Preparing the "+name;

    }
    public String boxCereal()
    {
        int index = (int)(Math.random()* toys.size());
        return "Boxing"+name+"\n"+
        "\t"+"- Drawing fun pictures of "+name+" on the box"+"\n"+
        "\t"+"- Pouring the "+name+" into the box"+"\n"+
        "\t"+"- adding the surprise "+toys.get(index)+"\n";
    }
    public String priceCereal()
    {
        return "Putting the price tag of "+price+" on the "+name+" box"+"\n";
    }
}
