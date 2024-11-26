package tema8_1.funciones;

import java.io.IOException;
import java.util.Scanner;

public class FuncionesMatematicas1_a_19 {

    public static void presentacion() throws InterruptedException, IOException {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca de funciones");
        System.out.println("Aquí se le mostrarán diferentes funcionalidades y usted");
        System.out.println("escogerá la que necesite");
        System.out.print("Pulse una tecla para continuar: ");
        s.nextLine();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static int menu() throws InterruptedException, IOException {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println("-----------------------------------MENÚ---------------------------------------");
        System.out.println("1. Determina si un número introducido por teclado es capicúa o no (true/false)");
        System.out.println("2. Determina si un número introducido por teclado es primo o no (true/false)");
        System.out.println("3. Muestra el siguiente valor primo de uno introducido por teclado");
        System.out
                .println("4. Muestra el resultado de la potencia de una base y un exponente introducidos por teclado");
        System.out.println("5. Muestra la cantidad de dígitos de un número introducido por teclado");
        System.out.println("6. Voltea un número introducido por teclado");
        System.out.println(
                "7. Devuelve el dígito que se encuentra en la posición n de un número introducida por teclado");
        System.out
                .println("8. Da la posición de la primer ocurrencia de un dígito introducido por teclado de un número");
        System.out.println("9. Retira n dígitos por detrás de un número introducido por teclado");
        System.out.println("10. Retira n dígitos por delante de un número introducido por teclado");
        System.out.println("11. Añade un dígito n por detrás al número introducido");
        System.out.println("12. Añade un dígito n por delante al número introducido");
        System.out.println("13. Devuelve los dígitos de un intervalo introducido por teclado");
        System.out.println("14. Pega dos números para formar uno");
        System.out.println("15. Miestra los números primos entre 1 y 1000");
        System.out.println("16. Muestra los número capicúa entre 1 y 99999");
        System.out.println("17. Salir");
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

    public static boolean esCapicua(int num) {
        int volteado = 0, residuo = num;
        for (int i = 1; i <= digitos(num); i++) {
            volteado += residuo % 10 * ((int) (Math.pow(10, digitos(num) - i)));
            residuo /= 10;
        }
        if (volteado == num) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPrimo(int num) {
        int div = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                div++;
            }
        }
        if (div > 1) {
            return false;
        } else {
            return true;
        }
    }

    public static int siguientePrimo(int num) {
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

    public static int potencia(int base, int exponente) {
        return (int) (Math.pow(base, exponente));
    }

    public static int potencia(int base, int exponente, int opcion) {
        int resultado = base;
        for (int i = 0; i < exponente - 1; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int digitos(int num) {
        int dig = 0;
        while (num > 0) {
            num /= 10;
            dig++;
        }
        return dig;
    }

    public static int volteaNumero(int num) {
        int volteado = 0, residuo = num;
        for (int i = 1; i <= digitos(num); i++) {
            volteado += residuo % 10 * ((int) (Math.pow(10, digitos(num) - i)));
            residuo /= 10;
        }
        return volteado;
    }

    public static int digitoN(int num, int n) {
        // Primero divimos entre 10 elevado a la cantidad de dígitos menos n (posición del número elegida por el usuario) + 1 (ya que empezamos en 0)
        num = num / (int) (Math.pow(10, digitos(num) - (n + 1)));
        num = num % 10;
        return num;
    }

    public static int posDig(int num, int dig) {
        int primero = 0, posición = 0, aux = num;
        boolean encontrado = false;
        for (int i = 0; i < digitos(aux) && !encontrado; i++) {
            primero = num / (int) (Math.pow(10, digitos(num) - 1));
            num = num % (int) (Math.pow(10, digitos(aux) - (i + 1)));
            if (primero == dig) {
                encontrado = true;
                posición = i;
            }
        }
        if (encontrado) {
            return posición;
        } else {
            return -1;
        }
    }

    public static int quitaDetras(int num, int cantidad) {
        num /= (int) (Math.pow(10, cantidad));
        return num;
    }

    public static int quitaDelante(int num, int cantidad) {
        num %= (int) (Math.pow(10, digitos(num) - cantidad));
        return num;
    }

    public static int pegaDetras(int num, int dig){
        num = (num*10) + dig;
        return num;
    }

    public static int pegaDelante(int num, int dig){
        num = num + ((int)Math.pow(10, digitos(num))*dig);
        return num;
    }


    public static int trozoNumero(int num, int ini, int ult){
        num /= (int)(Math.pow(10, digitos(num)-(ult+1)));
        num %= (int)(Math.pow(10, ini));
        return num;
    }

    public static int juntaNumeros(int num, int num2){
        num = num2 + (num*(int)(Math.pow(10, digitos(num2))));
        return num;
    }

    public static void muestraPrimos(){
        for (int i = 1; i <= 1000; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void muestraCapicua(){
        for (int i = 1; i <= 99999; i++) {
            if (esCapicua(i)) {
                System.out.print(i + " ");
            }
        }
    }
}