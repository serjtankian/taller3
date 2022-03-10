package taller3.musicLibrary.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import taller3.musicLibrary.domain.PlayList;
import taller3.musicLibrary.domain.Song;

/**
 * Este es el menu principal que tiene el sistema aqui es donde se ejecutan las
 * funcionalidades del la biblioteca
 * 
 * PrincipalMenu menu = new PrincipalMenu(); menu.begins();
 *
 * @version 1.00.002 2022-03-10
 * 
 * @author Sebastian Arias sebastian.arias4214@gmail.com
 *
 * @since 1.00.000 2022-03-10
 */
public class PrincipalMenu {
	/**
	 * Es la PlayList por defecto de la Biblioteca
	 */
	private PlayList playListDefault = new PlayList();
	/**
	 * Esta lista de canciones por defecto
	 */
	private ArrayList<Song> songs = new ArrayList<Song>();
	/**
	 * Es la Lista De PlayList De La biblioteca
	 */
	private ArrayList<PlayList> listPlayList = new ArrayList<PlayList>();

	/**
	 * este es el metodo de inicio de la biblioteca el cual despiega el menu y
	 * entabla relacion con los metodos de la aplicacion
	 * 
	 * @author Sebastian Arias sebastian.arias4214@gmail.com
	 *
	 * @since 1.01.000 2022-03-10
	 */
	public void begins() {
		String option;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		playListDefault.setName("default");

		boolean exit = false;
		while (!exit) {
			/**
			 * menu principal
			 */
			System.out.println("1. Crear cancion");
			System.out.println("2. Crear Playlist");
			System.out.println("3. Mostrar lista de Playlist");
			System.out.println("4. Mostrar Canciones por default");
			System.out.println("5. Filtar una Playlist");
			System.out.println("6. ordenar una playlist");
			System.out.println("7. Salir");

			try {

				option = reader.readLine();
				/**
				 * se lee y se toma la opcion que se desea
				 */
				switch (option) {
				case "1": // Crear cancion

					CreateSongMenu menuSong = new CreateSongMenu();
					songs.add(menuSong.createSong());

					System.out.println("Cancion Guardada");

					break;
				case "2": // Crear Playlist
					CreatePlayListMenu menuPlayList = new CreatePlayListMenu(songs);

					listPlayList.add(menuPlayList.createPlayList());

					System.out.println("PlayList Guardada");

					break;
				case "3":// Mostrar lista de Playlist
					listPlayList.stream().forEach(playList -> System.out.println(playList.getName()));
					break;
				case "4":// Mostrar Canciones por default
					playListDefault.setSongs(songs);
					if (playListDefault.getSongs().isEmpty()) {
						System.out.println("Ops No hay canciones en la lista default ");
					} else {
						listingSongsDefault();
					}
					break;
				case "5":// Filtar una Playlist
					boolean repitOfCase5 = true;

					while (repitOfCase5) {
						/**
						 * se identifica la Playlist
						 */
						System.out.println("ingrese El nombre De la Playlist");
						String filter = reader.readLine();
						PlayList playlistSearched = new PlayList();
						ArrayList<PlayList> filterList = new ArrayList<PlayList>();
						listPlayList.stream().filter(playlist -> playlist.getName().equalsIgnoreCase(filter))
								.forEach(playlist -> filterList.add(playlist));
						playlistSearched = filterList.get(0);

						if (playlistSearched != null) {
							/**
							 * se filtra la playlist
							 */
							System.out.println("lista filtrada: " + playlistSearched.getName());
							System.out.println("1->filtrar por genero");
							System.out.println("2->filtrar por año");
							String optionFilter = reader.readLine();

							if (Integer.parseInt(optionFilter) == 1) {
								System.out.println("ingrese genero");
								String filterGenre = reader.readLine();
								playlistSearched.getSongs().stream().filter(b -> b.getGenre().equals(filterGenre))
										.forEach(playlist -> printSong(playlist));
							} else if (Integer.parseInt(optionFilter) == 2) {
								System.out.println("ingrese año");
								String filterYear = reader.readLine();
								int year = Integer.parseInt(filterYear);

								playlistSearched.getSongs().stream().filter(song -> song.getDate().getYear() == year)
										.forEach(song -> printSong(song));
							}
							repitOfCase5 = false;
						} else {
							System.out.println("No se encontro la playlist Revise el nombre De la Playlist");
							System.out.println("1-> Salir");
							System.out.println("2-> Repetir");
							String exitRepit = reader.readLine();
							if (exitRepit == "1") {
								repitOfCase5 = false;
							}
						}

					}

					break;

				case "6":// ordenar una playlist
					boolean repitOfCase6 = true;
					while (repitOfCase6) {
						/**
						 * Se identifica La Playlist
						 */
						System.out.println("ingrese nombre de la playlist que desea ordenar ");
						String filter = reader.readLine();
						PlayList playlistSearched = new PlayList();
						List<PlayList> filterList2 = new ArrayList<PlayList>();
						listPlayList.stream().filter(b -> b.getName().equalsIgnoreCase(filter))
								.forEach(playlist -> filterList2.add(playlist));
						playlistSearched = filterList2.get(0);

						if (playlistSearched != null) {
							/**
							 * se ordena La Playlist
							 */
							boolean exitOfOrdered = false;
							while (!exitOfOrdered) {
								System.out.println("lista filtrada: " + playlistSearched.getName());
								System.out.println("1->ordenar por fecha");
								System.out.println("2->ordenar por duracion");
								String optionSort = reader.readLine();
								switch (optionSort) {
								case "1":
									printPlaylist(PlayList.bubbleSort(playlistSearched.getSongs(), 1));
									exitOfOrdered = true;
									break;
								case "2":
									printPlaylist(PlayList.bubbleSort(playlistSearched.getSongs(), 2));
									exitOfOrdered = true;
									break;

								default:
									System.out.println("1-> Salir");
									System.out.println("2-> Repetir");
									String exitRepit = reader.readLine();
									if (exitRepit == "1") {
										exitOfOrdered = true;
									}
									break;
								}

							}
							repitOfCase6 = false;
						} else {
							System.out.println("No se encontro la playlist Revise el nombre De la Playlist");
							System.out.println("1-> Salir");
							System.out.println("2-> Repetir");
							String exitRepit = reader.readLine();
							if (exitRepit == "1") {
								repitOfCase6 = false;
							}
						}

					}

					break;
				case "7":// salir del programa
					exit = true;
					break;

				default:
					System.out.println("debes elegir una opcion de 1-7");
					break;
				}

			} catch (Exception mistake) {

				System.out.println(mistake);
			}

		}
	}

