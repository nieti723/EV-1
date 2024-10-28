package tema6;

import java.io.IOException;

public class Ej13Tema6 {
    public static void main(String[] args) throws InterruptedException, IOException {
        int dado1=0, dado2=0, cont = 1;
        do {            
            Thread.sleep(2000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("TIRADA Nº"+cont);
            dado1 = (int)(Math.random()*8)+1;
            dado2 = (int)(Math.random()*8)+1;
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("----------------");
            cont++;
        } while (dado1!=dado2);
        System.out.println("Los dados coinciden");
    }
    
}
