/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juannEscribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.
 */
public class Ej18Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("En este programa el usuario introducirá dos números diferentes");
        System.out.println("y mostrará desde el menor hasta el mayor de 7 en 7");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Introduce los dos números: ");
        int n1= s.nextInt(), n2 = s.nextInt(), menor, mayor;
        if (n1==n2) {
            System.out.println("Los valores deben ser distintos");
        }else{
            if (n1>n2) {
                mayor=n1;
                menor=n2;
            }else{
                mayor=n2;
                menor=n1;
            }
            for (int i = menor; i < mayor; i+=7) {
                System.out.println(i+ " ");
            }
        }
    }
    
}
