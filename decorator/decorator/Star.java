package decorator;


public class Star extends TreeDecorator{
    private Tree tree;
    
    public Star(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        this.tree.lines = FileReader.getLines("txt/star.txt");
        integrateDecor(this.tree.lines);
        
    }
    
}
