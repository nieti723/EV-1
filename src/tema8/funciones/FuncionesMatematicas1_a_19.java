package tema8.funciones;

import java.io.IOException;
import java.util.Scanner;

public class FuncionesMatematicas1_a_19 {

    public static void presentacion() throws InterruptedException, IOException{
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca de funciones");
        System.out.println("Aquí se le mostrarán diferentes funcionalidades y usted");
        System.out.println("escogerá la que necesite");
        System.out.print("Pulse una tecla para continuar: ");
        s.nextLine();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static int menu() throws InterruptedException, IOException{
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println("----------MENÚ----------");
        System.out.println("1. Determina si un número introducido por teclado es capicúa o no (true/false)");
        System.out.println("2. Determina si un número introducido por teclado es primo o no (true/false)");
        System.out.println("3. Muestra el siguiente valor primo de uno introducido por teclado");
        System.out.println("4. Muestra el resultado de la potencia de una base y un exponente introducidos por teclado");
        System.out.println("5. Muestra la cantidad de dígitos de un número introducido por teclado");
        System.out.println("6. Salir");
        System.out.print("Escoja una opción: ");
        opcion = s.nextInt();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        return opcion;
    }

    public static boolean esCapicua(int num){
        int volteado = 0, residuo = num;
        for (int i = 1; i <= digitos(num); i++) {
            volteado+= residuo%10*((int)(Math.pow(10, digitos(num)-i)));
            residuo = residuo/10;
        }
        if (volteado==num) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean esPrimo(int num){
        int div = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i==0) {
                div++;
            }
        }
        if (div>1) {
            return false;
        }else{
            return true;
        }
    }

    public static int siguientePrimo(int num){
        boolean encontrado = false;
        int siguiente = num;
        do {
            siguiente++;
            if (esPrimo(siguiente)) {
                encontrado = true;
            }
        } while (!encontrado);
        return siguiente;
    }

    public static int potencia(int base, int exponente){
        return (int)(Math.pow(base, exponente));
    }

    public static int potencia(int base, int exponente, int opcion){
        int resultado = base;
        for (int i = 0; i < exponente-1; i++) {
            resultado*= base;
        }
        return resultado;
    }

    public static int digitos(int num){
        int dig = 0;
        while (num>0) {
            num/=10;
            dig++;
        }
        return dig;
    }
}