package adapter;

/**
 * Nolan Blevins
 * 
 * Class to manage the adaptation from the cassett to the cd
 */
public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    /**
     * Constructor for the analog album
     * 
     * @param album is the DigitalAlbum thats being adapted
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * Method to play a song
     * 
     * @return will return the album playing the next song
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * Method to rewind the song
     * 
     * @return will return the album playing the last song
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Method to play next song
     * 
     * @return will return the albums next song
     * 
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Method to pause current song
     * 
     * @return will return that the song is paused
     */
    public String pause() {
        return album.pause();
    }

    /**
     * Method to end play session
     * 
     * @return will return that the session is stopping
     */
    public String stopEject() {
        return album.stop();
    }

}
