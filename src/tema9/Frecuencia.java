package tema9;

public class Frecuencia {
    private double frecuencia = 80;

    public Frecuencia() {
        display();
    }

    public void up() {
        if (frecuencia + 0.5 > 180) {
            frecuencia = 80;
        } else {
            frecuencia += 0.5;
        }
    }

    public void down() {
        if (frecuencia - 0.5 < 80) {
            frecuencia = 180;
        } else {
            frecuencia -= 0.5;
        }
    }

    public void display() {
        System.out.println("Frecuencia actual: " + frecuencia + " MHz");
    }
}
