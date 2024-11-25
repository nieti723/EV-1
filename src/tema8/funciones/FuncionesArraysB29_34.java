package tema8.funciones;

import java.io.IOException;
import java.util.Scanner;

public class FuncionesArraysB29_34 {

    public static void presentacion() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Bienvenido a la biblioteca de funciones de Arrays bidimensionales");
        System.out.println("Aquí se le mostrarán diferentes funcionalidades y usted");
        System.out.println("escogerá la que necesite");
        salir();
    }

    @SuppressWarnings("resource")
    public static void salir() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Pulse una tecla para continuar: ");
        s.nextLine();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static int[][] generaArrayBiInt(int filas, int columnas, int inicio, int ultimo) throws InterruptedException, IOException{
        int[][] array = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = (int)(Math.random()*(ultimo-inicio+1))+(inicio);
            }
        }
        System.out.println("Array generado:");
        muestraArrayBi(array);
        salir();
        return array;
    }

    public static int menu() throws InterruptedException, IOException {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println("-----------------------------------MENÚ---------------------------------------");
        System.out.println("1. Devuelve la fila i-ésima del array");
        System.out.println("2. Devuelve la columna j-ésima del array");
        System.out.println("3. Devuelve la fila y la columna de la primera ocurrencia de un valor introducido por teclado");
        System.out
                .println("4. Determina si un número es punto de silla");
        System.out.println("5. Devuelve un array que contiene las diagonales del array generado");
        System.out.println("6. Salir");
        System.out.print("Escoja una opción: ");
        opcion = s.nextInt();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        return opcion;
    }

    public static void muestraArrayBi(int[][] array){
        for (int[] is : array) {
            for (int i : is) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static void filaArray(int[][] array, int fila, int columnas) throws InterruptedException, IOException{
        System.out.println("Array generado: ");
        muestraArrayBi(array);
        System.out.println();
        System.out.print("Fila " + fila + ": ");
        for (int i = 0; i < columnas; i++) {
            System.out.print(array[fila][i] + " ");
        }
        System.out.println();
        salir();
    }

    public static void columnaArray(int[][] array, int columna, int filas) throws InterruptedException, IOException{
        System.out.println("Array generado: ");
        muestraArrayBi(array);
        System.out.println();
        System.out.print("Columna " + columna + ": ");
        for (int i = 0; i < filas; i++) {
            System.out.print(array[i][columna] + " ");
        }
        System.out.println();
        salir();
    }
    
    public static int[] coordenadasArray (int[][] array, int num, int filas, int columnas){
        boolean encontrado = false;
        int[] posEncontrado = new int[2];
        for (int i = 0; i < filas && !encontrado; i++) {
            for (int j = 0; j < columnas && !encontrado; j++) {
                if (array[i][j] == num) {
                    encontrado = true;
                    posEncontrado[0] = i;
                    posEncontrado[1] = j;
                }
            }
        }
        if (encontrado) {
            return posEncontrado;
        }else{
            posEncontrado[0] = -1;
            posEncontrado[1] = -1;
            return posEncontrado;
        }
    }
}
