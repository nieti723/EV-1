/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author juann
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
 */
public class Ej11Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nota = "";
        int suspensos = 0, suficientes = 0, bienes = 0, notables = 0, sobresalientes = 0;
        for (int i = 1; i <= 20; i++) {
            int n = (int)(Math.random()*11);
            switch (n) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    nota = "suspenso";
                    suspensos++;
                    break;
                case 5:
                    nota = "suficiente";
                    suficientes++;
                    break;
                case 6:
                    nota = "bien";
                    bienes++;
                    break;
                case 7:
                case 8:
                    nota = "notable";
                    notables++;
                    break;
                case 9:
                case 10:
                    nota = "sobresaliente";
                    sobresalientes++;
                    break;
            }
            System.out.print("Nota nº" + i + ": ");
            if (i<10) {
                System.out.println(" "+ nota);
            }else{
                System.out.println(nota);
            }
        }
        System.out.println("----ESTADÍSTICAS----");
        System.out.println("Suspensos: " +suspensos);
        System.out.println("Suficientes: "+suficientes);
        System.out.println("Bienes: "+bienes);
        System.out.println("Notables: "+notables);
        System.out.println("Sobresalientes: "+sobresalientes);
    }
    
}
