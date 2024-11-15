package tema7.bidimensional;

import java.util.Scanner;

public class Ej8Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] tablero = new int[8][8];
        for (int i = tablero.length-1; i >= 0; i--) {
            for (int j = tablero.length-1; j >= 0; j--) {
                tablero[i][j]= j+1;
            }
        }
        System.out.print("Introduzca la posición del alfil: ");
        String posicion = s.nextLine();
        int columna = (int)(posicion.charAt(0))-96;
        int fila = (int)(posicion.charAt(1))-48;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(tablero[fila][columna]);
    }
}
