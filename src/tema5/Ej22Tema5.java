package tema5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juann
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
public class Ej22Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa muestra todos los números primos entre 2 y 100");
        int div=0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    div++;
                }
            }
            if (div<=2) {
                System.out.println(i+" ");
            }
            div=0;
        }
        
    }
    
}
