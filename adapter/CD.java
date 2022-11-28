package adapter;

import java.util.ArrayList;

/**
 * Nolan Blevins
 * 
 * Class to manage the cd and its methods
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs) {
        this.songs = songs;
        currentIndex = 0;
    }

    /**
     * Method will play first song in list
     * 
     * @return will return the cd to the first song in the list
     */
    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song 1 " + songs.get(currentIndex);
    }

    /**
     * Method to play a specific song on the cd based upon its number
     * 
     * @param num is the song number the user wants to play
     * @return will return that the song the user selected is playing
     */
    public String playSong(int num) {
        if (num < 0 || num > songs.size()) {
            return "not a valid songs number";
        } else if (currentIndex == songs.size() - 1) {
            for (int i = songs.size() + 1; i > songs.size(); i--) {
                prevSong();
            }

        } else
            currentIndex = num;
        return "Playing " + currentIndex + ": " + songs.get(currentIndex - 1);
    }

    /**
     * Method to go to the previous song
     * 
     * @return will return the album playing the last song
     */
    public String prevSong() {
        if (currentIndex == 0) {
            return "at the beginning";
        }
        currentIndex -= 1;
        return "Skipping back and playing " + songs.get(currentIndex - 1);
    }

    /**
     * Method to play next song
     * 
     * @return will return the albums next song
     * 
     */
    public String nextSong() {
        if (currentIndex == songs.size()) {
            for (int i = songs.size() + 1; i > songs.size(); i--) {
                prevSong();
            }

        } else
            currentIndex += 1;
        return "Playing " + currentIndex + ": " + songs.get(currentIndex - 1);
    }

    /**
     * Method to pause current song
     * 
     * @return will return that the song is paused
     */
    public String stop() {
        return "Stopping";
    }

    /**
     * Method to end play session
     * 
     * @return will return that the session is stopping
     */
    public String pause() {
        return "Pausing";
    }

}
