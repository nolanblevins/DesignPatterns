
import java.util.ArrayList;

/**
 * Nolan Blevins
 * 
 * This class is used to decorate the tree with various
 * decorations such as lights or a star
 */
public abstract class TreeDecorator extends Tree {
    /**
     * This method is the constructor which calls super and
     * the tree constructor
     * 
     * @param lines is an array list where each index is a single line of a tree
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);

    }

    /**
     * This method takes an array list of decor and converts that
     * as well as an array list of lines (the base tree) into a character
     * array for each index of the array list we then loop through the original
     * arraylist where each
     * loop is a single index of the original array list then we loop through the
     * char array and
     * each index of the arrays first checking if the values are not equal
     * then if they arent equal we check if the line array is an empty space in that
     * index
     * if the index is an empty space the index in lines is replaced by the index of
     * decor
     * that entire array is then converted back into a string and replaces the
     * orginal looped index of lines
     * 
     * @param decor is an array list of decor used to add decorations to the tree
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for (int j = 0; j < decor.size(); j++) {
            char[] tempDecor = decor.get(j).toCharArray();
            char[] tempLine = lines.get(j).toCharArray();
            for (int k = 0; k < tempLine.length; k++) {
                if (tempDecor[k] != tempLine[k])
                    ;
                {
                    if (tempLine[k] == ' ') {
                        tempLine[k] = tempDecor[k];
                    }
                }

            }
            String finalLine = String.valueOf(tempLine);

            lines.set(j, finalLine);
        }

    }

}
