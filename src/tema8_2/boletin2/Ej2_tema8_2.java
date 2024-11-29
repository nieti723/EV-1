package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej2_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        //VARIABLES
        String frase = "Tengo una hormiguita en la patita, que me está haciendo cosquillitas y no me puedo aguantar";
        //Variable que se encarga de almacenar la cadena modificada con la vocal introducida por el usuario
        String modificada = "";
        // Vocal introducida por el usuario
        String vocal;
        String[] vocales = {"a","e","i","o","u"};
        boolean valido = false;

        //PROGRAMA
        System.out.println("Frase original: ");
        System.out.println(frase);
        do {
            System.out.print("Introduce una vocal para sustituir: ");
            vocal = s.nextLine();
            for (int i = 0; i < vocales.length; i++) {
                if (!vocal.equals(vocales[i])) {
                    valido = false;
                }
            }
            
        } while (!valido);
    }
}
