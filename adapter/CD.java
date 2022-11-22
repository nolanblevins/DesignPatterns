package adapter;

import java.util.ArrayList;

public class CD implements DigitalAlbum{
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs) {
        this.songs = songs;
    }

    @Override
    public String playFromBeginning() {
        return null;
    }

    @Override
    public String playSong(int num) {
        return null;
    }

    @Override
    public String prevSong() {
        return null;
    }

    @Override
    public String nextSong() {
        return null;
    }

    @Override
    public String stop() {
        return null;
    }

    @Override
    public String pause() {
        return null;
    }
    
}
