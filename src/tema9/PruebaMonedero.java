package tema9;

public class PruebaMonedero {
    public static void main(String[] args) {
        Monedero juan = new Monedero(224.50);
        juan.consultar();
        juan.ingreso(10);
        juan.consultar();
        juan.retirada(300);
        juan.retirada(130.34);
        juan.consultar();
    }
}
