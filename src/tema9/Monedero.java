package tema9;

public class Monedero {
    private double dinero;

    public Monedero(double dinero) {
        this.dinero = dinero;
    }

    public void ingreso(double ingresar) {
        dinero += ingresar;
    }

    public void retirada(double retirar) {
        if (retirar > dinero) {
            System.out.println("Usted no puede retirar más de lo que tiene");
        } else {
            dinero -= retirar;
        }
    }

    public void consultar() {
        System.out.println("Dinero en el monedero: " + dinero);
    }
}
