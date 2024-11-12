package tema7.unidimensional;

import java.util.Scanner;

public class Ej14Tema7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] palabras = new String[8];
        String colores[] = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] aux = new String[8];
        int posPalabras = 0, posColor = 0;
        Boolean color = false;

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i+1) + ": ");
            palabras[i] = s.nextLine();
            aux[i] = palabras[i];
            for (int j = 0; j < colores.length; j++) {
                if (palabras[i].equals(colores[j])) {
                    posPalabras++;
                }
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            color=false;
            for (int j = 0; j < colores.length; j++) {
                if (aux[i].equals(colores[j])) {
                    palabras[posColor] = aux[i];
                    color = true;
                }
            }
            if (color==true) {
                posColor++;
            }else{
                palabras[posPalabras] = aux[i];
                posPalabras++;
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] + " ");
        }
    }
}
