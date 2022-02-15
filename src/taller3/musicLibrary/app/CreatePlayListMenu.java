package taller3.musicLibrary.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingresa El Nombre De la Playlist");
			name = br.readLine();

			boolean exit = false;
			
			while (!exit) {

				System.out.println("1. Crear Cancion");
				System.out.println("2. Agregar la Lista Default");
				System.out.println("3. guardar");
				
				
				option = Integer.parseInt(br.readLine());
				switch (option) {
				case 1:
					
					CreateSongMenu menu = new CreateSongMenu();
					Song newSong= menu.createSong();
					songs.add(newSong);
					System.out.println("Cancion Guardada");
					 
					break;
				case 2:
					
					songs.addAll(playListDefault);
					
					break;
				case 3:

					exit = true;

					break;
				default:
					System.out.println("debes elegir una opcion del 1 � 3 ");
					break;
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		playList.setName(name);
		playList.setSongs(songs);

		return playList;
	}

}
