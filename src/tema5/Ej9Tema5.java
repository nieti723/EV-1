/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado
 */
public class Ej9Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa calcula la cantidad de dígitos de un número introducido por teclado");
        System.out.print("Introduzca el número (entero): ");
        int n = s.nextInt(),digit=0;
        n = Math.abs(n);
        System.out.print("El número de dígitos de " + n);
        while (n>0) {            
            n/=10;
            digit++;
        }
        System.out.println(" es " + digit);
    }
    
}
