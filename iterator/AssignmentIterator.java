package iterator;
import java.util.Iterator;;


public class AssignmentIterator implements Iterator{
    private Assignment[] assignments;
    private int position;

    public AssignmentIterator(Assignment[] assignments){
        this.assignments = assignments;
    }
    public boolean hasNext(){
       return position < assignments.length && assignments[position] !=null;
    }
    public Assignment next(){
        if(!hasNext()) return null;
         return assignments[++position]; 

    }
    
}
