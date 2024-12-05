package tema9;

public class Movil {
    String marca, modelo;
    double precio = 700;
    boolean mejoras = false;

    public Movil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void muestraMarca(){
        System.out.println(marca);
        System.out.println(this.marca);
    }

    public String getMarca(String pass) {
        if (pass.equals("1234")) {
            return marca;
        }else{
            return "Usted no puede saber la marca";
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio==500) {
            this.precio = precio*0.75;
        }else{
            this.precio = precio;
        }
    }
}
