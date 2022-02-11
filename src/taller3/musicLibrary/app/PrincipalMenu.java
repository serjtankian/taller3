package taller3.musicLibrary.app;


import java.util.ArrayList;
import java.util.Scanner;

import taller3.musicLibrary.domain.PlayList;
import taller3.musicLibrary.domain.Song;

public class PrincipalMenu {

    private  PlayList playListDefault=new PlayList();
    private int count=0;
    private ArrayList<Song> list;

    private void print(Song song){
        System.out.println(song.getTitle());
    }
    public void listing() { 
        playListDefault.setSongs(list);

        playListDefault.getSongs().stream().forEach((n)-> System.out.println (n.getTitle()));
    
    }
    public void begins(){
    Scanner scan=new Scanner(System.in);

    playListDefault.setName("default");
 
    boolean exit=false;
    while (!exit) {
        
    
        System.out.println("1. Crear cancion");
        System.out.println("2. Crear Playlist");
        System.out.println("3. Mostrar lista de Playlist");
        System.out.println("4. Salir");

        int option=scan.nextInt();
       
        switch (option) {
            case 1:  

                Song song=new Song("darkName");

                System.out.println("nombre "+song.getTitle()+" date: "+song.getDate()+" duracion: "+song.getDuration());
                list.add(song);
                
                break;
            case 2:   ArrayList<Song> playlist=new ArrayList<Song>();
                
                break;
            case 3:
                     //if(count==0)System.out.print("no hay playlist");
                     listing();
                break;
            case 4:
                exit=true;
                break;
            default:System.out.println("debes elegir una opcion de 1-4");
                break;
        }
       
    }
    scan.close();
}
}