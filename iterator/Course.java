package iterator;


public class Course {
    private Assignment assignments[];
    private int count;
    private String name;
    private String title;
    public Course(String name, String title){
        this.name = name;
        this.title = title;
        assignments = new Assignment[];

    }
    public void addAssignment(String title, String description, Topic topic){

    }
    public AssignmentIterator createIterator(){

    }
    public String toString(){

    }
    private Assignment[] growArray(Assignment[] first){
        return first;

    }
    
}
