package tema8_2.boletin1;

import java.io.IOException;
import java.util.Scanner;

public class Ej5_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vel ultricies arcu, posuere iaculis dui. Vestibulum sed eros a metus pretium vulputate non vel diam. Morbi porttitor diam nec lorem viverra, eget pulvinar eros condimentum. Aliquam non pretium ex. Cras vitae augue nec augue iaculis porttitor. Nullam a finibus orci, a pretium eros. Fusce ante ipsum, condimentum at eleifend vel, faucibus et sem. Curabitur congue libero ut nulla viverra, eget porta mauris porta. Mauris mauris purus, lacinia sed sapien id, mattis elementum nibh. Sed consequat dui vel est molestie, at iaculis nisi iaculis.\n\nSed at magna vel quam aliquam dapibus eu eget tortor. Fusce gravida efficitur neque, sit amet sodales velit mattis volutpat. Praesent a bibendum nulla. Vivamus viverra eros purus, ac faucibus augue gravida ac. Aliquam blandit arcu at efficitur rutrum. Vestibulum lacinia quis enim at semper. Aenean pulvinar venenatis diam vel mattis. Sed eleifend nulla a velit efficitur, a venenatis enim ultrices. Pellentesque id fringilla felis. Maecenas gravida ultricies dolor non vehicula. Quisque et sollicitudin odio, in sollicitudin turpis. Aenean vitae accumsan ipsum, at tempor nibh.";
        //Array donde se van a guardar las palabras del texto
        String[] palabras = texto.split(" ");
        String palabra = "";
        String primeraLetra = "";
        int cont = 0;

        System.out.println("Texto: ");
        // System.out.println(texto);
        // System.out.println();
        for (String elemento : palabras) {
            System.out.print(elemento.toString() + " ");
        }
        System.out.println();
        do {
            //Reseteamos el contador a 0 para que ponga la primera letra en mayúscula en cada vuelta
            cont = 0;
            // Pedimos la palabra a eliminar
            System.out.print("Introduce la palabra a eliminar (escribe salir para finalizar el programa):");
            palabra = s.nextLine().toLowerCase();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            // Si la palabra introducida es diferente a "salir" hace esto
            if (!palabra.equalsIgnoreCase("salir")) {
                //Recorre el array palabras, y si la palbra i coincide con la introducida, esa celda se borra en el array (se queda vacía)
                for (int i = 0; i < palabras.length; i++) {
                    if (palabra.equalsIgnoreCase(palabras[i])) {
                            palabras[i] = "";
                    }
                }
                //Muestra el array
                for (int i = 0; i < palabras.length; i++) {
                    if (!palabras[i].equals("")) {
                        //Esto es para poner la primera palabra que escribamos con la primera letra en mayúscula
                        if (cont==0) {
                            primeraLetra = palabras[i].substring(0,1);
                            palabras[i] = palabras[i].substring(1);
                            palabras[i] = primeraLetra.toUpperCase().concat(palabras[i]);
                        }
                        System.out.print(palabras[i].toString() + " ");
                        cont++;
                    }
                    
                }
            }
        } while (!palabra.equalsIgnoreCase("salir"));
        System.out.println("Gracias por usar nuestro programa, vuelva pronto");
    }
}
