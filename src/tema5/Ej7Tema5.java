/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 * @author juann Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class Ej7Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pass = 4321, user;
        System.out.print("Introduzca la combinación de cuatro dígitos para acceder a su caja fuerte: ");
        user = s.nextInt();
        while (user > 9999) {
            System.out.println("La clave no puede tener más de 4 dígitos, ingrese una clave válida");
            System.out.print("Clave: ");
            user = s.nextInt();
        }
        for (int i = 3; i > 0; i--) {
            if (user == pass) {
                i = 0;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                System.out.println("Quedan " + i + " intentos");
                System.out.print("Clave: ");
                user = s.nextInt();
                while (user > 9999) {
                    System.out.println("La clave no puede tener más de 4 dígitos, ingrese una clave válida");
                    System.out.print("Clave: ");
                    user = s.nextInt();
                }
            }
        }
        if (user != pass) {
            System.out.println("Intentos agotados, vuelva más tarde");
        } else {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        }
    }

}
