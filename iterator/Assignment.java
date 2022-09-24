package iterator;

/**
 * Nolan Blevins
 * 
 * This class is the assignment object which will
 * belong to an array of assignments for the course
 * 
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * Parameterized constructor for the assignment, also instantiates variables for
     * the assignment object.
     * 
     * @param title       the name of the assignment
     * @param description the description of what to do for the assignment
     * @param topic       the topic of the assignment ie; Git Assignment are
     *                    assignments related to git
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;

    }

    /**
     * This method checks if the passed through topic and checks
     * if it is the same as the local topic returning true if thats
     * the case
     * 
     * @param topic is the topic being passed through, from the enumeration
     * @return will return true if the passed topic is the same as local
     */
    public boolean hasTopic(Topic topic) {
        if (topic.equals(this.topic)) {
            return true;
        }
        return false;
    }

    /**
     * this method returns a concatenated string
     * of the title and description of the assignment
     * 
     * @return a String of the title and description
     */
    public String toString() {
        return title + ": " + description;
    }
}
