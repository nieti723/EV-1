/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma
 */
public class Ej29Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa muestra por pantalla todos los números positivos");
        System.out.println("menores a uno introducido por el usuario y que NO sean divisibles");
        System.out.println("entre otro introducido");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Introduce el número: ");
        int n = s.nextInt();
        while (n<0) {            
            System.out.println("El número introducido debe ser positivo");
            System.out.print("Introduzca un valor válido: ");
            n = s.nextInt();
        }
        System.out.print("Introduce el divisor: ");
        int div = s.nextInt();
        while (div<=0) {            
            System.out.println("El divisor introducido debe ser positivo y distinto de 0");
            System.out.print("Introduzca un valor válido: ");
            div = s.nextInt();
        }
        System.out.println("--------------------------------");
        System.out.println("Número: " + n);
        System.out.println("Divisor: " + div);
        System.out.print("Valores: ");
        for (int i = n-1; i > 0; i--) {
            if (i%div!=0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
