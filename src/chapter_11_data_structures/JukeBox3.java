package chapter_11_data_structures;

import java.util.*;

public class JukeBox3 {
    public static void main(String[] args) {
        new JukeBox3().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
//        Collections.sort(songList);
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

//        Set<SongV3> songSet = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
//        songSet.addAll(songList);
//        System.out.println(songSet);
    }
}
