/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 * Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado
 */
public class Ej9Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0, cont = 0, n2 = 0;
        System.out.print("Valores: ");
        do {            
            n = (int)(Math.random()*100);
            if (n%2==0) {
                n2=n;
                cont++;
                if (n2==24) {
                    System.out.print("'"+n2+"' ");
                }else{
                    System.out.print(n2 + " ");
                }
            }
        } while (n2!=24);
        System.out.println("\nSe han generado un total de " + cont + " números pares");
    }
    
}
