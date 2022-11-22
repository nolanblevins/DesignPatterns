package adapter;

import java.util.ArrayList;

public class Cassett implements AnalogAlbum{
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassett(ArrayList<String> songs) {
        this.songs = songs;
    }
    

    @Override
    public String play() {
        return null;
    }

    @Override
    public String rewind() {
        return null;
    }

    @Override
    public String ffwd() {
        return null;
    }

    @Override
    public String pause() {
        return null;
    }

    @Override
    public String stopEject() {
        return null;
    }

    
    
}
