/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */
public class Ej21Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa muestra unas estadísticas de una serie de números\nIntroducidos por teclado");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Introduzca el valor nº1: ");
        int n = s.nextInt(), cont = 0, impar = 0, mayorPar = 0, mediaImpar = 0;
        while (n>0) {            
            if (n%2==0 && mayorPar<n) {
                mayorPar=n;
            }else if (n%2!=0){
                mediaImpar+=n;
                impar++;
            }
            cont++;
            System.out.println("Introduce el valor nº" + (cont+1));
            n = s.nextInt();
        }
        mediaImpar/=impar;
        System.out.println("Estadísticas:");
        System.out.println("\t- Números introducidos: " + cont);
        System.out.println("\t- Media números impares: " + mediaImpar);
        System.out.println("\t- Número par mayor: " + mayorPar);
    }
    
}
