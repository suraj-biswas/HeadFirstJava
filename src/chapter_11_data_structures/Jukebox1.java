package chapter_11_data_structures;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}
