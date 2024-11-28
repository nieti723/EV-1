package tema8_2;

import java.io.IOException;
import java.util.Scanner;

public class Ej6_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        //VARIABLES
        //Variable que almacena el texto generado
        String texto = "Ayer por la tarde iba paseando por la calle, vi a un perro verde volando y a un coche azul chocando contra una tienda de biciletas";
        // Guarda las palabras en un array para control de errores
        String[] palabras = texto.split(" ");
        // Palabra a sustituir
        String palabra = "";
        // Palabra por la que sustituiremos
        String sustituir = ""; 
        // Boolean para ver si la palbra introducida se encuentra o no en el texto
        boolean encontrada = false;

        // Programa
        System.out.println("Texto generado:");
        System.out.println(texto);
        //Pedimos la palabra a sustituir
        do {
            System.out.print("Introduzca la palabra a sustituir: ");
            palabra = s.nextLine();
            for (String string : palabras) {
                if (string.equalsIgnoreCase(palabra)) {
                    encontrada = true;
                }
            }
            if (!encontrada) {
                System.out.println("La palabra introducida no se encuentra en el programa, pruebe con una nueva");
            }
        } while (!encontrada);
        System.out.print("Introduce la nueva palabra: ");
        sustituir = s.nextLine();
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                if (i==0) {
                    palabras[i] = sustituir;
                    String letra1 = palabras[i].substring(0,1).toUpperCase();
                    palabras [i] = palabras[i].substring(1);
                    palabras[i] = letra1 + palabras[i];
                }else{
                    palabras[i] = sustituir;
                }
            }
        }
        for (String string : palabras) {
            System.out.print(string + " ");
        }
    }
}
