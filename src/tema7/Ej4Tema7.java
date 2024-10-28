/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

/**
 *
 * @author juann
 */
public class Ej4Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i]=(int)(Math.random()*101);
            cuadrado[i]=(int)Math.pow(numero[i], 2);
            cubo[i]=(int)Math.pow(numero[i], 3);
        }
        System.out.println("Número\t|Cuadrado\t|Cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]+"\t|"+cuadrado[i]+"\t\t|"+cubo[i]);
        }
    }
    
}
