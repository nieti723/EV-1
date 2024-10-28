package tema5;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juann
 * Escribe un programa que calcule el factorial de un número entero leído por
teclado.
 */
public class Ej28Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pide un número por teclado y muestra su factorial");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Introduzca el valor: ");
        int n = s.nextInt(), factorial=1;
        System.out.print(n + "!=");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i>1) {
                System.out.print("*");
            }
            factorial*=i;
        }
        System.out.println("="+factorial);
    }
    
}
