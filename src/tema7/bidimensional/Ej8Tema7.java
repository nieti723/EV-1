package tema7.bidimensional;

public class Ej8Tema7 {
    public static void main(String[] args) {
        String[] iconos = {"⬜", "⬛"};
        String[][] tablero = {{"a", "b", "c", "d", "e", "f", "g", "h"}, {"8", "7", "6", "5", "4", "3", "2", "1"}};
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (i==0 || i==tablero.length-1) {
                    System.out.print(tablero[0][j] + "\t");
                }else if (j==0 && j==tablero[0].length-1) {
                    System.out.print(tablero[1][j]);
                }
            }
            System.out.println();
        } 
    }
}
