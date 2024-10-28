/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej1Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            int n = (int)(Math.random()*6+1);
            System.out.println("Tirada nº" + (i+1) + ": " + n);
            suma+=n;
        }
        System.out.println("Suma total tiradas: " + suma);
    }
    
}
