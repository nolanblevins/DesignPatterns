package iterator;

import java.util.Iterator;;

/**
 * Nolan Blevins
 * 
 * this class is the iterator class which is used to iterate through
 * assignments and eventually display the assignments matching a specific topic
 */
public class AssignmentIterator implements Iterator {
    private Assignment[] assignments;
    private int position;

    /**
     * method is used to instantiate the assignment array
     * 
     * @param assignments is the list of assignments for a course and or topic
     */
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }

    /**
     * This Method is used to determine if the assignments array has a next index
     * by checking if the position is less than the length of the array and the last
     * possible
     * index is null
     * 
     * @return will return true if the assignments array has a next index
     * 
     */
    public boolean hasNext() {
        return position < assignments.length && assignments[position] != null;
    }

    /**
     * This method is used to move to the next index in the array
     * 
     * @return will return the assignment with an incremented position if the next
     *         is not null if the next is null it will return null
     */
    public Assignment next() {
        if (!hasNext())
            return null;
        return assignments[position++];
    }

}
