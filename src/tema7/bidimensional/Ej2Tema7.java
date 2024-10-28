package tema7.bidimensional;

public class Ej2Tema7 {
    public static void main(String[] args) {
        int[][] num = new int[4][5];
        int sumaH = 0, sumaV = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = (int)(Math.random()*11);
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j]+"\t\t");
                sumaH+=num[i][j];
            }
            System.out.println("Fila "+(i) + ": " + sumaH);
            sumaH=0;
        }
        for (int i = 0; i < num[0].length; i++) {
            for (int j = 0; j < num.length; j++) {
                sumaV+=num[j][i];
            }
            System.out.print("Columna " + i + ": "+ sumaV+"\t");
            sumaV=0;
        }
    }
}
