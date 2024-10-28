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
public class Ej32Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Este programa pide un número entero y muestra los dígitos pares");
        System.out.println("y la suma de todos estos");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Introduce el número: ");
        long n = s.nextLong();
        n = Math.abs(n);
        int cifras = 0, primero, sumaPares=0;
        long nAux=n, restante=n;
        while (nAux>0) {            
            nAux/=10;
            cifras++;
        }
        System.out.print("Dígitos pares: ");
        for (int i = 1; i <= cifras; i++) {
            primero=(int)(restante/Math.pow(10,cifras-i));
            restante%=Math.pow(10,cifras-i);
            if (primero%2==0) {
                sumaPares+=primero;
                System.out.print(primero+ " ");
            }
        }
        System.out.println("\nSuma de los dígitos pares: " + sumaPares);
    }
    
}
