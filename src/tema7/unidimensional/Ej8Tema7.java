/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7.unidimensional;

/**
 *
 * @author juann
 */
public class Ej8Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tempMedia = new int[12];
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = 0; i < mes.length; i++) {
            tempMedia[i]= (int)(Math.random()*20)+8;
            for (int j = 0; j < tempMedia[i]; j++) {
                if (j==0) {
                    if (tempMedia[i]<10) {
                        System.out.print(tempMedia[i]+" ºC - ");
                    }else{
                        System.out.print(tempMedia[i] + "ºC - ");
                    }
                }
                System.out.print("*");
            }
            for (int j = tempMedia[i]; j < 40; j++) {
                System.out.print(" ");
            }
            System.out.println(mes[i]);
        }
    }
}
