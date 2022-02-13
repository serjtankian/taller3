package taller3.musicLibrary.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import taller3.musicLibrary.domain.Song;

public class CreateSongMenu {
	String title, genre, cover, desciption;
	int date;
	double duration, id;

	public Song createSong() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el titulo de la cancion");
			title = br.readLine();
			System.out.println("Ingrese el genero de la cancion");
			genre = br.readLine();
			System.out.println("Ingrese el caratula de la cancion");
			cover = br.readLine();
			System.out.println("Ingrese el descripcion de la cancion");
			desciption = br.readLine();
			System.out.println("Ingrese el año de la cancion");
			date = Integer.parseInt(br.readLine()); 
			System.out.println("Ingrese el duracion en seg de la cancion");
			duration = Integer.parseInt(br.readLine());
			System.out.println("Ingrese el identificacion de la cancion");
			id = Integer.parseInt(br.readLine());
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		

		return new Song(title, genre, cover, desciption, date, duration, id);
	}
}
