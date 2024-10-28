package tema7.unidimensional;

public abstract class Ej9Tema7 {
    public static void main(String[] args) {
        int[] num = new int[8];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*11);
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (num[i]%2==0) {
                System.out.println(" par");
            }else{
                System.out.println(" impar");
            }
        }     
    }
}
