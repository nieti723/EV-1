/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

/**
 *
 * @author juann
 */
public class Ej6Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[15];
        int ultimo = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*16);
        }
        System.out.print("Array normal: ");
        for (int i = 0; i < num.length; i++) {
            if (i<num.length-1) {
                System.out.print(num[i] + ",");
            }else{
                System.out.print(num[i]);
            }
        }
        ultimo = num[num.length-1];
        System.out.println("");
        System.out.print("Array rotado: ");
        for (int i = num.length-1 ; i > 0; i--) {
            num[i]=num[i-1];
        }
        num[0]=ultimo;
        for (int i = 0; i < num.length; i++) {
            if (i<num.length-1) {
                System.out.print(num[i] + ",");
            }else{
                System.out.print(num[i]);
            }
        }
    }
    
}
