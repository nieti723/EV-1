/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej16Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---TRAGAPERRAS---");
        String cadenaTirada = "", cadena1 = "", cadena2 = "";
        for (int i = 0; i < 3; i++) {
            int tirada = (int)(Math.random()*5);
            switch (tirada) {
                case 0:
                    cadenaTirada = "corazón";
                    break;
                case 1:
                    cadenaTirada = "diamante";
                    break;
                case 2:
                    cadenaTirada = "herradura";
                    break;
                case 3: 
                    cadenaTirada = "campana";
                    break;
                case 4:
                    cadenaTirada = "limón";
                    break;
            }
            if (i==0) {
                cadena1=cadenaTirada;
            }else if (i==1){
                cadena2=cadenaTirada;
            }
            System.out.print(cadenaTirada+" ");
        }
        if (cadena1.equals(cadena2) && cadena1.equals(cadenaTirada)) {
            System.out.println("\nEnhorabuena, ha ganado 10 monedas");
        }else if (cadena1.equals(cadena2) || cadena1.equals(cadenaTirada) || cadena2.equals(cadenaTirada)){
            System.out.println("\nBien, ha recuperado su moneda");
        }else{
            System.out.println("\nLo siento, ha perdido");
        }
    }
    
}
