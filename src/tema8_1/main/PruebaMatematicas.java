package tema8_1.main;

import java.io.IOException;
import java.util.Scanner;

import tema8_1.funciones.FuncionesMatematicas1_a_19;

public class PruebaMatematicas {

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
                case 11:
                    System.out.print("Introduce el dígito a añadir: ");
                    dig = s.nextInt();
                    System.out.println("Número original: " + num);
                    System.out.println("Número modificado: " + FuncionesMatematicas1_a_19.pegaDetras(num, dig));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 12:
                    System.out.print("Introduce el dígito a añadir: ");
                    dig = s.nextInt();
                    System.out.println("Número original: " + num);
                    System.out.println("Número modificado: " + FuncionesMatematicas1_a_19.pegaDelante(num, dig));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 13:
                int ini = 0, ult = 0;
                    do {
                        System.out.print("Introduzca la posición inicial: ");
                        ini = s.nextInt();
                        System.out.print("Introduzca la posición final: ");
                        ult = s.nextInt();
                        if (ini>ult) {
                            System.out.println("El valor inicial no puede ser mayor al valor final");
                        }
                    } while (ini>ult);
                    System.out.println("Número original: " + num);
                    System.out.println("Número desde la posición " + ini + " hasta la posición " + ult + ": " +  FuncionesMatematicas1_a_19.trozoNumero(num, ini, ult));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 14:
                    int num2 = 0;
                    System.out.print("Introduce el segundo número: ");
                    num2 = s.nextInt();
                    System.out.println("Número 1: " + num);
                    System.out.println("Número 2: " + num2);
                    System.out.println("Concatenación: " + FuncionesMatematicas1_a_19.juntaNumeros(num, num2));
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 15:
                    FuncionesMatematicas1_a_19.muestraPrimos();
                    System.out.println();
                    FuncionesMatematicas1_a_19.salir();
                    break;
                case 16:
                    FuncionesMatematicas1_a_19.muestraCapicua();
                    System.out.println();
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
