package tema9;

import java.io.IOException;

public class PruebaFraccion {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Fraccion f1 = new Fraccion(7, 3);
        Fraccion f2 = new Fraccion(4, 8);
        Fraccion resultado = new Fraccion();

        System.out.println(f1);
        System.out.println(f2);

        resultado = f1.multiplica(f2);
        System.out.println(resultado);
    }
}
