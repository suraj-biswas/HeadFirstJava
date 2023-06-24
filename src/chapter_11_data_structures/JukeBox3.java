package chapter_11_data_structures;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JukeBox3 {
    public static void main(String[] args) {
        new JukeBox3().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        Set<SongV3> songSet = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
        songSet.addAll(songList);
        System.out.println(songSet);
    }
}
