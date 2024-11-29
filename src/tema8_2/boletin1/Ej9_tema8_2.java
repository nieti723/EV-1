package tema8_2.boletin1;

import java.io.IOException;
import java.util.Scanner;

public class Ej9_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        // VARIABLES
        String cadena = "";
        // Array que guarda todos los caracteres de la cadena
        char[] caracteres;
        int encriptado = 0;
        // Valor numérico en ASCII que tiene la letra

        // PROGRAMA
        System.out
                .println("Este programa pide una cadena y luego un número entero para encriptar el texto introducido");
        System.out.print("Introduce el texto: ");
        cadena = s.nextLine();
        caracteres = cadena.toCharArray();
        do {
            System.out.print("Introduce un número para encriptar (entre 1 y 25): ");
            encriptado = s.nextInt();
            if (encriptado > 25 || encriptado < 0) {
                System.out.println("El número introducido no es válido, inténtelo de nuevo");
            }
        } while (encriptado > 25 || encriptado < 1);
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = (char) (caracteres[i] + encriptado);
        }
        for (char c : caracteres) {
            System.out.print(c);
        }
    }
}
