
/**
 * Nolan Blevins
 * 
 * Class to represent the netflix area of the TV
 */
public class NetflixState implements State {
    private TV tv;
    private String[] movies;
    private String[] tvShows;

    /**
     * Parameterized constructor
     * 
     * @param tv is the current TV object
     */
    public NetflixState(TV tv) {
        this.tv = tv;
        this.movies = new String[] { "The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age" };
        this.tvShows = new String[] { "Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles" };
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
     * Method to represent the press of the netflix button while on netflix
     * 
     * @return will return that the user is alreay on netflix
     */
    public String pressNetflixButton() {
        return "You are Already on Netflix";
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
     * Method to represent the press of the movie button for a tv
     * 
     * @return will return the movies on netflix
     */
    public String pressMovieButton() {
        String ret = "\nNetflix Movies: \n";
        for (int i = 0; i < movies.length; i++) {
            ret += "- " + movies[i] + "\n";
        }
        return ret;
    }

    /**
     * Method to represent the press of the tv show button for a tv
     * 
     * @return will return the shows on netflix
     */
    public String pressTVButton() {
        String ret = "\nNetflix TV Shows: \n";
        for (int i = 0; i < tvShows.length; i++) {
            ret += "- " + tvShows[i] + "\n";
        }
        return ret;
    }

}
