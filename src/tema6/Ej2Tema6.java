/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej2Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int palo = (int)(Math.random()*4)+1;
        int num = (int)(Math.random()*13)+1;
        String cadenaPalo = "";
        String numero = "";
        switch (palo) {
            case 1:
                cadenaPalo = "picas";
                break;
            case 2:
                cadenaPalo = "corazones";
                break;
            case 3:
                cadenaPalo = "diamantes";
                break;
            case 4:
                cadenaPalo = "trébol";
                break;
        }
        switch (num) {
            case 1:
                numero = "A";
                break;
            case 11:
                numero = "J";
                break;
            case 12:
                numero = "Q";
                break;
            case 13:
                numero = "K";
                break;
            default:
                numero = String.valueOf(num);
        }
        if (num<11) {
            System.out.println("El "+numero+ " de " + cadenaPalo);
        }else{
            System.out.println("La "+numero+ " de " + cadenaPalo);
        }
    }
    
}
