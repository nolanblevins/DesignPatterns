package observer;
/**
 * Author: Nolan Blevins
 * 
 * implemented by baby class. The subject interface is what is used to control the
 * observers, whether it be removing adding or notifying.
 */

/**
 * Interface methods are used for actions on observers and is implemeted in
 * baby class.
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver(Cry cry);
}
