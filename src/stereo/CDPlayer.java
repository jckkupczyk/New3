package stereo;

public class CDPlayer extends MusicPlayer{

    public CDPlayer(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("CD odtwarza " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("CD pause " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("CD stop");
    }
}
