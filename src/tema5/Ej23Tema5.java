/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 */
public class Ej23Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pedirá números hasta q la suma de todos sea mayor de 10000");
        System.out.println("Luego mostrará la suma y la cantidad de valores incluidos");
        System.out.println("------------------------------------------------------------------------");
        int n=0, suma=0, cont=0;
        while (suma<=10000) {            
            System.out.print("Introduce el valor nº"+(cont+1)+": ");
            n = s.nextInt();
            cont++;
            suma+=n;
            if (suma<=10000) {
                System.out.println("Suma actual: " + suma);
            }
        }
        suma=suma-n;
        cont=cont-1;
        double media = (double)suma/(double)cont;
        System.out.println("Suma total: " + suma);
        System.out.println("Números introducidos: " + cont);
        if (cont>=1) {
            System.out.println("Media: " + media);
        }else{
            System.out.println("La media no se puede realizar ya que no se han introducido valores");
        }
    }
    
}
