/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos.
 */
public class Ej34Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pide 2 números y mezcla sus dígitos pares e impares");
        System.out.println("en otros dos números. Ambos números deben tener la misma cantidad de dígitos");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Introduce el primer número: ");
        long n1 = s.nextLong(), nAux1 = n1, nuevo1 = n1, numPar = 0, numImpar = 0;
        System.out.print("Introduce el segundo número: ");
        long n2 = s.nextLong(), nuevo2 = n2, nAux2 = n2;
        int cifras1 = 0,cifras2 = 0, cifras = 0, impar = 0, par = 0, ultimo1 = 0, ultimo2 = 0, potenciaPar = 0, potenciaImpar = 0;
        //Calcular dígitos
        while (nAux1>0) {            
            nAux1/=10;
            cifras1++;
        }
        while (nAux2>0) {            
            nAux2/=10;
            cifras2++;
        }
        if (cifras1!=cifras2) {
            System.out.println("El número de dígitos de ambos números debe ser igual");
        }else{
            //Calcular cantidad pares e impares
            for (int i = 1; i <= cifras; i++) {
                ultimo1 = (int)(nuevo1%10);
                ultimo2 = (int)(nuevo2%10);
                nuevo1 = (long)(n1/Math.pow(10,i));
                nuevo2 = (long)(n2/Math.pow(10,i));
                if (ultimo1%2==0) {
                    par++;
                }else{
                    impar++;
                }
                if (ultimo2%2==0){
                    par++;
                }else{
                    impar++;
                }
            }
            nuevo1 = n1;
            nuevo2 = n2;
            //Bucle número par
            for (int i = 1; i <= par + impar; i++) {
                ultimo1 = (int)(nuevo1%10);
                ultimo2 = (int)(nuevo2%10);
                nuevo1 = (long)(n1/Math.pow(10,i));
                nuevo2 = (long)(n2/Math.pow(10,i));
                if (ultimo2 % 2 == 0) {
                    numPar+=ultimo2*Math.pow(10, potenciaPar);
                    potenciaPar++;
                }else{
                    numImpar+=ultimo2*Math.pow(10, potenciaImpar);
                    potenciaImpar++;
                }
                if (ultimo1 % 2 == 0) {
                    numPar+=ultimo1*Math.pow(10, potenciaPar);
                    potenciaPar++;
                }else{
                    numImpar+=ultimo1*Math.pow(10, potenciaImpar);
                    potenciaImpar++;
                }
            }
            System.out.println("El número formado por los dígitos pares es " + numPar);
            System.out.println("El número formado por los dígitos impares es " + numImpar);
        }
    }
    
}
