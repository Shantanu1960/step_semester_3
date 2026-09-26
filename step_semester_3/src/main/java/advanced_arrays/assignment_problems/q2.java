package advanced_arrays.assignment_problems;

import java.util.Arrays;

public class q2 {

    public static void main(String[] args) {
        Playlist playlist = new Playlist(10);
        playlist.addSong("Song A");
        playlist.addSong("Song B");

        String[] songs = playlist.getSongs();
        System.out.println("Songs: " + Arrays.toString(songs));
        System.out.println("Song count: " + playlist.getSongCount());

        songs[0] = "Hacked";
        System.out.println("Playlist after changing copy: " + Arrays.toString(playlist.getSongs()));
    }
}