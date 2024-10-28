/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
 */
public class Ej15Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("En este programa se muestra la base elevada a n números");
        System.out.println("en el que el usuario introduce la base b y la cantidad");
        System.out.println("de exponentes a mostrar n (desde 0 a n)");
        System.out.println("-------------------------------------------------------");
        System.out.println("Introduce los valores");
        System.out.print("Base: ");
        int b = s.nextInt();
        System.out.print("Exponente: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(b+"^"+i);
        }
    }
    
}
