
/**
 * Nolan Blevins
 * 
 * This class is representative of the home screen on a TV where nothing is
 * viewed.
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Parameterized constructor
     * 
     * @param tv is the current TV object
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Method to represent when the home button is pressed on the home screen
     * 
     * @return will return that the tv is on the home screen
     */

    public String pressHomeButton() {
        return "You Are Already at the Home Screen ...\n";
    }

    /**
     * Method to represent when the netflix button is pressed on home screen, will
     * change state to netflix
     * 
     * @return will return that netflix is loading
     */
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix ...";
    }

    /**
     * Method to represent when the hulu button is pressed on home screen, will
     * change state to hulu
     * 
     * @return will return that hulu is loading
     */
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu ...";
    }

    /**
     * Method representing the movie button on home screen, nothing will happen.
     * 
     * @return will return that there are no movies
     */
    public String pressMovieButton() {
        return "There are NO Movies on the home screen";
    }

    /**
     * Method representing the tv show button on home screen, nothing will happen.
     * 
     * @return will return that there are no tv shows
     */
    public String pressTVButton() {
        return "There are NO TV Shows on the home screen ...";
    }

}
