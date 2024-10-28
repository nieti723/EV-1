package tema7;

public class Ej10Tema7 {
    public static void main(String[] args) {
        int[] num = new int[20];
        int par = 0, impar = 0, contPares = 0, contImpares = 0, n = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*101);
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2==0) {
                par++;
            }else{
                impar++;
            }
        }
        int[] pares = new int[par];
        int[] impares = new int[impar];
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2==0) {
                pares[contPares]=num[i];
                contPares++;
            }else{
                impares[contImpares]=num[i];
                contImpares++;
            }
        }
        System.out.println("Array generado: ");
        for (int i = 0; i < num.length; i++) {
            if (i==num.length-1) {
                System.out.print(num[i]);
            }else{
                System.out.print(num[i] + ", ");
            }
        }
        for (int i = 0; i < pares.length; i++) {
            num[i] = pares[i];
        }
        for (int i = pares.length; i < num.length; i++) {
            num[i] = impares[n];
            n++;
        }
        System.out.println("\nNuevo array: ");
        for (int i = 0; i < num.length; i++) {
            if (i==num.length-1) {
                System.out.print(num[i]);
            }else{
                System.out.print(num[i] + ", ");
            }
        }
    }
}
