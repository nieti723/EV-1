package tema9;

import java.io.IOException;

public class PruebaMovil {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Movil miPrimerMovilPremium = new Movil("Iphone", "16i");
        miPrimerMovilPremium.setPrecio(500);
        System.out.println(miPrimerMovilPremium.getPrecio());
    }
}