	/**
	 * Este metodo imprime por coinsola las canciones de la lista por Defecto
	 * 
	 * @author Sebastian Arias sebastian.arias4214@gmail.com
	 * 
	 * @since 1.00.001 2022-03-10
	 */
	public void listingSongsDefault() {

		playListDefault.setSongs(songs);
		playListDefault.getSongs().stream().forEach((song) -> printSong(song));
	}

	/**
	 * Este metodo imprime por consola una lista
	 * 
	 * @param list List<Song> es la lista que se sedea imprimir
	 * 
	 * @author Sebastian Arias sebastian.arias4214@gmail.com
	 * 
	 * @since 1.00.000 2022-03-10
	 */
	private void printPlaylist(List<Song> list) {
		list.stream().forEach((song) -> printSong(song));
	}

	/**
	 * Este metodo imprime por consola una cancion
	 * 
	 * @param song cancion
	 * 
	 * @author Sebastian Arias sebastian.arias4214@gmail.com
	 * 
	 * @since 1.00.002 2022-03-10
	 */
	private void printSong(Song song) {
		System.out.println("Titulo: " + song.getTitle() + ", Genero: " + song.getGenre() + ", Caratula: "
				+ song.getCover() + ", Descripcion: " + song.getDesciption() + ", Fecha: " + song.getDate().getYear()
				+ "/" + song.getDate().getMonth() + "/" + song.getDate().getDay() + ", Duracion: " + song.getDuration()
				+ "S" + ", Id " + song.getId());
	}
}