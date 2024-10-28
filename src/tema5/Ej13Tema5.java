/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos
 */
public class Ej13Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa lee 10 números por teclado");
        System.out.println("y determina cuántos son positivos y cuántos son negativos");
        int n,pos=0,neg=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor nº"+(i+1)+": ");
            n = s.nextInt();
            if (n>0) {
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println("Positivos: "+pos);
        System.out.println("Negativos: "+neg);
    }
    
}
