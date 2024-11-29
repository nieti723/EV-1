package tema8_2.boletin1;

import java.io.IOException;
import java.util.Scanner;

public class Ej7_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        // VARIABLES    
        //Texto introducido por teclado
        String textoTeclado = "";
        String primeraLetra = "";

        //PROGRAMA
        //Pedimos el texto al usuario
        System.out.println("Introduce un texto:");
        textoTeclado = s.nextLine().toLowerCase().trim();
        // Guardamos la primera letra del texto en una variable y la cambiamos a mayúscula
        primeraLetra = textoTeclado.substring(0,1).toUpperCase();
        // Retiramos la primera letra del texto para que no se repita
        textoTeclado = textoTeclado.substring(1);
        // Concatenamos la primera letra más el texto 
        textoTeclado = primeraLetra.concat(textoTeclado);
        System.out.println("Texto formateado: ");
        System.out.println(textoTeclado);
    }
}
