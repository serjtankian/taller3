package taller3.musicLibrary.app;

import java.util.Scanner;
import taller3.musicLibrary.domain.Song;

public class CreateSongMenu {
	String title, genre, cover, desciption;
	int date;
	double duration, id;

	public Song createSong() {

		Scanner scanSong = new Scanner(System.in);

		System.out.println("Ingrese el titulo de la cancion");
		title = scanSong.nextLine();
		System.out.println("Ingrese el genero de la cancion");
		genre = scanSong.nextLine();
		System.out.println("Ingrese el caratula de la cancion");
		cover = scanSong.nextLine();
		System.out.println("Ingrese el descripcion de la cancion");
		desciption = scanSong.nextLine();
		System.out.println("Ingrese el año de la cancion");
		date = scanSong.nextInt();
		System.out.println("Ingrese el duracion en seg de la cancion");
		duration = scanSong.nextDouble();
		System.out.println("Ingrese el identificacion de la cancion");
		id = scanSong.nextDouble();
		scanSong.close();
		Song song = new Song(title, genre, cover, desciption, date, duration, id);

		return song;
	}
}
