/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

/**
 *
 * @author juann
 */
public class Ej5Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[10];
        int max = 0, min = 10000;
        for (int i = 0; i < num.length; i++) {
            num[i]= (int)(Math.random()*101);
            if (num[i]<min) {
                min=num[i];
            }else if(num[i]>max){
                max=num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("Valor nº"+(i+1)+": "+ num[i]);
            if (num[i]==max) {
                System.out.print(" Máximo");
            }else if(num[i]==min){
                System.out.print(" Mínimo");
            }
            System.out.println("");
        }
    }
    
}
