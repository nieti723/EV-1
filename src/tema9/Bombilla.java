package tema9;

public class Bombilla {
    private String estado = "apagada", nombre;

    public Bombilla(String nombre) {
        this.nombre = nombre;
    }

    public void encender() {
        estado = "encendida";
    }

    public void apagar() {
        estado = "apagada";
    }

    @Override
    public String toString() {
        return "- " + nombre + ": " + estado;
    }
}
