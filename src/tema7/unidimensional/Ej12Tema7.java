package tema7.unidimensional;

import java.io.IOException;
import java.util.Scanner;

public class Ej12Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        int[] aux = new int[num.length];
        //Cargamos el array
        for (int i = 0; i < num.length; i++) {
            int valor = (int) (Math.random()*41);
            num[i] = valor;
            aux[i] = valor;
        }
        System.out.println("Array inicial:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
        System.out.println();
        System.out.print("Valor inicial: ");
        int ini = s.nextInt();
        System.out.print("Valor final: ");
        int fin = s.nextInt();
        for (int i = fin; i < num.length; i++) {
            if (i==fin) {
                num[i] = aux[ini];
            }else{
                num[i] = aux[i-1];
            }
        }
        for (int i = 0; i <= ini; i++) {
            if (i==0) {
                num[i] = aux[aux.length-1];
            }else{
                num[i] = num[i] = aux[i-1];
            }
        }
        System.out.println("Array final:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
    }
}
