package tema8_2.boletin1;

import java.util.Scanner;

public class Ej1_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = s.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = s.nextLine();
        System.out.print("Cadena más larga: ");
        if (cadena1.length()>cadena2.length()) {
            System.out.println(cadena1);
            System.out.println("Longitud: " + cadena1.length());
        }else{
            System.out.println(cadena2);
            System.out.println("Longitud: " + cadena2.length());
        }
    }
}
