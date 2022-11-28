package adapter;

import java.util.ArrayList;

/**
 * Nolan Blevins
 * 
 * Class for the management of the casset and its methods
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Constructor for Cassett
     * 
     * @param songs is the arraylist of songs for cassett
     */
    public Cassett(ArrayList<String> songs) {
        this.songs = songs;
        currentIndex = 0;
    }

    /**
     * Method to play a song
     * 
     * @return will return the album playing the next song
     */
    public String play() {

        if (currentIndex == songs.size()) {
            return "at the end of the cassete you need to rewind";

        } else
            currentIndex += 1;
        return "playing song " + (currentIndex) + ": " + songs.get(currentIndex - 1);
    }

    /**
     * Method to rewind the song
     * 
     * @return will return the album playing the last song
     */
    public String rewind() {
        if (currentIndex == 0) {
            return "Fully re-wound";
        } else
            currentIndex = currentIndex - 1;
        return "Rewinding to song number " + (currentIndex + 1);
    }

    /**
     * Method to play next song
     * 
     * @return will return the albums next song
     * 
     */
    public String ffwd() {
        if (currentIndex == songs.size() - 1) {
            return "Forwarded to the end of the cassette";
        } else if (currentIndex == songs.size()) {
            return "At the end of the cassette you need to rewind";
        } else
            currentIndex += 1;
        return "Forward to song " + (currentIndex + 1);
    }

    /**
     * Method to pause current song
     * 
     * @return will return that the song is paused
     */
    public String pause() {
        return "Pausing...";
    }

    /**
     * Method to end play session
     * 
     * @return will return that the session is stopping
     */
    public String stopEject() {
        return "Stopping cassete and ejecting";
    }

}
