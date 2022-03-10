package taller3.musicLibrary.domain;

/**
 * esta clase representa las canciones de la biblioteca
 * 
 * Song newSong = new Song(); newSong.gerTitle;
 * 
 * @version 1.00.000 2022-03-10
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-10
 *
 */
public class Song {
	/**
	 * es el nombre de la cancion
	 */
	private String title;
	/**
	 * es el genero de la cancion
	 */
	private String genre;
	/**
	 * es la caratula de la cancion
	 */
	private String cover;
	/**
	 * es la descripcion de la cancion
	 */
	private String desciption;
	/**
	 * es la fecha de lanzamiento de la cancion
	 */
	private DateOfSong date;
	/**
	 * es la duracion de la cancion
	 */
	private double duration;
	/**
	 * es el identificador de la cancion
	 */
	private double id;

	/**
	 * este es el costructor una cancion con un solo parametro
	 * 
	 * @param titulo String es el nombre de la cancion
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-10
	 */
	public Song(String titulo) {
		this(titulo, "", "", "", null, 0.0, 0.0);

	}

	/**
	 * Este es el costructor de una cancion completo
	 * 
	 * @param title      String es el nombre de la cancion
	 * @param genre      String es el genero de la cancion
	 * @param cover      String es la caratula de la cancion
	 * @param desciption String representa una pequeña descripcion de la cancion
	 * @param date       DateOfSong representa ala fecha de lanzamiento de la
	 *                   cancion
	 * @param duration   double es la duracion de la cancion
	 * @param id         double representa a ala identificacion en el sistema de la
	 *                   cancion
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-10
	 */
	public Song(String title, String genre, String cover, String desciption, DateOfSong date, double duration,
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

	public DateOfSong getDate() {
		return date;
	}

	public void setDate(DateOfSong date) {
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
