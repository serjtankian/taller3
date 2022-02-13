package taller3.musicLibrary.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import taller3.musicLibrary.domain.PlayList;
import taller3.musicLibrary.domain.Song;

public class PrincipalMenu {

	private PlayList playListDefault = new PlayList();
	private ArrayList<Song> songs = new ArrayList<Song>();
	private ArrayList<PlayList> listPlayList = new ArrayList<PlayList>();

	public void begins() {
		String option;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		playListDefault.setName("default");

		boolean exit = false;
		while (!exit) {

			System.out.println("1. Crear cancion");
			System.out.println("2. Crear Playlist");
			System.out.println("3. Mostrar lista de Playlist");
			System.out.println("4. Mostrar Canciones por default");
			System.out.println("5. Filtar una Playlist");
			System.out.println("6. ordenar una playlist");
			System.out.println("7. Salir");

			try {

				option = br.readLine();

				switch (option) {
				case "1":

					CreateSongMenu menuSong = new CreateSongMenu();
					songs.add(menuSong.createSong());

					System.out.println("Cancion Guardada");

					break;
				case "2":
					CreatePlayListMenu menuPlayList = new CreatePlayListMenu(songs);

					listPlayList.add(menuPlayList.createPlayList());

					System.out.println("PlayList Guardada");

					break;
				case "3":
					listPlayList.stream().forEach(x -> System.out.println(x.getName()));
					break;
				case "4":
					playListDefault.setSongs(songs);
					if (playListDefault.getSongs().isEmpty()) {
						System.out.println("Ops No hay canciones en la lista default ");
					} else {
						listingSongs();
					}
					break;
				case "5":

					break;
				case "6":

					break;
				case "7":
					exit = true;
					break;

				default:
					System.out.println("debes elegir una opcion de 1-4");
					break;
				}

			} catch (Exception e) {

				System.out.println(e);
			}

		}
	}

	public void listingSongs() {

		playListDefault.setSongs(songs);
		playListDefault.getSongs().stream()
				.forEach((n) -> System.out.println(n.getTitle() + " " + n.getGenre() + " " + n.getCover() + " "
						+ n.getDesciption() + " " + n.getDate() + " " + n.getDuration() + " " + n.getId()));
	}
}