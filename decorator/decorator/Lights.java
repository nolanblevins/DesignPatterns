package decorator;


public class Lights extends TreeDecorator{
    private Tree tree;
    public Lights(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        this.tree.lines = FileReader.getLines("txt/lights.txt");
        integrateDecor(this.tree.lines);

    }
    
}
