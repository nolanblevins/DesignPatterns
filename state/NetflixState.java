public class NetflixState implements State{
    private TV tv;
    private String[] movies;
    private String [] tvShows;

    public NetflixState(TV tv) {
        this.tv = tv;
        this.movies = new String[]{"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
        this.tvShows = new String[]{"Peppa Pig","My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};
    }

    @Override
    public String pressHomeButton() {
        tv.setState(tv.getHomeState());
        return "Loading Home ...";
    }

    @Override
    public String pressNetflixButton() {
        return "You are Already on Netflix";
    }

    @Override
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu ...";
        
    }

    @Override
    public String pressMovieButton() {
        String ret = "\nNetflix Movies: \n";
        for(int i = 0; i < movies.length; i++) {
            ret += "- " + movies[i] + "\n";
        }
        return ret;
    }

    @Override
    public String pressTVButton() {
        String ret = "\nNetflix TV Shows: \n";
        for(int i = 0; i < tvShows.length; i++) {
            ret += "- " + tvShows[i] + "\n";
        }
        return ret;
    }
    
}
