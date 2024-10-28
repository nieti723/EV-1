/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado.
 */
public class Ej12Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa nos muestra los n primeros términos de la serie");
        System.out.println("de Fibonacci. El número n se debe introducir por teclado");
        System.out.println("------------------------------------------------------------");
        System.out.print("Introduce el número de términos a mostrar: ");
        int n = s.nextInt(),n1=0,n2=1,n3=0;
        switch (n) {
            case 1:
                System.out.println(n1);
                break;
            case 2:
                System.out.println(n1+ " "+ n2);
            break;
            default:
                System.out.print(n1+ " "+ n2+" ");
                for (int i = 0; i < n-2; i++) {
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                    System.out.print(n3+" ");
                }
        }
    }
    
}
