/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 * Realiza un programa que pinte por pantalla diez líneas formadas por carac-
teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.
 */
public class Ej10Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String car = "";
        for (int i = 0; i < 10; i++) {
            int linea = (int)(Math.random()*40)+1;
            int n = (int)(Math.random()*6);
            switch (n) {
                case 0:
                    car = "*";
                    break;
                case 1: 
                    car = "-";
                    break;
                case 2: 
                    car = "=";
                    break;
                case 3: 
                    car = ".";
                    break;
                case 4:
                    car = "|";
                    break;
                case 5:
                    car = "@";
                    break;
            }
            for (int j = 0; j < linea; j++) {
                System.out.print(car+ " ");
            }
            System.out.println("");
        }
    }
    
}
