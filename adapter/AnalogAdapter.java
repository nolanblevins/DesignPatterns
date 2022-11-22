package adapter;

public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
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
