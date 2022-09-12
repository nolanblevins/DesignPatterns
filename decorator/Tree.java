
import java.util.ArrayList;

/**
 * Nolan Blevins
 * 
 * This is the base tree class, its utilized to concatenate the array list
 * for the tree into a string for printing
 */
public abstract class Tree {
    protected ArrayList<String> lines;

    /**
     * This method is the constructor in order ro make the tree and add values to it
     * 
     * @param lines is an arrayList of the tree where each index is a single line
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    /*
     * This method takes the tree array list and loops through adding each index to
     * a string and the returns the final string
     * 
     */
    public String toString() {
        String treeString = new String();
        for (int i = 0; i < lines.size(); i++) {
            treeString += lines.get(i) + "\n";
        }
        return treeString;

    }
}
