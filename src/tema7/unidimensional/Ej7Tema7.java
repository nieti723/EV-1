/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7.unidimensional;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Ej7Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa genera 100 números aleatorios del 0 al 20");
        System.out.println("y pide dos números por teclado, el primero es el valor");
        System.out.println("a sustituir y el segundo es el nuevo valor que introduciremos.");
        System.out.println("Al final se mostrará el nuevo array con los números sustituidos entre comillas");
        System.out.println("-------------------------------------------------------------------------------");
        int[] num = new int[100];
        int remove = 0, nuevo = 0;
        boolean valido = false;
        try (Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < num.length; i++) {
                num[i]=(int)(Math.random()*21);
            }
            System.out.print("Array generado: ");
            for (int i = 0; i < num.length; i++) {
                if (i==num.length-1) {
                    System.out.print(num[i]);
                }
                else{
                    System.out.print(num[i]+",");
                }
            }
            System.out.print("\nIntroduzca el valor a sustituir: ");
            remove = s.nextInt();
            do {            
                for (int i = 0; i < num.length; i++) {
                    if (num[i]==remove) {
                        valido=true;
                    }
                }
                if (valido==false) {
                    System.out.println("El valor introducido no se encuentra en el array.");
                    System.out.print("Introduzca un valor válido: ");
                    remove = s.nextInt();
                }
            } while (valido==false);
            System.out.print("Introduzca el nuevo valor: ");
            nuevo = s.nextInt();
            while (nuevo<0 || nuevo>20) {            
                System.out.println("El valor introducido no es válido, debe estar entre 0 y 20");
                System.out.print("Introduzca un nuevo valor: ");
                nuevo = s.nextInt();
            }
        }
        System.out.print("Nuevo array: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i]==remove) {
                System.out.print("'"+nuevo+"' ");
            }else{
                System.out.print(num[i]+" ");
            }
        }
    }
    
}
