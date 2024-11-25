package tema8.main;

import java.io.IOException;
import java.util.Scanner;

import tema8.funciones.FuncionesArraysB29_34;

public class PruebaArraysB {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        int filas, columnas, inicio, ultimo, op;
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
                    System.out.print("Introduce la fila a mostrar: ");
                    int fila = s.nextInt();
                    FuncionesArraysB29_34.filaArray(array, fila, columnas);
                    break;
                case 2:
                    System.out.print("Introduce la fila a mostrar: ");
                    int columna = s.nextInt();
                    FuncionesArraysB29_34.columnaArray(array, columna, filas);
                    break;
                case 3:
                    System.out.print("Introduce el número a buscar: ");
                    int buscar = s.nextInt();
                    int[] encontrado = FuncionesArraysB29_34.coordenadasArray(array, buscar, filas, columnas);
                    System.out.println("El número " + buscar + " se encuentra en el array en la posición " + encontrado[0] + ", " + encontrado[1]);
                    System.out.println("Array generado: ");
                    FuncionesArraysB29_34.muestraArrayBi(array);
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
