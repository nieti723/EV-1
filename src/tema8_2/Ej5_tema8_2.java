package tema8_2;

import java.io.IOException;
import java.util.Scanner;

public class Ej5_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vel ultricies arcu, posuere iaculis dui. Vestibulum sed eros a metus pretium vulputate non vel diam. Morbi porttitor diam nec lorem viverra, eget pulvinar eros condimentum. Aliquam non pretium ex. Cras vitae augue nec augue iaculis porttitor. Nullam a finibus orci, a pretium eros. Fusce ante ipsum, condimentum at eleifend vel, faucibus et sem. Curabitur congue libero ut nulla viverra, eget porta mauris porta. Mauris mauris purus, lacinia sed sapien id, mattis elementum nibh. Sed consequat dui vel est molestie, at iaculis nisi iaculis.\n\nSed at magna vel quam aliquam dapibus eu eget tortor. Fusce gravida efficitur neque, sit amet sodales velit mattis volutpat. Praesent a bibendum nulla. Vivamus viverra eros purus, ac faucibus augue gravida ac. Aliquam blandit arcu at efficitur rutrum. Vestibulum lacinia quis enim at semper. Aenean pulvinar venenatis diam vel mattis. Sed eleifend nulla a velit efficitur, a venenatis enim ultrices. Pellentesque id fringilla felis. Maecenas gravida ultricies dolor non vehicula. Quisque et sollicitudin odio, in sollicitudin turpis. Aenean vitae accumsan ipsum, at tempor nibh.";
        String palabra = "";

        System.out.println("Texto: ");
        System.out.println(texto);
        System.out.println();
        do {
            // Pedimos la palabra a eliminar
            System.out.print("Introduce la palabra a eliminar (escribe salir para finalizar el programa):");
            palabra = s.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            // Si la palbra introducida es diferente a "salir" hace esto
            if (!palabra.equalsIgnoreCase("salir")) {
                texto = texto.replaceAll(palabra.toLowerCase(), "");
                System.out.println("Texto modificado: ");
                System.out.println(texto);
                System.out.println();
            }
        } while (!palabra.equalsIgnoreCase("salir"));
        System.out.println("Gracias por usar nuestro programa, vuelva pronto");
    }
}
