package factory;

import java.util.ArrayList;

public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys;
    
    public Cereal(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String prepare() {
        return name;

    }
    public String boxCereal()
    {
        return "Boxing"+name;
    }
    public String priceCereal()
    {
        return null;
    }
}
