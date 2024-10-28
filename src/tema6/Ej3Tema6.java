/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej3Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int palo = (int)(Math.random()*4)+1;
        int num = (int)(Math.random()*10)+1;
        String cadenaPalo = "";
        String numero = "";
        switch (palo) {
            case 1:
                cadenaPalo = "copas";
                break;
            case 2:
                cadenaPalo = "bastos";
                break;
            case 3:
                cadenaPalo = "espada";
                break;
            case 4:
                cadenaPalo = "oro";
                break;
        }
        switch (num) {
            case 1:
                numero = "as";
                break;
            case 8:
                numero = "sota";
                break;
            case 9:
                numero = "caballo";
                break;
            case 10:
                numero = "rey";
                break;
            default:
                numero = String.valueOf(num);
        }
        if (num==8) {
            System.out.println("La "+numero+ " de " + cadenaPalo);
        }else{
            System.out.println("El "+numero+ " de " + cadenaPalo);
        }
    }
    
}
