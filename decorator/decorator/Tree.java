package decorator;

import java.util.ArrayList;

public abstract class Tree {
    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }
    public String toString()
    {
        String treeString = new String();
        for(int i = 0; i < lines.size(); i++) {
            treeString += lines.get(i)+ "\n";
        }
        return treeString;
        
    } 
}
