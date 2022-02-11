package taller3.musicLibrary.app;

import java.util.Scanner;

public class PrincipalMenu {
  

    public void begins(){
    Scanner scan=new Scanner(System.in);


    boolean exit=false;
    while (!exit) {
        
    
        System.out.println("1. Playlist");
        System.out.println("2. Crear Playlist");
        System.out.println("3. Mostrar lista de Playlist");
        System.out.println("4. Salir");

        int option=scan.nextInt();
       
        switch (option) {
            case 1:
                
                break;
            case 2: 
                
                break;
            case 3:
                
                break;
            case 4:
                exit=true;
                break;
            default:System.out.println("debes elegir una opcion de 1-4");
                break;
        }
        scan.close();
    }
}
}