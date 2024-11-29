package tema8_2.boletin1;

import java.util.Scanner;

public class Ej3_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nombres = {"Ana", "Maria", "Paco", "Lucía", "Belén", "Antonio", "Pedro", "Aurelio", "Alicia", "Lola", "Antonia"};
        System.out.println("Nombres concidos:");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println();
        System.out.print("Introduzca el filtro de incio: ");
        String filtroInicio = s.nextLine().toLowerCase();
        System.out.print("Introduzca el filtro de fin: ");
        String filtroFin = s.nextLine().toLowerCase();
        for (String nombre : nombres) {
            if (nombre.toLowerCase().startsWith(filtroInicio) && nombre.toLowerCase().endsWith(filtroFin)) {
                System.out.print(nombre + " ");
            }
        }
    }
}
