package tema8.main;

import java.io.IOException;
import java.util.Scanner;

import tema8.funciones.FuncionesArrays20_28;

public class PruebaArrays {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        // Declaración de variables
        int tamaño, inicio, ultimo, opcion;
        boolean continuar = true;
        FuncionesArrays20_28.presentacion();
        //Datos para generar el array
        System.out.println("Primero debemos de generar el array");
        System.out.print("Introduzca el tamaño: ");
        tamaño = s.nextInt();
        System.out.print("Introduzca el inicio del intervalo de los número generados: ");
        inicio = s.nextInt();
        System.out.print("Introduzca el ultimo del intervalo de los número generados: ");
        ultimo = s.nextInt();
        int[] array = FuncionesArrays20_28.generaArrayInt(tamaño, inicio, ultimo);
        int[] aux = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //Mostramos el menú
        do {
            System.out.println("Array generado: ");
            FuncionesArrays20_28.mostrarArray(aux);
            for (int i = 0; i < aux.length; i++) {
                array[i] = aux[i];
            }
            opcion = FuncionesArrays20_28.menu();
            switch (opcion) {
                case 1:
                    System.out.println("El valor mínimo del array generado es " + FuncionesArrays20_28.minimoArrayInt(array, ultimo));
                    FuncionesArrays20_28.salir();
                    break;
                case 2:
                    System.out.println("El valor mínimo del array generado es " + FuncionesArrays20_28.maximoArrayInt(array, inicio));
                    FuncionesArrays20_28.salir();
                    break;
                case 3:
                    System.out.println("La media del array generado es: " + FuncionesArrays20_28.mediaArrayInt(array, tamaño));
                    FuncionesArrays20_28.salir();
                    break;
                case 4:
                    System.out.print("Introduce el número a comprobar: ");
                    int comprobar = s.nextInt();
                    if (FuncionesArrays20_28.estaEnArrayInt(array, comprobar)) {
                        System.out.println("El número " + comprobar + " se encuentra en el array generado");
                    }else{
                        System.out.println("No se ha encontrado el número introducido");
                    }
                    FuncionesArrays20_28.salir();
                    break;
                case 5:
                    System.out.print("Introduce el número a comprobar: ");
                    comprobar = s.nextInt();
                    System.out.println("El número introducido (" + comprobar + ") se encuentra en la posición " + FuncionesArrays20_28.posicionEnArray(array, comprobar));
                    FuncionesArrays20_28.salir();
                    break;
                case 6:
                    System.out.println("Array original: ");
                    FuncionesArrays20_28.mostrarArray(array);
                    System.out.println("Array volteado: ");
                    FuncionesArrays20_28.mostrarArray(FuncionesArrays20_28.volteaArrayInt(array));
                    FuncionesArrays20_28.salir();
                    break;    
                case 7:
                    System.out.print("Introduzca la cantidad de dígitos a rotar: ");
                    int posiciones = s.nextInt();
                    System.out.println("Array original:");
                    FuncionesArrays20_28.mostrarArray(array);
                    System.out.println("Array volteado:");
                    FuncionesArrays20_28.mostrarArray(FuncionesArrays20_28.rotaDerechaArrayInt(array, posiciones));
                    FuncionesArrays20_28.salir();
                    break;
                case 8:
                System.out.print("Introduzca la cantidad de dígitos a rotar: ");
                    posiciones = s.nextInt();
                    System.out.println("Array original:");
                    FuncionesArrays20_28.mostrarArray(array);
                    System.out.println("Array volteado:");
                    FuncionesArrays20_28.mostrarArray(FuncionesArrays20_28.rotaIzquierdaArrayInt(array, posiciones));
                    FuncionesArrays20_28.salir();
                    break;
                default:
                    continuar = false;
                    System.out.println("Gracias por usar nuestro programa, vuelva pronto");
                    break;
            }
        } while (continuar);
    }
}
