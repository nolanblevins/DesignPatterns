
/**
 * Nolan Blevins
 * 
 * Class representing the TV and all of its different options
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    /**
     * Constructor for the Tv which sets
     * the states and the default state to home
     */
    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);

        state = HomeState;
    }

    /**
     * Method to represent the press of the TV show button
     * 
     * @return return the current state and the press of the tv show button in that
     *         state
     */
    public String pressTVButton() {
        return state.pressTVButton();
    }

    /**
     * Method to represent the press of home button
     * 
     * @return return the current state and the press of the home button in that
     *         state
     */
    public String pressHomeButton() {
        return state.pressHomeButton();
    }

    /**
     * Method to represent the press of the Hulu Button
     * 
     * @return return the current state and the press of the hulu button in that
     *         state
     */
    public String pressHuluButton() {
        return state.pressHuluButton();
    }

    /**
     * Method to represent the press of the movie button
     * 
     * @return return the current state and the press of the movie button in that
     *         state
     */
    public String pressMovieButton() {
        return state.pressMovieButton();
    }

    /**
     * Method to represent the press of the Netflix button
     * 
     * @return return the current state and the press of the netflix button in that
     *         state
     */
    public String pressNetflixButton() {
        return state.pressNetflixButton();
    }

    /**
     * Method to set the state
     * 
     * @param state is the state that the tv is on
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Getter for home state
     * 
     * @return the home state
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * Getter for netflix state
     * 
     * @return the netflix state
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * Getter for hulu state
     * 
     * @return the hulu state
     */
    public State getHuluState() {
        return HuluState;
    }

}
