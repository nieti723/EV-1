/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej13Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int dado1=0, dado2=0;
        do {            
            Thread.sleep(1000);
            dado1 = (int)(Math.random()*8)+1;
            dado2 = (int)(Math.random()*8)+1;
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("----------------");
        } while (dado1!=dado2);
        System.out.println("Los dados coinciden");
    }
    
}
