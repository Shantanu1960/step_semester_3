package advanced_arrays.assignment_problems;

import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }

        this.songs = new String[capacity];
        this.songCount = 0;
    }

    public void addSong(String song) {
        if (songCount == songs.length) {
            System.out.println("Song rejected: playlist is full");
            return;
        }

        songs[songCount] = song;
        songCount++;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }
}