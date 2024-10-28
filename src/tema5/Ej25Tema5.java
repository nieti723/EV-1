/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 */
public class Ej25Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pide un número entero por teclado y lo muestra volteado");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Introduce el valor: ");
        int n = s.nextInt(), cifras=0, nAux=n, residuo=n, volteado=0;
        n = Math.abs(n);
        //Cantidad de cifras
        while (nAux>0) {            
            nAux/=10;
            cifras++;
        }
        //Voltear número
        for (int i = 1; i <= cifras; i++) {
            volteado+=residuo%10*Math.pow(10, cifras-i);
            residuo/=10;
        }
        System.out.println("Número original: "+n);
        System.out.println("Número volteado: "+volteado);
    }
    
}
