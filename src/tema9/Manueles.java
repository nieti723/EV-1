package tema9;

public class Manueles {

    private String nombre = "Manuel";
    private static int apellido = 0;
    private int edad;


    public Manueles(int edad) {
        nombre += "_" + apellido; 
        this.edad = edad;
        apellido++;
    }


    public static int getApellido() {
        return apellido;
    }


    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return nombre + ":\n- Edad: " + edad + "\n------------------------";
    }

    
}
