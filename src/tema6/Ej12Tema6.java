/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej12Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            int linea = (int)(Math.random()*96)+5;
            for (int j = 0; j < linea; j++) {
                int letra = (int)(Math.random()*95)+32;
                char car = (char)letra;
                System.out.print(car+" ");
                Thread.sleep(500/100);
            }
            System.out.println("");
        }
    }
    
}
