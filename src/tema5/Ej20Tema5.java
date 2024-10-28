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
public class Ej20Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("---PIRÁMIDE HUECA---");
        System.out.println("--------------------");
        System.out.print("Introduce el carácter: ");
        String car = s.next();
        System.out.print("Introduce la altura de la pirámide: ");
        int alt = s.nextInt(), planta=0, alt2 = alt-1;
        for (int i = 0; i <= alt2; i++) {
            for (int j = 0; j <= alt2*2; j++) {
                if ((i==alt2 && j<alt2*2)|| j==alt2+planta || j==alt2-planta) {
                    System.out.print(car);
                }else if (j<alt2+planta){
                    System.out.print(" ");
                }
            }
            planta++;
            System.out.println("");
        }
        
    }
    
}
