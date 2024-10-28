/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo)
 */
public class Ej17Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa sumará los 100 número siguientes");
        System.out.println("a uno introducido por teclado");
        System.out.println("----------------------------------------------");
        System.out.print("Introduce el valor: ");
        int n = s.nextInt(), suma=0;
        while (n<0) {            
            System.out.print("El número introducido no puede ser negativo, introduzca un valor válido: ");
            n = s.nextInt();
        }
        for (int i = n+1; i <= n+100; i++) {
            suma+=i;
        }
        System.out.println("Resultado: "+suma);
    }
    
}
