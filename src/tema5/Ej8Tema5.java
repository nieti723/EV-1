/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
public class Ej8Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pide un número por teclado y muestra su tabla de multiplicar por pantalla");
        System.out.print("Introduce el número a mostrar: ");
        int n = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n+"x"+i+"= "+n*i);
        }
    }
    
}
