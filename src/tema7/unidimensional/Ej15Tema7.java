package tema7.unidimensional;

import java.util.Scanner;

public class Ej15Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ocupacion = new int[10];
        int grupo = 0;
        boolean añadido = false;

        System.out.print("Mesa nº\t\t");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "\t");
        }
        System.out.println();
        System.out.print("Ocupación\t");
        for (int i = 0; i < ocupacion.length; i++) {
            ocupacion[i] = (int)(Math.random()*5);
            System.out.print(ocupacion[i] + "\t");
        }
        do {
            grupo = 0;
            do {
                System.out.println();
                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                grupo = s.nextInt();
                if (grupo > 4) {
                    System.out.println("Lo siento, no admitimos grupos de " + grupo
                            + ",   haga grupos de 4 personas como máximo e intente de nuevo.");
                }
            } while (grupo > 4);
            if (grupo != -1) {
                añadido = false;
                for (int i = 0; i < ocupacion.length; i++) {
                    if (ocupacion[i] == 0 && añadido == false) {
                        ocupacion[i] += grupo;
                        añadido = true;
                        System.out.println("Por favor, siéntese en la mesa número " + (i+1));
                    }
                }
                if (añadido==false) {
                    for (int i = 0; i < ocupacion.length; i++) {
                        if (ocupacion[i] + grupo <= 4 && añadido==false) {
                            System.out.println("Tendrán que compartir mesa. Por favor, siéntese en la mesa número " + (i+1));
                            ocupacion[i] += grupo;
                            añadido = true;
                        }
                    } 
                }
                if (añadido==false) {
                    System.out.println("Lo siento en estos momentos no queda sitio");
                }
                System.out.print("Mesa nº\t\t");
                for (int i = 0; i < 10; i++) {
                    System.out.print((i + 1) + "\t");
                }
                System.out.println();
                System.out.print("Ocupación\t");
                for (int i : ocupacion) {
                    System.out.print(i + "\t");
                }
            }
        } while (grupo != -1);
    }
}
