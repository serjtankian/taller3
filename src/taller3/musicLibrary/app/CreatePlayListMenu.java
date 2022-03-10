package taller3.musicLibrary.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import taller3.musicLibrary.domain.PlayList;
import taller3.musicLibrary.domain.Song;

/**
 * Esta clase crea las playlist de la biblioteca
 * 
 * CreatePlayListMenu newMenu = new CreatePlayListMenu(Songs);
 * newMenu.createPlayList();
 * 
 * @version 1.00.001 2022-03-10
 * 
 * @author Sebastian Arias sebastian.arias4214@gmail.com
 *
 * @since 1.00.000 2022-03-10
 */
public class CreatePlayListMenu {
	/**
	 * Estre es el nombre de la playList
	 */
	private String name;
	/**
	 * esta variable vaa guardar la opcion que escoja el usuario
	 */
	private int option;
	/**
	 * esta es la lista de canciones que va a tener la playlist
	 */
	private ArrayList<Song> songs = new ArrayList<Song>();
	/**
	 * esta es la lista de canciones por default que tiene el sistema
	 */
	private ArrayList<Song> playListDefault = new ArrayList<Song>();

	/**
	 * este es el contructor del menu el cual requiere la lista por default
	 * 
	 * @param playListDefault ArrayList<Song> es la lista deault del sistema
	 * 
	 * @author Sebastian Arias sebastian.arias4214@gmail.com
	 * 
	 * @since 1.00.000 2022-03-10
	 */
	public CreatePlayListMenu(ArrayList<Song> playListDefault) {
		this.playListDefault = playListDefault;
	}

	/**
	 * Este metodo crea las playList del sistema 
	 * 
	 * @return PlayList es la nueva playlist
	 * 
	 * @author Sebastian Arias sebastian.arias4214@gmail.com
	 * 
	 * @since 1.00.001 2022-03-10
	 */
	public PlayList createPlayList() {
		PlayList playList = new PlayList();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingresa El Nombre De la Playlist");
			name = reader.readLine();

			boolean exit = false;

			while (!exit) {

				System.out.println("1. Crear Cancion");
				System.out.println("2. Agregar la Lista Default");
				System.out.println("3. guardar");

				option = Integer.parseInt(reader.readLine());
				switch (option) {
				case 1:

					CreateSongMenu menu = new CreateSongMenu();
					Song newSong = menu.createSong();
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

		} catch (Exception mistake) {
			System.out.println(mistake);
		}

		playList.setName(name);
		playList.setSongs(songs);

		return playList;
	}

}
