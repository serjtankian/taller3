package taller3.musicLibrary.domain;

/**
 * esta es la clase que va contener la fecha de lanzamiento de las canciones 
 * DateOfSong newDate = new DateOfSong()
 * 
 * @version 1.00.000 2022-03-09
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 *
 *	@since 1.00.000 2022-03-09
 */
public class DateOfSong   {
	/**
	 * representa el año de la salida de la cancion
	 */
	private int year;
	/**
	 * representa al mes de la salida de la cancion
	 */
	private int month;
	/**
	 * representa al dia de la salida de la cancion
	 */
	private int day;
	
	
	/**
	 * este es el costructor de la fecha de lanzamiento de la cancion 
	 * 
	 * @param year int representa al año de la cancion 
	 * @param month int representa al mes de la cancion 
	 * @param day int representa al dia de la cancion 
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-09
	 */
	public DateOfSong(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	

}
