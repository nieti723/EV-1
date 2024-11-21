package tema8.main;

import java.io.IOException;
import java.util.Scanner;

import tema8.funciones.FuncionesMatematicas1_a_19;

public class Pruebas {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        int num = 0, opcion;
        boolean continuar = true;
        FuncionesMatematicas1_a_19.presentacion();
        do {
            opcion = FuncionesMatematicas1_a_19.menu();
            if (opcion>0 && opcion<15) {
                System.out.print("Introduce el número: ");
                num = s.nextInt();  
            }
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
                    int exponente = s.nextInt();
                    System.out.print("¿Qué método desea utilizar? (1.Math.pow | 2.Bucle): ");
                    int metodo;
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
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 8:
                    System.out.print("Introduce el dígito a buscar: ");
                    int dig = s.nextInt();
                    System.out.println("Posición: " + FuncionesMatematicas1_a_19.posDig(num, dig));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 9:
                    System.out.print("Introduce la cantidad de dígitos a retirar: ");
                    int cantidad = s.nextInt();
                    System.out.println("Número original: " + num);
                    System.out.println("Número con " + cantidad + " digito(s) retirado(s) " + FuncionesMatematicas1_a_19.quitaDetras(num, cantidad));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 10:
                    System.out.print("Introduce la cantidad de dígitos a retirar: ");
                    cantidad = s.nextInt();
                    System.out.println("Número original: " + num);
                    System.out.println("Número con " + cantidad + " digito(s) retirado(s) " + FuncionesMatematicas1_a_19.quitaDelante(num, cantidad));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                default:
                    continuar = false;
                    System.out.println("Gracias por usar nuestro programa, vuelva pronto");
                    break;
            }
        } while (continuar);
    }
}
