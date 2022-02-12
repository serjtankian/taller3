package taller3.musicLibrary.domain;

import java.util.ArrayList;

public class PlayList {
	private String name;
	private ArrayList<Song> songs =  new ArrayList<Song>() ;

	
	
	public PlayList(String name, ArrayList<Song> songs) {
		this.name = name;
		this.songs = songs;
	}
	
	public PlayList() {
		this.name="";
		this.songs=null;
	}

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
