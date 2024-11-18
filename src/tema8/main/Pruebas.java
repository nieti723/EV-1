package tema8.main;

import java.io.IOException;
import java.util.Scanner;

import tema8.funciones.FuncionesMatematicas1_a_19;

public class Pruebas {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        int num, exponente, opcion, metodo;
        boolean continuar = true;
        FuncionesMatematicas1_a_19.presentacion();
        do {
            opcion = FuncionesMatematicas1_a_19.menu();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el número a comprobar: ");
                    num = s.nextInt();
                    System.out.println(FuncionesMatematicas1_a_19.esCapicua(num));
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                case 2:
                    System.out.print("Introduce el número a comprobar: ");
                    num = s.nextInt();
                    System.out.println(FuncionesMatematicas1_a_19.esPrimo(num));
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                case 3:
                    System.out.print("Introduce el número: ");
                    num = s.nextInt();
                    System.out.println(FuncionesMatematicas1_a_19.siguientePrimo(num));
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                    case 4:
                    System.out.print("Introduzca la base: ");
                    num = s.nextInt();
                    System.out.print("Introduzca el exponente: ");
                    exponente = s.nextInt();
                    System.out.print("¿Qué método desea utilizar? (1.Math.pow | 2.Bucle): ");
                    do {
                        metodo = s.nextInt();
                        if (metodo>2 || metodo<1) {
                            System.out.print("Valor no válido, introduzcalo de nuevo: ");
                        }
                    } while (metodo>2 || metodo<1);
                    if (metodo==1) {
                        System.out.println(FuncionesMatematicas1_a_19.potencia(num, exponente));
                    }else{
                        System.out.println(FuncionesMatematicas1_a_19.potencia(num, exponente,1));
                    }
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                case 5:
                    System.out.print("Introduce el número: ");
                    num = s.nextInt();
                    System.out.println("El número " + num + " tiene " + FuncionesMatematicas1_a_19.digitos(num) + " dígitos");
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                default:
                continuar=false;
                    break;
            }
        } while (continuar);
    }
}
