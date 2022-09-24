package iterator;

/**
 * Nolan Blevins
 * 
 * This class is the overall course class its used to create the course
 * object containing the properties for the course and make adjustments
 * to the array of assignments for the course
 */
public class Course {
    private Assignment assignments[];
    private int count;
    private String name;
    private String title;

    /**
     * This is the parameterized constructor for the course
     * its used to instantiate the courses properties
     * 
     * @param name  is the course name
     * @param title is the courses assignment title
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        this.assignments = new Assignment[5];
    }

    /**
     * This method is used to add a new assignment to the
     * array of assignments for the course. If the array is full
     * i double the size of the array and add the assignemnt
     * 
     * @param title       the title of the assignmemt
     * @param description is the description of the assignment
     * @param topic       is the topic of the assignment
     */
    public void addAssignment(String title, String description, Topic topic) {
        if (count == assignments.length) {
            assignments = growArray(assignments);
        }
        assignments[count] = new Assignment(title, description, topic);
        count++;
    }

    /**
     * This method is used to create an iterator of assignments
     * later to be utilized for iterating through the assignments
     * in the array
     * 
     * @return will return and iterator of assignments
     */
    public AssignmentIterator createIterator() {
        return new AssignmentIterator(assignments);

    }

    /**
     * this method is used to concatenate the name and title into a single string
     * 
     * @return will return the name and title of the course
     * 
     */
    public String toString() {
        return name + " " + title;

    }

    /**
     * This method will take the current array of assignments and create a temporary
     * array that is twice the length of the original array and then add the
     * original arrays
     * contents to the temporary array and then return that temporary array
     * 
     * @param first is the original array of assignments being passed through
     * @return will return the created array that is twice the length of original
     *         array
     */
    private Assignment[] growArray(Assignment[] first) {
        Assignment[] temp = new Assignment[assignments.length * 2];
        for (int i = 0; i < assignments.length; i++) {
            temp[i] = assignments[i];
        }
        return temp;

    }

}
