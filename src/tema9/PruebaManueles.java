package tema9;

import java.io.IOException;

public class PruebaManueles {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        Manueles[] arrayM = new Manueles[2500];
        arrayM[0] = new Manueles(18);
        arrayM[1] = new Manueles(20);
        arrayM[2] = new Manueles(23);
        for (Manueles manueles : arrayM) {
            if (!(manueles == null)) {
                System.out.println(manueles);
            }
        }
        
        
        
        
        
        // Manueles m3 = new Manueles(28);
        // System.out.println(m0);
        // System.out.println(m1);
        // System.out.println(m2);
        // System.out.println(m3);
    }
    
}