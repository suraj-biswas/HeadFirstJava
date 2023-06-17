package chapter_11_data_structures;

public class SongV3 implements Comparable<SongV3>{
    private String title;
    private String artist;
    private int bpm;

    public SongV3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return  title;
    }

    @Override
    public int compareTo(SongV3 o) {
       return title.compareTo(o.toString());
    }
}
