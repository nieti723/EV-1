/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6
 */
public class Ej8Tema6 {

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
                int n = (int)(Math.random()*6);
                switch (n) {
                        case 0:
                        case 1:
                        case 2:
                            car = "| X |";
                            break;
                        case 3:
                        case 4:
                            car = "| 1 |";
                            break;
                        case 5:
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
