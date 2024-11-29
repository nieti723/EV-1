package tema9;

import java.io.IOException;

public class prueba {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Boligrafo.pinta();
        Boligrafo boligrafoRegalado = new Boligrafo();
        Boligrafo boligrafoComprado = new Boligrafo("azul", 7);
        System.out.println(boligrafoRegalado);
        System.out.println(boligrafoComprado);
        
    }
}
