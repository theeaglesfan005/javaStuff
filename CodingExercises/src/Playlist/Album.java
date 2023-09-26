package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {

        if (findSong(title) != null) {
            return false;
        }
        Song newSong = new Song(title, duration);
        songs.add(newSong);
        return true;
    }

    private Song findSong(String title) {
        if(!songs.isEmpty()) {
            for (Song s : songs) {
                if (s.getTitle().equals(title)) {
                    return s;
                }
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        if (trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        }

        Song songToAdd = songs.get(trackNumber - 1);
        String songToAddTitle = songToAdd.getTitle();
        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(songToAddTitle) == 0) {
                return false;
            }
        }

        playList.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {

        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            return false;
        }

        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0)
                return false;
        }

        playList.add(songToAdd);
        return true;
    }
}
