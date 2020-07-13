package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //Add song if it exists
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    //Find song from songs ArrayList
    private Song findSong(String title) {
        //Foreach loop in Java
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }

        return null;
    }

    //Add to playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //Add to playlist if song exists
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
