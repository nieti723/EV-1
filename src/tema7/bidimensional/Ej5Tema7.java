package tema7.bidimensional;

public class Ej5Tema7 {
    public static void main(String[] args) {
        int max = 0, min = 1000;
        int[] posMin = new int[2];
        int[] posMax = new int[2];
        int[][] num = new int[6][10];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = (int)(Math.random()*1001);
            }
        }
        for (int i = 0; i < num[0].length; i++) {
            System.out.print("\t"+(i+1));
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print((i+1)+" | ");
            for (int j = 0; j < num[0].length; j++) {
                System.out.print("\t"+num[i][j]);
                if (num[i][j]<min) {
                    min=num[i][j];
                    posMin[0]=i;
                    posMin[1]=j;
                }else if (num[i][j]>max) {
                    max = num[i][j];
                    posMax[0]=i;
                    posMax[1]=j;
                }
            }
            System.out.println();
        }
        System.out.println("El número máximo se encuentra en la columna "+ (posMax[1]+1)+" de la fila "+ (posMax[0]+1) +": "+num[posMax[0]][posMax[1]]);
        System.out.println("El número mínimo se encuentra en la columna "+ (posMin[1]+1)+" de la fila "+ (posMin[0]+1)+": "+num[posMin[0]][posMin[1]]);
    }
}
