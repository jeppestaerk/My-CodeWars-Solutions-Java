package kata.kyu6;

public class Dubstep {
    public static String songDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}
