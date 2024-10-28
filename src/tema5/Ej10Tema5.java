/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo
 */
public class Ej10Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cant = 0, total=0;
        System.out.println("Este programa calcula la media de unos valores introducidos por teclado");
        System.out.println("Puede introducir cuantos valores quiera y para terminar, debe introducir un valor negativo");
        System.out.print("Introduzca el valor nº"+(cant+1)+": ");
        int n = s.nextInt();
        double media;
        while (n>=0) {            
            cant++;
            total+=n;
            System.out.print("Introduzca el valor nº"+(cant+1)+": ");
            n = s.nextInt();
        }
        if (total!=0) {
            media = (double)total/(double)cant;
            System.out.printf("La media de los valores introducidos es: %.2f",media);  
        }else{
            System.out.println("El primer valor es negativo, así que el programa termina");
        }
    }
    
}
