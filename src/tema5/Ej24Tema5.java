/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Ej24Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("---PIRÁMIDE DE NÚMEROS---");
        System.out.println("-------------------------");
        System.out.print("Introduce la altura: ");
        int alt = s.nextInt(), planta = 1, espacio = alt-1;
        for (int i = 0; i < alt; i++) {
            for (int j = 1; j <= espacio; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= planta; j++) {
                System.out.print(j);
            }
            for (int j = planta-1; j > 0; j--) {
                System.out.print(j);
            }
            espacio--;
            planta++;
            System.out.println("");
        }
    }
    
}
