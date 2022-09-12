
/**
 * Nolan Blevins
 * 
 * This class is constructing the star for the tree using the integrate decor
 * method
 * and an instance of tree
 */
public class Star extends TreeDecorator {
    private Tree tree;

    /**
     * This method passes through the base tree and then sets this classes tree
     * equal
     * then overwriting that with the star text file in order to add them to the
     * tree
     * 
     * @param tree is an instance of tree which contains a toString method for
     *             printing tree
     */
    public Star(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        this.tree.lines = FileReader.getLines("decorator/txt/star.txt");
        integrateDecor(this.tree.lines);

    }

}
