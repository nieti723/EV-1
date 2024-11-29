package tema9;

public class Boligrafo {
    String marca = "Bic";
    String color;
    double precio;
    double pesoEnGramos = 27;
    boolean tieneRecambio = false;



    public Boligrafo() {
    }

    public Boligrafo(String color, double precio){
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Boligrafo [marca=" + marca + ", color=" + color + ", precio=" + precio + ", pesoEnGramos="
                + pesoEnGramos + ", tieneRecambio=" + tieneRecambio + "]";
    }



    public static void pinta(){
        System.out.println("Estoy pintando");
    }
}
