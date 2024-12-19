package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

//Contar cuantas palabras tiene una frase (hasta el primer punto)
public class Ej3_tema8_2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        // VARIABLES
        String frase = "";
        int posPunto = 0;
        boolean valido = true;

        // PROGRAMA
        System.out.println("Este programa cuenta la cantidad de palabras que tiene una frase (hasta el primer punto encontrado)");
        do {
            valido = true;
            System.out.print("Introduzca la frase a comprobar: ");
            frase = s.nextLine();
            //Valida si la frase termina en un punto
            if (frase.indexOf(".")==-1) {
                valido = false;
            }
        } while (!valido);
        //Comprueba si la frase tiene puntos suspensivos o no
        do {
            valido = true;
            if (frase.length()>frase.charAt(frase.indexOf("."))) {
                if (frase.charAt(frase.indexOf(".")+1) == '.') {
                    valido = false;
                }
            }
        } while (!valido);
        

    }
}
