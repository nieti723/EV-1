package tema9;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo h1 = new Tiempo(0, 29, 20);
        Tiempo h2 = new Tiempo(0, 30, 40);
        Tiempo h3 = h1.suma(h2);
        System.out.println("Suma: " + h3);
        Tiempo h4 = h1.resta(h2);
        System.out.println("Resta: " + h4);
    }
}
