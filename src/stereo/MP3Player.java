package stereo;

public class MP3Player extends MusicPlayer {

    public MP3Player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3 odtwarza "+ getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("MP3 pause " + getCurrentSong() );
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop");
    }
}
