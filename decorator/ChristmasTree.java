
public class ChristmasTree extends Tree {

    /**
     * Nolan Blevins
     * 
     * This class uses the super to call file reader and pass the text from
     * the file through in order to make the christmas tree
     */
    public ChristmasTree() {
        super(FileReader.getLines("decorator/txt/tree.txt"));

    }

}
