package tema9;

public class Fraccion {
    private int numerador, denominador, numeroFraccion;
    private static int cont;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        cont++;
        numeroFraccion = cont;
    }

    public Fraccion() {
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        if (this.denominador != 0) {
            this.numerador = numerador;
        } else {
            System.out.println("No puedes tener el denominador igual a 0");
        }
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        if (denominador == 1) {
            return "Fracción nº" + numeroFraccion + ": " + numerador;
        }
        return "Fracción nº" + numeroFraccion + ": " + numerador + "/" + denominador;
    }

    public void invierte() {
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
        System.out.println("(invertida) " + toString());
    }

    public void simplifica() {
        boolean simplificado = false, comun = false;
        int menor, div = 0;
        if (denominador > numerador) {
            menor = numerador;
        } else {
            menor = denominador;
        }
        if (numerador % denominador == 0) {
            numerador /= denominador;
            denominador = 1;
        }
        do {
            comun = false;
            for (int i = menor; i > 0 && !comun; i--) {
                if (numerador % i == 0 && denominador % i == 0) {
                    comun = true;
                    numerador /= i;
                    denominador /= i;
                }
            }
            if (denominador > numerador) {
                menor = numerador;
            } else {
                menor = denominador;
            }
            for (int i = menor; i > 0; i--) {
                if (numerador % i == 0 && denominador % i == 0) {
                    div ++;
                }
            }
            if (div < 2) {
                simplificado = true;
            }
        } while (!simplificado);
    }

    public Fraccion multiplica(Fraccion otra) {
        Fraccion res = new Fraccion();

        res.numerador = this.numerador * otra.numerador;
        res.denominador = this.denominador * otra.denominador;
        res.simplifica();

        return res;
    }

    public Fraccion divide(Fraccion otra) {
        Fraccion res = new Fraccion();

        res.numerador = this.numerador * otra.denominador;
        res.denominador = this.denominador * otra.numerador;
        res.simplifica();

        return res;
    }
}
