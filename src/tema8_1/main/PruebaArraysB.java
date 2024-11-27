package tema8_1.main;

import java.io.IOException;
import java.util.Scanner;

import tema8_1.funciones.FuncionesArraysB29_34;

public class PruebaArraysB {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        int filas, columnas, inicio, ultimo, op, cont = 0;
        boolean continuar = true;

        FuncionesArraysB29_34.presentacion();
        System.out.println("Primero debemos de generar el array");
        System.out.print("Introduzca el número de filas: ");
        filas = s.nextInt();
        System.out.print("Introduzca el número de columnas: ");
        columnas = s.nextInt();
        System.out.print("Introduzca el inicio del intervalo de los número generados: ");
        inicio = s.nextInt();
        System.out.print("Introduzca el ultimo del intervalo de los número generados: ");
        ultimo = s.nextInt();
        int[][] array = FuncionesArraysB29_34.generaArrayBiInt(filas, columnas, inicio, ultimo);

        do {
            System.out.println("Array generado:");
            FuncionesArraysB29_34.muestraArrayBi(array);
            op = FuncionesArraysB29_34.menu();
            switch (op) {
                case 1:
                    System.out.println("Array generado: ");
                    FuncionesArraysB29_34.muestraArrayBi(array);
                    System.out.print("Introduce la fila a mostrar: ");
                    int fila = s.nextInt();
                    FuncionesArraysB29_34.filaArray(array, fila, columnas);
                    break;
                case 2:
                    System.out.println("Array generado: ");
                    FuncionesArraysB29_34.muestraArrayBi(array);
                    System.out.print("Introduce la fila a mostrar: ");
                    int columna = s.nextInt();
                    FuncionesArraysB29_34.columnaArray(array, columna, filas);
                    break;
                case 3:
                    System.out.println("Array generado: ");
                    FuncionesArraysB29_34.muestraArrayBi(array);
                    System.out.print("Introduce el número a buscar: ");
                    int buscar = s.nextInt();
                    int[] encontrado = FuncionesArraysB29_34.coordenadasArray(array, buscar, filas, columnas);
                    System.out.println("El número " + buscar + " se encuentra en el array en la posición " + encontrado[0] + ", " + encontrado[1]);
                    FuncionesArraysB29_34.salir();
                    break;
                case 4:
                    System.out.println("Array generado: ");
                    FuncionesArraysB29_34.muestraArrayBi(array);
                    System.out.print("Introduce el valor a comprobar: ");
                    int num = s.nextInt();
                    if (FuncionesArraysB29_34.esPuntoDeSilla(array, num, filas, columnas)) {
                        System.out.println("El valor introducido es punto de silla");
                    }else{
                        System.out.println("El valor introducido no es punto de silla");
                    }
                    FuncionesArraysB29_34.salir();
                    break;
                case 5:
                    if (cont==0) {
                        s.nextLine();
                        cont++;
                    }
                    System.out.println("Array generado: ");
                    FuncionesArraysB29_34.muestraArrayBi(array);
                    String diagonal = "";
                    do {
                        System.out.println("1. Escriba \"nose\" para la diagonal que va desde noroeste hasta sureste");
                        System.out.println("2. Escriba \"neso\" para la diagonal que va desde noreste hasta suroeste");
                        diagonal = s.nextLine();
                        if (!diagonal.equals("neso") && !diagonal.equals("nose")) {
                            System.out.println("Opción incorrecta, inténtelo de nuevo.");
                            FuncionesArraysB29_34.salir();
                        }
                    } while (!diagonal.equals("neso") && !diagonal.equals("nose"));
                    System.out.println("Array generado: ");
                    FuncionesArraysB29_34.muestraArrayBi(array);
                    int[] diagonalArray = FuncionesArraysB29_34.diagonal(array, filas, columnas, diagonal);
                    System.out.println("Array diagonal:");
                    for (int i : diagonalArray) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    FuncionesArraysB29_34.salir();
                    break;
                default:
                    System.out.println("Gracias por usar nuestra aplicación, vuelva pronto");
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
