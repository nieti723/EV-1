package tema8_2;

import java.io.IOException;
import java.util.Scanner;

public class Ej8_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        
        //VARIABLES
        String cadena1 = "";
        String cadena2 = "";

        //PROGRAMA
        //Pedimos las dos cadenas quitando los espacios del principio y del final
        System.out.print("Cadena 1: ");
        cadena1 = s.nextLine().trim();
        System.out.print("Cadena 2: ");
        cadena2 = s.nextLine().trim();
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las dos cadenas son equivalentes");
        }else{
            System.out.println("Las cadenas no son equivalentes");
        }
    }
}
