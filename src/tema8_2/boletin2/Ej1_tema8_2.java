package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej1_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        // VARIABLES
        String cadena = "";
        char[] caracteres;

        // PROGRAMA
        //Pedimos la cadena
        System.out.print("Introduzca la cadena: ");
        cadena = s.nextLine();
        //Pasamos todos los caracteres de la cadena a un array de caracteres
        caracteres = cadena.toCharArray();
        //Imprimimos cada elemento del array en una linea diferente
        for (char c : caracteres) {
            System.out.println(c);
        }
    }
}
