package tema8.funciones;

public class FuncionesMatematicas1_a_19 {
    public static String esPar(int num){
        if (num%2==0) {
            return num + " es par";
        }else{
            return num + " no es par";
        }
    }

    public static void mensaje(String palabra){
        System.out.println("La palabra es: " + palabra);
    }
}
