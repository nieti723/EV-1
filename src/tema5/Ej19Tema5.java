/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Juan
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 */
public class Ej19Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa muestra por pantalla una pirámide cuya altura");
        System.out.println("debe introducir el usuario por teclado, al igual que el");
        System.out.println("caracter con el que se pintará");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Introduce el carácter: ");
        String car = s.next();
        System.out.print("Introduce la altura: ");
        int h = s.nextInt(), longitud=1, altura=1,spc=h-1;
        while (altura<=h) {            
            for (int i = 1; i <= spc; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= longitud; i++) {
                System.out.print(car);
            } 
            System.out.println("");
            
            altura++;
            longitud+=2;
            spc--;
        }
    }
    
}
