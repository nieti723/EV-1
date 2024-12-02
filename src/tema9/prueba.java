package tema9;

import java.io.IOException;

public class prueba {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Boligrafo.pinta();
        Boligrafo boligrafoRegalado = new Boligrafo();
        Boligrafo boligrafoComprado = new Boligrafo("azul", 7);
        Boligrafo boliaAmarillo = new Boligrafo(3);
        System.out.println(boligrafoRegalado);
        System.out.println(boligrafoComprado);
        
        boliaAmarillo.rebaja();
        System.out.println("El precio de boígrafo de color amarillo es de " + boliaAmarillo.getPrecio() + " €");
        
    }
}
