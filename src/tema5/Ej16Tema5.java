/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
public class Ej16Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pide un número y determina si es primo o no");
        System.out.println("---------------------------------------------------------");
        System.out.print("Introduce el número: ");
        int n = s.nextInt(),div=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                div++;
            }
        }
        if (div>2) {
            System.out.println("El número "+ n + " no es primo");
        } else {
            System.out.println("El número "+ n + " es primo");
        }
    }
    
}
