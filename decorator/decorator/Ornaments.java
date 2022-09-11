package decorator;



public class Ornaments extends TreeDecorator{
    private Tree tree;

    public Ornaments(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        this.tree.lines = FileReader.getLines("txt/ornaments.txt");
        integrateDecor(this.tree.lines);        
    }
    
}
