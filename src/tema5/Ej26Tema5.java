/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
 */
public class Ej26Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Este programa pide un número entero y un dígito y muestra las posiciones");
        System.out.println("que ocupa este dígito en el número introducido de izquierda a derecha");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Introduce el número: ");
        int n = s.nextInt();
        n = Math.abs(n);
        System.out.print("Introduce el dígito: ");
        int dig = s.nextInt();
        dig = Math.abs(dig);
        int cifras = 0, primero, restante = n, nAux=n, coincide = 0;
        while (nAux>0) {            
            nAux/=10;
            cifras++;
        }
        System.out.print("El dígito introducido se repite en las posiciones: ");
        for (int i = 0; i <= cifras; i++) {
            primero=(int)(restante/Math.pow(10,cifras-i));
            restante%=Math.pow(10,cifras-i);
            if (primero==dig) {
                coincide++;
                System.out.print(i+ " ");
            }
        }
        System.out.println("\nY se repite " + coincide + " veces");
    }
    
}
