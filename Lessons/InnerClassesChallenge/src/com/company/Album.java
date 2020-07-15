package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs; //Instantiate private inner class

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList(); //Initialize private inner class
    }

    //Add song if it exists
    public boolean addSong(String title, double duration) {
        //Return new song object from the private inner class
        return this.songs.add(new Song(title, duration));
    }

    //Add to playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        //Find song from the inner class
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //Add to playlist if song exists
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        //Find song from the inner class
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }

            this.songs.add(song);
            return true;
        }

        //Find song with the name from songs ArrayList
        private Song findSong(String title) {
            //Foreach loop in Java
            for (Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }

            return null;
        }

        //Find song with the track number from songs ArrayList
        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index > 0 && index < songs.size()) {
                return songs.get(index);
            }

            return null;
        }
    }
}
