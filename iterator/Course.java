package iterator;


public class Course {
    private Assignment assignments[];
    private int count;
    private String name;
    private String title;
    public Course(String name, String title){
        this.name = name;
        this.title = title;
        assignments = new Assignment[1];

    }
    public void addAssignment(String title, String description, Topic topic){
        if(count == assignments.length){
            assignments = growArray(assignments);
        }
        assignments[count] = new Assignment(title, description, topic);
        count++;
    }
    public AssignmentIterator createIterator(){
        return new AssignmentIterator(assignments);

    }
    public String toString(){
        return name+" "+title;

    }
    private Assignment[] growArray(Assignment[] first){
         Assignment[] temp = new Assignment[assignments.length*2];
         for(int i = 0; i < assignments.length; i++){
            temp[i] = assignments[i];
         }
         return temp;

    }
    
}
