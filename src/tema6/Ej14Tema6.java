/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Ej14Tema6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa adivinará un número que usted introduzca por teclado");
        System.out.println("entre 0 y 100.La máquina tiene 5 intentos y en cada uno le pedirá que");
        System.out.println("diga si su número es mayor o menor al que ha introducido");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Introduzca su número: ");
        int n = s.nextInt();
        while (n<0 || n>100) {            
            System.out.println("El número introducido debe estar entre 0 y 100");
            System.out.println("Introduzca un valor válido");
            n = s.nextInt();
        }
        int usuario = 0;
        int nMaquina = (int)(Math.random()*101);
        int mayor = 0;
        int menor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Intento nº"+i);
            System.out.println("Su número: " + n);
            System.out.println("Número generado: " + nMaquina);
            if (n!=nMaquina) {
                System.out.print("¿El número ingresado es mayor o menor?(1/2): ");
                usuario = s.nextInt();
                if (usuario==1) {
                    menor=nMaquina;
                }else if (usuario==2){
                    mayor=nMaquina;
                }
                nMaquina = (int)(Math.random()*(mayor-menor))+menor;
            }else{
                i=5;
            }
        }
        if (n==nMaquina) {
            System.out.println("El número ha sido acertado");
        }else{
            System.out.println("No ha podido ser");
        }
    }
    
}
