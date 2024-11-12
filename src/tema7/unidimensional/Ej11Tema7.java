package tema7.unidimensional;

import java.io.IOException;

public class Ej11Tema7 {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        int[] num = new int[10];
        int div = 0, primo = 0, noPrimo = 0;
        int[] ordenado = new int[num.length];
        // Cargamos el Array
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 50) + 1;
        }
        System.out.println("Array inicial:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j <= num[i]/2; j++) {
                if (num[i]%j==0) {
                    div++;
                }
            }
            if (div>1) {
                ordenado[ordenado.length-(1+noPrimo)] = num[i];
                noPrimo++;
            }else{
                ordenado[primo] = num[i];
                primo++;
            }
            System.out.print(num[i] + " ");
            div=0;
        }
        System.out.println();
        System.out.println("Array final:");
        for (int i = 0; i < ordenado.length; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
}
