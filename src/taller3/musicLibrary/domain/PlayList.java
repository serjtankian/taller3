package taller3.musicLibrary.domain;

import java.util.ArrayList;

public class PlayList {
	String name;
	ArrayList<Song> songs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	
	
	
}
