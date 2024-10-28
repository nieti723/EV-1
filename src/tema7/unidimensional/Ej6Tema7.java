
package tema7.unidimensional;

public class Ej6Tema7 {

    public static void main(String[] args) {
        int[] num = new int[15];
        int ultimo = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*16);
        }
        System.out.print("Array normal: ");
        for (int i = 0; i < num.length; i++) {
            if (i<num.length-1) {
                System.out.print(num[i] + ",");
            }else{
                System.out.print(num[i]);
            }
        }
        ultimo = num[num.length-1];
        System.out.println("");
        System.out.print("Array rotado: ");
        for (int i = num.length-1 ; i > 0; i--) {
            num[i]=num[i-1];
        }
        num[0]=ultimo;
        for (int i = 0; i < num.length; i++) {
            if (i<num.length-1) {
                System.out.print(num[i] + ",");
            }else{
                System.out.print(num[i]);
            }
        }
    }
    
}
