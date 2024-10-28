/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;
import java.util.Scanner;
/**
 *
 * @author juann
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
ducido es menor o mayor que el número secreto.
 */
public class Ej6Tema6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("---ADIVINA EL NÚMERO---");
        System.out.println("En este juego usted tiene 5 oportunidades para adivinar");
        System.out.println("un número aleatorio entre 0 y 100 generado por el ordenador");
        System.out.println("-----------------------------------------------------------");
        int intentos = 5, num = (int)(Math.random()*100), adiv = -1;
        for (int i = 1; i <= 5; i++) {
            if (adiv!=num) {
                System.out.println("Intento nº" + i);
                if (i>1) {
                    System.out.println("Le quedan " + (intentos) + " intentos");
                }else if(i==5){
                    System.out.println("Le queda " + (intentos) + " intento");
                }
                System.out.print("Introduzca su intento: ");
                adiv = s.nextInt();
                intentos--;
            }
        }
        if (adiv==num) {
            System.out.println("Enhorabuena, usted ha adivinado el número");
            System.out.println("Número: " + num);
        }else{
            System.out.println("Lo siento, no ha podido adivinarlo");
            System.out.println("Número: " + num);
        }
    }
    
}
