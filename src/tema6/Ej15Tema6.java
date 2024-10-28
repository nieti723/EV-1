/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 */
public class Ej15Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length = (int)(Math.random()*7)+1;
        String cadenaNota = "";
        int nota1 = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 4; j++) {
                int nota = (int)(Math.random()*7);
                if (i==0 && j==0) {
                    nota1=nota;
                }else if (i==length-1 && j==3){
                    nota=nota1;
                }
                switch (nota) {
                    case 0:
                        cadenaNota = "do";
                        break;
                    case 1:
                        cadenaNota = "re";
                        break;
                    case 2:
                        cadenaNota = "mi";
                        break;
                    case 3:
                        cadenaNota = "fa";
                        break;
                    case 4:
                        cadenaNota = "sol";
                        break;
                    case 5:
                        cadenaNota = "la";
                        break;
                    case 6:
                        cadenaNota = "si";
                        break;
                }
                System.out.print(cadenaNota+ " ");
            }
            if (i==length-1) {
                System.out.println("||");
            }else{
                System.out.print("| ");  
            }
        }
    }
    
}
