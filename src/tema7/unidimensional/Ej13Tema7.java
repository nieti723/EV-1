package tema7.unidimensional;

import java.util.Scanner;

public class Ej13Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[100];
        boolean encontrado = false;
        int destacar = 0, max = 0, min = 500;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*501);
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        do {
            System.out.print("¿Qué quieres destacar? (1 - mínimo, 2 - máximo): ");
            destacar = s.nextInt();
            if (destacar!=1 || destacar!=2) {
                System.out.println("El valor introducido no es válido");
            }
        } while (destacar!=1 && destacar!=2);

        for (int i = 0; i < num.length; i++) {
            if (num[i]<min) {
                min = num[i];
            }else if (num[i]>max){
                max = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (destacar==1) {
                if (num[i] == min && encontrado==false) {
                    System.out.print("⭐⭐" + num[i] + "⭐⭐ ");
                    encontrado = true;
                }else{
                    System.out.print(num[i] + " ");
                }
            }else{
                if (num[i] == max && encontrado==false) {
                    System.out.print("⭐⭐" + num[i] + "⭐⭐ ");
                    encontrado = true;
                }else{
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}
