/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

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
                    if (mes[i].equals("Septiembre") || mes[i].equals("Noviembre") || mes[i].equals("Diciembre")) {
                        System.out.print(mes[i]+"\t");
                    }else{
                        System.out.print(mes[i] + "\t\t");
                    }
                }
                System.out.print("*");
                if (j==tempMedia[i]-1) {
                    System.out.println(" - "+tempMedia[i] + "ºC");
                }
            }
            System.out.println("");
        }
    }
}
