/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7.unidimensional;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Ej3Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] num = new int[10];
            for (int i = 0; i < num.length; i++) {
                System.out.print("Introduce el valor nº"+(i+1)+": ");
                num[i]= s.nextInt();
                System.out.println("");
            }
            System.out.print("Orden normal: ");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i]+" ");
            }
            System.out.print("\nOrden inverso: ");
            for (int i = num.length-1; i >= 0; i--) {
                System.out.print(num[i]+" ");
            }
        }
    }
    
}
