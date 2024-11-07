package tema7.bidimensional;

public class Ej3Tema7 {
    public static void main(String[] args) {
        int[][] num = new int[4][5];
        int sumaH = 0, sumaV = 0, total = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = (int)(Math.random()*900)+100;
            }
        }
        System.out.println("TABLA: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print("|"+num[i][j]+"\t\t\t");
                sumaH+=num[i][j];
            }
            System.out.println("|Fila "+(i) + ": " + sumaH);
            total+=sumaH;
            sumaH=0;
        }
        for (int i = 0; i < num[0].length; i++) {
            for (int j = 0; j < num.length; j++) {
                sumaV+=num[j][i];
            }
            System.out.print("|Columna " + i + ": "+ sumaV+"\t");
            total+=sumaV;
            sumaV=0;
        }
        System.out.println("|Total: " + total);
    }
}
