package taller3.musicLibrary.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import taller3.musicLibrary.domain.DateOfSong;
import taller3.musicLibrary.domain.Song;

/**
 * Esta clase es el menu para crear canciones
 * 
 * CreateSongMenu menu = new CreateSongMenu(); Song newSong = menu.createSong();
 * 
 * @version 1.00.001 2022-03-10
 * 
 * @author Sebastian Arias sebastian.arias4214@gmail.com
 *
 */
public class CreateSongMenu {
	/**
	 * este es el titulo que va a tener la cancion
	 */
	String title;
	/**
	 * este es el genero que va a tener la cancion
	 */
	String genre;
	/**
	 * esta es la caratula que va a tener la cancion
	 */
	String cover;
	/**
	 * esta es la descripcion que va a tener la cancion
	 */
	String desciption;
	/**
	 * esta es la Fecha De Lanzamiento que va a tener la cancion
	 */
	DateOfSong date;
	/**
	 * el año de la Fecha De Lanzamiento
	 */
	int year;
	/**
	 * el dia de la Fecha De Lanzamiento
	 */
	int day;
	/**
	 * el mes de la Fecha De Lanzamiento
	 */
	int month;
	/**
	 * esta es la duracion que va a tener la cancion
	 */
	double duration;
	/*
	 * esta es la identificacion que va atener la cancion en el sistema
	 */
	double id;
 
	/**
	 * Esta es el metodo que crea las canciones 
	 * 
	 * @return Song es la cancion nueva
	 * 
	 * @author Sebastian Arias sebastian.arias4214@gmail.com
	 * 
	 * @since 1.00.000 2022-03-10
	 */
	public Song createSong() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese el titulo de la cancion");
			title = reader.readLine();
			System.out.println("Ingrese el genero de la cancion");
			genre = reader.readLine();
			System.out.println("Ingrese el caratula de la cancion");
			cover = reader.readLine();
			System.out.println("Ingrese el descripcion de la cancion");
			desciption = reader.readLine();
			System.out.println("Ingrese el año de lanzamiento de la cancion");
			year = Integer.parseInt(reader.readLine());
			System.out.println("Ingrese el mes de lanzamiento de la cancion");
			month = Integer.parseInt(reader.readLine());
			System.out.println("Ingrese el dia de lanzamiento de la cancion");
			day = Integer.parseInt(reader.readLine());
			date = new DateOfSong(year, month, day);
			System.out.println("Ingrese el duracion en seg de la cancion");
			duration = Integer.parseInt(reader.readLine());
			System.out.println("Ingrese la identificacion de la cancion");
			id = Integer.parseInt(reader.readLine());

		} catch (Exception mistake) {
			System.out.println(mistake);
		}

		return new Song(title, genre, cover, desciption, date, duration, id);
	}
}
