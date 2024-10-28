package tema7.bidimensional;

import java.io.IOException;
import java.util.Scanner;

public class Ej2Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        int[][] num = new int[4][5];
        int sumaH = 0, sumaV = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print("Introduce el valor nº" + (j+1) +" de la columna " +(i+1)+": " );
                num[i][j] = s.nextInt();
            }
        }
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("TABLA: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j]+"\t\t");
                sumaH+=num[i][j];
            }
            System.out.println("Fila "+(i) + ": " + sumaH);
            sumaH=0;
        }
        for (int i = 0; i < num[0].length; i++) {
            for (int j = 0; j < num.length; j++) {
                sumaV+=num[j][i];
            }
            System.out.print("Columna " + i + ": "+ sumaV+"\t");
            sumaV=0;
        }
    }
}
