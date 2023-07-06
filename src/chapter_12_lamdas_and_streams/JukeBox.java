package chapter_12_lamdas_and_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JukeBox {
    public static void main(String[] args) {
        Songs songs = new Songs();
        List<Song> songList = songs.getSongs();
        List<Song> rockSongs = songList.stream().filter(song -> song.getGenre().contains("Rock")).collect(Collectors.toList());
        List<String> genre = songList.stream().map(song -> song.getGenre()).distinct().collect(Collectors.toList());
        List<Song> result = songList.stream().sorted(Comparator.comparingInt(Song::getYear)).toList();
        result.forEach(Song -> System.out.println(Song.getTitle() + " " + Song.getYear()));

    }
}
