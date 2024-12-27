package tema9;

public class Tiempo {
    private int horas, minutos, segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Tiempo() {
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s.";
    }

    public Tiempo suma(Tiempo otraHora) {
        Tiempo resultado = new Tiempo();
        int s1 = (horas * 3600) + (minutos * 60) + segundos;
        int s2 = (otraHora.horas * 3600) + (otraHora.minutos * 60) + otraHora.segundos;
        int res = s1 + s2;
        if (res > 3600) {
            resultado.horas = res / 3600;
            res %= 3600;
        }
        if (res > 60) {
            resultado.minutos = res / 60;
            res %= 60;
        }
        resultado.segundos = res;
        return resultado;
    }

    public Tiempo resta(Tiempo otraHora) {
        Tiempo resultado = new Tiempo();
        int s1 = (horas * 3600) + (minutos * 60) + segundos;
        int s2 = (otraHora.horas * 3600) + (otraHora.minutos * 60) + otraHora.segundos;
        if (s1<s2) {
            System.out.println("La segunda hora no puede ser mayor a la primera");
            return resultado;
        }
        int res = s1 - s2;
        if (res > 3600) {
            resultado.horas = res / 3600;
            res %= 3600;
        }
        if (res > 60) {
            resultado.minutos = res / 60;
            res %= 60;
        }
        resultado.segundos = res;
        return resultado;
    }
}
