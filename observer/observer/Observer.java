package observer;

/**
 * Author: Nolan Blevins
 * 
 * This interface is used by the two observers, mom and dad. The interface
 * is used to update the observers.
 */
public interface Observer {
    public void update(Cry cry);
}
