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
            System.out.print("Introduce el número: ");
            num = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(FuncionesMatematicas1_a_19.esCapicua(num));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 2:
                    System.out.println(FuncionesMatematicas1_a_19.esPrimo(num));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 3:
                    System.out.println(FuncionesMatematicas1_a_19.siguientePrimo(num));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 4:
                    System.out.print("Introduzca el exponente: ");
                    exponente = s.nextInt();
                    System.out.print("¿Qué método desea utilizar? (1.Math.pow | 2.Bucle): ");
                    do {
                        metodo = s.nextInt();
                        if (metodo > 2 || metodo < 1) {
                            System.out.print("Valor no válido, introduzcalo de nuevo: ");
                        }
                    } while (metodo > 2 || metodo < 1);
                    if (metodo == 1) {
                        System.out.println(FuncionesMatematicas1_a_19.potencia(num, exponente));
                    } else {
                        System.out.println(FuncionesMatematicas1_a_19.potencia(num, exponente, 1));
                    }
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 5:
                    System.out.println(
                            "El número " + num + " tiene " + FuncionesMatematicas1_a_19.digitos(num) + " dígitos");
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 6:
                    System.out.println("El número " + num + " volteado es " + FuncionesMatematicas1_a_19.volteaNumero(num));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 7:
                    System.out.print("Introduce la posición del dígito: ");
                    int posDig = s.nextInt();
                    System.out.println("El dígito que ocupa la posición " + posDig + " en el número " + num + " es " + FuncionesMatematicas1_a_19.digitoN(num, posDig));
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
