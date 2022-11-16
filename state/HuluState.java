public class HuluState implements State{
    private TV tv;
    private String [] movies;
    private String [] tvShows;

    public HuluState(TV tv) {
        this.tv = tv;
        this.movies = new String[]{"Cars", "Cinderella","WALL-E","ET"};
        this.tvShows = new String[]{"Sesame Street", "Care Bears", "Looney Toons"};
    }

    @Override
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home ...";
    }

    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix ...";
    }

    @Override
    public String pressHuluButton() {
        return "You Are Already on Hulu ...";
    }

    @Override
    public String pressMovieButton() {
        String ret = "\nHulu Movies: \n";
        for(int i = 0; i < movies.length; i++) {
            ret += "- " + movies[i] + "\n";
        }
        return ret;
    }

    @Override
    public String pressTVButton() {
        String ret = "\nHulu TV Shows: \n";
        for(int i = 0; i < tvShows.length; i++) {
            ret += "- " + tvShows[i] + "\n";
        }
        return ret;
    }
    
}
