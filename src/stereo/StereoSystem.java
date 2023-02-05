package stereo;

public class StereoSystem {
    public static void main(String[] args) {

        Song[] library = new Song[3];
        library[0] = new Song("Michael Jackson", "Beat It", "Thriller");
        library[1] = new Song("Pearl Jam", "Even Flow", "Ten");
        library[2] = new Song("Portishead", "Over", "NYC Live");

        Player[] players = {new CDPlayer(library), new MP3Player(library)};

        players[0].play();
        players[0].pause();
        players[0].play();
        players[0].stop();

        System.out.println();

        players[1].play();
        players[1].stop();
        players[1].next();
        players[1].play();
        players[1].next();
        players[1].play();
        players[1].next();
        players[1].play();
        players[1].previous();
        players[1].play();
        players[1].stop();

    }
}
