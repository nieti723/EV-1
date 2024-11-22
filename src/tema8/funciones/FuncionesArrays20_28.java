package tema8.funciones;

import java.io.IOException;
import java.util.Scanner;

public class FuncionesArrays20_28 {

    public static void presentacion() throws InterruptedException, IOException{
        System.out.println("Bienvenido a la biblioteca de funciones de Arrays");
        System.out.println("Aquí se le mostrarán diferentes funcionalidades y usted");
        System.out.println("escogerá la que necesite");
        salir();
    }

    public static int menu() throws InterruptedException, IOException {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println("-----------------------------------MENÚ---------------------------------------");
        System.out.println("1. Devuelve el mínimo del array generado");
        System.out.println("2. Devuelve el máximo del array generado");
        System.out.println("3. Devuelve la media de array generado");
        System.out
                .println("4. Devuelve true o false dependiendo si un número introducido por teclado se encuentra en el array");
        System.out.println("5. Devuelve la posición en el array de un número introducido por teclado(si no se encuentra devuelve -1)");
        System.out.println("6. Voltea el array");
        System.out.println(
                "7. Rota n posicions a la derecha los valores del array");
        System.out
                .println("8. Rota n posicions a la derecha los valores del array");
        System.out.println("9. Salir");
        System.out.print("Escoja una opción: ");
        opcion = s.nextInt();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        return opcion;
    }

    @SuppressWarnings("resource")
    public static void salir() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Pulse una tecla para continuar: ");
        s.nextLine();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static int[] generaArrayInt(int tamaño, int inicio, int ultimo){
        int[] array = new int[tamaño];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(ultimo-inicio+1))+(inicio);
        }
        return array;
    }

    public static void mostrarArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int minimoArrayInt(int[] array, int ultimo){
        int minimo = ultimo+1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static int maximoArrayInt(int[] array, int inicio){
        int maximo = inicio;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public static double mediaArrayInt(int[] array, int tamaño){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma/tamaño;
    }

    public static boolean estaEnArrayInt(int[] array, int comprobar){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==comprobar) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int[] array, int comprobar){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==comprobar) {
                return i;
            }
        }
        return -1;
    }

    public static int[] volteaArrayInt(int[] array){
        int cont = 0;
        int[] aux = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            aux[cont] = array[i];
            cont++;
        }
        return aux;
    }

    public static int[] rotaDerechaArrayInt(int[] array, int posiciones){
        int[] aux = new int[array.length];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = array[i];
        }
        for (int i = 0; i < aux.length-posiciones; i++) {
            array[i+posiciones] = aux[i];
        }
        for (int i = 0; i < posiciones; i++) {
            array[i] = aux[array.length-posiciones+i];
        }
        return array;
    }

    public static int[] rotaIzquierdaArrayInt(int[] array, int posiciones){
        int[] aux = new int[array.length];
        int cont = 0;
        for (int i = 0; i < aux.length; i++) {
            aux[i] = array[i];
        }
        for (int i = array.length-1; i >= posiciones; i--) {
            array[i-posiciones] = aux[i];
        }
        for (int i = array.length-posiciones; i <= array.length-1; i++) {
            array[i] = aux[cont];
            cont++;
        }
        return array;
    }

}
