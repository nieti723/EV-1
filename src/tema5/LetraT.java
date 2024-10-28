/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author juann
 */
public class LetraT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura = 7;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i==0 || j==0) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
