package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej4_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        
        String palabra, letra;


        System.out.print("Introduzca una palabra para voltearla: ");
        palabra = s.next();

        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.substring(palabra.length()-1);
            palabra = palabra.substring(0, palabra.length()-1);
            palabra = letra + palabra;
            if (i<palabra.length()-1) {
                System.out.print(palabra + ", ");
            }else{
                System.out.print(palabra + " (stop).");
            }
        }

    }
}
