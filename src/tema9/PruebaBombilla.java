package tema9;

public class PruebaBombilla {
    public static void main(String[] args) {
        Bombilla lamparaEscritorio = new Bombilla("Lampara de Escritorio");
        lamparaEscritorio.encender();
        System.out.println(lamparaEscritorio);
        lamparaEscritorio.apagar();
        System.out.println(lamparaEscritorio);
    }
}
