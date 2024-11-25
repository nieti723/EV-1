package tema7.bidimensional;

public class Ej6Tema7 {
    public static void main(String[] args) {
        int max = 0, min = 1000;
        int[] posMin = new int[2];
        int[] posMax = new int[2];
        int[][] num = new int[6][10];
        int rep;
        boolean nuevo = false;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                // En la primera posición, como no hay números y va a ser nuevo no hace falta comprobar nada
                if (j == 0 && i == 0) {
                    num[i][j] = (int) (Math.random() * 1001);
                } else { // A partir del 0,0 empezamos a comprobar si el número generado se repite
                    do {
                        // Contador para ver cuantas veces se repite
                        rep = 0;
                        num[i][j] = (int) (Math.random() * 1001);
                        // Comprobamos si el número se repite más de una vez, ya que al pasar por la posición actual, ya tenemos que rep=1
                        for (int j2 = 0; j2 < num.length && rep<2; j2++) {
                            for (int k = 0; k < num[0].length && rep<2; k++) {
                                if (num[i][j]==num[j2][k]) {
                                    rep++;
                                }
                            }
                        }
                        // Cambia el valor de la bandera según las veces que se repita el número
                        if (rep>1) {
                            nuevo = false;
                        }else{
                            nuevo = true;
                        }
                    } while (!nuevo);
                }
            }
        }
        for (int i = 0; i < num[0].length; i++) {
            System.out.print("\t" + (i + 1));
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < num[0].length; j++) {
                System.out.print("\t" + num[i][j]);
                if (num[i][j] < min) {
                    min = num[i][j];
                    posMin[0] = i;
                    posMin[1] = j;
                } else if (num[i][j] > max) {
                    max = num[i][j];
                    posMax[0] = i;
                    posMax[1] = j;
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println("El número máximo se encuentra en la columna " + (posMax[1] + 1) + " de la fila "
                + (posMax[0] + 1) + ": " + num[posMax[0]][posMax[1]]);
        System.out.println("El número mínimo se encuentra en la columna " + (posMin[1] + 1) + " de la fila "
                + (posMin[0] + 1) + ": " + num[posMin[0]][posMin[1]]);
    }
}
