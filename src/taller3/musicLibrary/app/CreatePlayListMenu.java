package taller3.musicLibrary.app;

import java.util.ArrayList;
import java.util.Scanner;

import taller3.musicLibrary.domain.PlayList;
import taller3.musicLibrary.domain.Song;

public class CreatePlayListMenu {
	private String name;
	private int option;
	private ArrayList<Song> songs, playListDefault = new ArrayList<Song>();

	public CreatePlayListMenu(ArrayList<Song> playListDefault) {
		this.playListDefault = playListDefault;
	}

	public PlayList createPlayList() {
		PlayList playList = new PlayList();
		Scanner scanPlayList = new Scanner(System.in);

		System.out.println("Ingresa El Nombre De la Playlist");
		name = scanPlayList.nextLine();

		boolean exit = false;
		while (!exit) {

			System.out.println("1. Crear Cancion");
			System.out.println("2. Agregar la Lista Default");
			System.out.println("3. guardar");
			option = scanPlayList.nextInt();

			switch (option) {
			case 1:
				CreateSongMenu menu = new CreateSongMenu();

				// aqui se produce un error del Scaner
				songs.add(menu.createSong());

				System.out.println("Cancion Guardada");

				break;
			case 2:
				songs.addAll(playListDefault);
				break;
			case 3:
				exit = true;
				break;
			default:
				System.out.println("debes elegir una opcion del 1 á 3 ");
				break;
			}

		}
		scanPlayList.close();
		playList.setName(name);
		playList.setSongs(songs);

		return playList;
	}

}
