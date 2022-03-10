package taller3.musicLibrary.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * esta clase va representar una playlist
 * 
 * PlayList newPlaylist = new PlayList () ; newPlaylist.getSongs;
 * 
 * @version 1.00.000 2022-03-10
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-10
 * 
 */

public class PlayList {
	/**
	 * esta variable contiene el nombre de la playList
	 */
	private String name;
	/**
	 * Esta variable contiene las canciones de la playList
	 */
	private ArrayList<Song> songs = new ArrayList<Song>();

	/**
	 * 
	 * este es el costructor de la playList el cual va a cargar la playList ya
	 * funcional
	 * 
	 * @param name  String es el nombre de la playList
	 * @param songs ArrayList<Song> son las canciones de la playlist
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 */

	public PlayList(String name, ArrayList<Song> songs) {
		this.name = name;
		this.songs = songs;
	}

	/**
	 * Este el el costructor por Default
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 */
	public PlayList() {
		this("", null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

	/**
	 * 
	 * Este es el metodo que nos permitira ordena la lista de canciones de la
	 * playlista segun la necesitadad
	 * 
	 * @param songs        List<Song> es la lista de canciones de la playlist
	 * @param optionOfSort int este parametro permite saber el orde por el que se va
	 *                     a efectuar 1 para ordenar por fecha o 2 para ordenar por
	 *                     duracion de las canciones
	 * @return List<Song> es la lista de canciones ordenadas
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.001 2022-03-10 
	 * 
	 */

	public static List<Song> bubbleSort(List<Song> songs, int optionOfSort) {
		Song auxToTheMovements;

		if (optionOfSort == 1) {
			for (int i = 0; i < songs.size() - 1; i++) {

				for (int j = 0; j < songs.size() - 1; j++) {

					if (songs.get(j).getDate().getYear() > songs.get(j + 1).getDate().getYear()) {
						auxToTheMovements = songs.get(j);
						songs.set(j, songs.get(j + 1));
						songs.set(j + 1, auxToTheMovements);
					}

				}

			}
		} else if (optionOfSort == 2) {
			for (int i = 0; i < songs.size() - 1; i++) {

				for (int j = 0; j < songs.size() - 1; j++) {

					if (songs.get(j).getDuration() > songs.get(j + 1).getDuration()) {
						auxToTheMovements = songs.get(j);
						songs.set(j, songs.get(j + 1));
						songs.set(j + 1, auxToTheMovements);
					}

				}

			}
		}

		return songs;
	}

}
