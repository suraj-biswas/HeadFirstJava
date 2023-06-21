package chapter_11_data_structures;

        import chapter_7_better_living_in_objectville.Dog;

        import java.util.*;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        Set<SongV3> songSet = new HashSet<>(songList);
        System.out.println(songSet);
        songList = new ArrayList<>(songSet);
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);

        // If an interface has only one method that needs to implemented , we don't need to make another class
        // rather we can use lambda expression
//        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
//        System.out.println(songList);
    }
}
