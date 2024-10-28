/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 * Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
nas para los 14 partidos y el pleno al quince (15 filas)
 */
public class Ej7Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String car = "";
        for (int i = 0; i < 15; i++) {
            if (i<9) {
                System.out.print(" "+(i+1)+". ");
            }else{
                System.out.print((i+1)+". ");
            }
            for (int j = 0; j < 3; j++) {
                int n = (int)(Math.random()*3);
                switch (n) {
                        case 0:
                            car = "| X |";
                            break;
                        case 1:
                            car = "| 1 |";
                            break;
                        case  2:
                            car = "| 2 |";
                            break;
                    }
                if (i==14) {
                    j=3;
                    System.out.print(car);
                }else{
                    System.out.print(car);
                }
            }
            System.out.println("");
        }
    }
    
}
