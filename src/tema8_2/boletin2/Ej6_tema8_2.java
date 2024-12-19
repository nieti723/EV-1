package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej6_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in, "Windows-1252");

        String texto, frase1, frase2;
        boolean valido = true;

        do {
            valido = true;
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.print("Introduzca el texto (las dos frases deben estar separadas por un punto): ");
            texto = s.nextLine();
            if (texto.length()>texto.indexOf(".")+1) {
                if (texto.charAt(texto.indexOf(".") + 1) == '.') {
                    valido = false;
                }
            }
            if (texto.length()==texto.indexOf(".")+1) {
                valido = false;
            }
            if (texto.indexOf(".")==-1) {
                valido = false;
            }
            if (!valido) {
                System.out.println("Debe de haber dos frases separadas por un punto");
                System.out.print("Pulsa una tecla para continuar: ");
                s.nextLine();
            }
        } while (!valido);
        frase1 = texto.substring(0, texto.indexOf("."));
        frase2 = texto.substring(texto.indexOf(".")+1);
        if (frase2.charAt(0)==' ') {
            frase2 = frase2.substring(1);
        }
        String[] palabras1 = frase1.split(" ");
        String[] palabras2 = frase2.split(" ");
        System.out.println("Frase 1: " + frase1.trim() + "(" + palabras1.length + " palabras)");
        System.out.println("Frase 2: " + frase2.trim() + "(" + palabras2.length + " palabras)");
    }
}
