public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {
        this.tv = tv;
    }

    @Override
    public String pressHomeButton() {
        return "You Are Already at the Home Screen ...\n";
    }

    @Override
    public String pressNetflixButton() {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix ...";
    }

    @Override
    public String pressHuluButton() {
        tv.setState(tv.getHuluState());
        return "Loading Hulu ...";
    }

    @Override
    public String pressMovieButton() {
        return "There are NO Movies on the home screen";
    }

    @Override
    public String pressTVButton() {
        return "There are NO TV Shows on the home screen ...";
    }

}
