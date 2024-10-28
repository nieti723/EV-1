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
public class LetraP {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = s.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j==0 || (j==altura/2+1 && i<altura/2)) {
                    System.out.print("* ");
                }else if (i==0 && j< altura/2-1){
                    System.out.print("* ");
                }else if (i==altura/2 && j<altura/2){
                    System.out.print("* ");
                }else if ((j>0 && j<=altura/2 && i<altura/2 && i>0)){
                    System.out.print(" ");
                } 
            }
            System.out.println("");
        }
    }
    
}
