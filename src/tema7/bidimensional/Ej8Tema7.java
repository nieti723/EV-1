package tema7.bidimensional;

import java.io.IOException;
import java.util.Scanner;

public class Ej8Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        String[][] tablero = new String[8][8];
        String posicion;
        int columna, fila;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = (char)(j+97) + "" + (8-i);
            }
        }
        System.out.print("Introduce la posición del alfil: ");
        posicion = s.nextLine();
        columna = (int)posicion.charAt(0)-97;
        fila = (int)posicion.charAt(1)-50;
        System.out.println(fila + " " + columna);
        System.out.println("Fila: " + fila);
        System.out.println("Columna: " + columna);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                
            }
        }
    }
}
