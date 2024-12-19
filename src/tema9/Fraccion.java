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
        if (this.denominador!=0) {
            this.numerador = numerador;
        }else{
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
        return "Fracción nº" + numeroFraccion + ": " + numerador + "/" + denominador;
    }


    public void invierte(){
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
        System.out.println("(invertida) " + toString());
    }


    public void simplifica(){
        if(denominador!=1){
            
        }
    }


    public Fraccion multiplica(Fraccion otra){
        Fraccion res = new Fraccion();

        res.numerador = this.numerador*otra.numerador;
        res.denominador = this.denominador*otra.denominador;

        return res;
    }


    public Fraccion divide(Fraccion otra){
        Fraccion res = new Fraccion();

        res.numerador = this.numerador*otra.denominador;
        res.denominador = this.denominador*otra.numerador;

        return res;
    }
}
