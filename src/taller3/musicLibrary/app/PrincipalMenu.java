package taller3.musicLibrary.app;

import java.util.ArrayList;
import java.util.Scanner;

import sun.net.www.content.text.plain;
import taller3.musicLibrary.domain.PlayList;
import taller3.musicLibrary.domain.Song;

public class PrincipalMenu {

	private PlayList playListDefault = new PlayList();
	private ArrayList<Song> songs = new ArrayList<Song>();
	private ArrayList<PlayList> listPlayList = new ArrayList<PlayList>();

	public void begins() {
		int option;
		Scanner scan = new Scanner(System.in);
		playListDefault.setName("default");

		boolean exit = false;
		while (!exit) {

			System.out.println("1. Crear cancion");
			System.out.println("2. Crear Playlist");
			System.out.println("3. Mostrar lista de Playlist");
			System.out.println("4. Mostrar Canciones por default");
			System.out.println("5. Filtar o ordenar una Playlist");
			System.out.println("6. Salir");
			option = scan.nextInt();

			switch (option) {
			case 1:

				CreateSongMenu menuSong = new CreateSongMenu();

				// aqui se produce un error del Scanner
				songs.add(menuSong.createSong());

				System.out.println("Cancion Guardada");

				break;
			case 2:
				CreatePlayListMenu menuPlayList = new CreatePlayListMenu(songs);
				//No testeado 
				listPlayList.add(menuPlayList.createPlayList());
				
				System.out.println("PlayList Guardada");

				break;
			case 3:
				//no testeado
				listPlayList.stream().forEach(x -> System.out.println(x.getName()));
				break;
			case 4:
				playListDefault.setSongs(songs);
				if (playListDefault.getSongs().isEmpty()) {
					System.out.println("Ops No hay canciones en la lista default ");
				} else {
					listingSongs();
				}
				break;
			case 5 :
				
				break;
			case 6:
				exit = true;
				break;
			default:
				System.out.println("debes elegir una opcion de 1-4");
				break;
			}

		}
		scan.close();
	}

	public void listingSongs() {

		playListDefault.setSongs(songs);
		playListDefault.getSongs().stream()
				.forEach((n) -> System.out.println(n.getTitle() + " " + n.getGenre() + " " + n.getCover() + " "
						+ n.getDesciption() + " " + n.getDate() + " " + n.getDuration() + " " + n.getId()));
	}
}