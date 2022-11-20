
/**
 * Nolan Blevins
 * 
 * Class to represent the hulu application on a tv
 */
public class HuluState implements State {
    private TV tv;
    private String[] movies;
    private String[] tvShows;

    /**
     * Parameterized constructor
     * 
     * @param tv is the current TV object
     */
    public HuluState(TV tv) {
        this.tv = tv;
        this.movies = new String[] { "Cars", "Cinderella", "WALL-E", "ET" };
        this.tvShows = new String[] { "Sesame Street", "Care Bears", "Looney Toons" };
    }

    /**
     * Method will set state to home
     * 
     * @return will return that home is loading
     */
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home ...";
    }

    /**
     * Method will set state to netflix
     * 
     * @return will return that netflix is loading
     */
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix ...";
    }

    /**
     * Method will inform user that we are already on hulu
     * 
     * @return that the user is already on hulu
     */
    public String pressHuluButton() {
        return "You Are Already on Hulu ...";
    }

    /**
     * Method to represent the press of the movie button for a tv
     * 
     * @return will return the movies on hulu
     */
    public String pressMovieButton() {
        String ret = "\nHulu Movies: \n";
        for (int i = 0; i < movies.length; i++) {
            ret += "- " + movies[i] + "\n";
        }
        return ret;
    }

    /**
     * Method to represent the press of the tv show button for a tv
     * 
     * @return will return the shows on hulu
     */
    public String pressTVButton() {
        String ret = "\nHulu TV Shows: \n";
        for (int i = 0; i < tvShows.length; i++) {
            ret += "- " + tvShows[i] + "\n";
        }
        return ret;
    }

}
