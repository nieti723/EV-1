package tema7.unidimensional;

import java.util.Scanner;

public class Ej16Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println();
        Scanner s = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 401);
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.print("\n¿Qué números quiere resaltar? (1 - los múltiplos de 5 | 2 - los múltiplos de 7): ");
        int resaltar = s.nextInt();
        switch (resaltar) {
            case 1:
                resaltar = 5;
                break;
            case 2:
                resaltar = 7;
                break;
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i]%resaltar==0) {
                System.out.print("[" + num[i] + "] ");
            }else{
                System.out.print(num[i] + " ");
            }
        }
    }
}
