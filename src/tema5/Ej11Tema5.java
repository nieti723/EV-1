/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado
 */
public class Ej11Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa muestra el cuadrado y el cubo de los 5 primero número enteros a partir del introducido por teclado");
        System.out.print("Introduce el valor inicial: ");
        int n = s.nextInt();
        System.out.println("Número  |  Cuadrado  | Cubo");
        for (int i = n; i < n+5; i++) {
            System.out.println(i+"\t|  "+(Math.round(Math.pow(i, 2)))+"\t     | "+(Math.round(Math.pow(i, 3))));
        }
    }
}
