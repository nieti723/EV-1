/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej5Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0, min = 199, max = 0;
        double media = 0;
        for (int i = 0; i < 50; i++) {
            int n = (int)(Math.random()*100+100);
            if (n>max) {
                max=n;
            }
            if (n<min) {
                min = n;
            }
            suma+=n;
        }
        media = (double)suma/50;
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.printf("Media %.2f", media);
    }
    
}
