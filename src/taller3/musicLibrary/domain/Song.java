package taller3.musicLibrary.domain;

import java.util.Calendar;

public class Song {
	private String title, genre, cover,desciption;
	private Calendar date;
	private double duration, id;
	
	
	
	public Song(String titulo) {
		this.title = titulo;
		this.genre = "";
		this.cover = "";
		this.desciption = "";
		this.date = null;
		this.duration = 0.0;
		this.id = 0.0;
	}



	public Song(String title, String genre, String cover, String desciption, Calendar date, double duration,
			double id) {
		super();
		this.title = title;
		this.genre = genre;
		this.cover = cover;
		this.desciption = desciption;
		this.date = date;
		this.duration = duration;
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getCover() {
		return cover;
	}



	public void setCover(String cover) {
		this.cover = cover;
	}



	public String getDesciption() {
		return desciption;
	}



	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}



	public Calendar getDate() {
		return date;
	}



	public void setDate(Calendar date) {
		this.date = date;
	}



	public double getDuration() {
		return duration;
	}



	public void setDuration(double duration) {
		this.duration = duration;
	}



	public double getId() {
		return id;
	}
	
	
	
	
	
	
}