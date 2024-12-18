package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

//Contar cuantas palabras tiene una frase (hasta el primer punto)
public class Ej3_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        // VARIABLES
        String frase = "";
        boolean valido = true;

        // PROGRAMA
        System.out.println("Este programa cuenta la cantidad de palabras que tiene una frase (hasta el primer punto encontrado)");
        do {
            valido = true;
            System.out.print("Introduzca la frase a comprobar: ");
            frase = s.nextLine();
            if (frase.charAt(frase.length()-2) == '.') {
                valido = false;
            }
            if (frase.charAt(frase.length()-1) != '.') {
                valido = false;
            }
            if (!valido) {
                System.out.println("La frase debe acabar en un punto");
            }
        } while (!valido);

        frase = frase.trim();
        String[] palabras = frase.split(" ");
        if (palabras.length>1) {
            System.out.println("La frase introducida tiene " + palabras.length + " palabras");
        }else{
            System.out.println("La frase introducida tiene " + palabras.length + " palabra");
        }
    }
}
