/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author juann
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como
una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
introduce los datos correctamente y que el segundo día es posterior al primero.
 */
public class Ej30Tema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa muestra las horas transcurridas entre dos días introducidos por teclado.");
        System.out.println("El usuario debe introducir un día y una hora válidos");
        boolean valido = false;
        int hora1 = 0 , hora2 = 0, entero1 = 0, entero2 = 0, total1 = 0, total2 = 0;
        String dia1 = "",dia2 = "";
        do{
            do {            
                System.out.print("Introduce el primer día: ");
                dia1 = s.next();
                switch (dia1) {
                    case "lunes":
                    case "Lunes":
                    case "1":
                        entero1 =1;
                        dia1 = "lunes";
                        valido = true;
                        break;
                    case "martes":
                    case "Martes":
                    case "2":
                        entero1=2;
                        dia1= "martes";
                        valido = true;
                        break;
                    case "miércoles":
                    case "miercoles":
                    case "Miércoles":
                    case "Miercoles":
                    case "3":
                        entero1=3;
                        dia1 = "miércoles";
                        valido = true;
                        break;
                    case "jueves":
                    case "Jueves":
                    case "4":
                        entero1=4;
                        dia1= "jueves";
                        valido = true;
                        break;
                    case "Viernes":
                    case "viernes":
                    case "5":
                        entero1=5;
                        dia1= "viernes";
                        valido = true;
                        break;
                    case "sábado":
                    case "sabado":
                    case "Sábado":
                    case "Sabado":
                    case "6":
                        entero1=6;
                        dia1= "sábado";
                        valido = true;
                        break;
                    case "domingo":
                    case "Domingo":
                    case "7":
                        entero1=7;
                        dia1 = "domingo";
                        valido = true;
                        break;
                    default:
                        System.out.println("El día introducido no es válido, introduzca un valor correcto");
                }
            } while (valido==false);
            do {                
                System.out.print("Introduce la primera hora: ");
                hora1=s.nextInt();
                if (hora1<0 || hora1>24) {
                    System.out.println("Hora no válida, pruebe de nuevo");
                }
            } while (hora1<0 || hora1>24);
            valido = false;
            do {            
                System.out.print("Introduce el segundo día: ");
                dia2 = s.next();
                switch (dia2) {
                    case "lunes":
                    case "Lunes":
                    case "1":
                        entero2=1;
                        dia2 = "lunes";
                        valido = true;
                        break;
                    case "martes":
                    case "Martes":
                    case "2":
                        entero2=2;
                        dia2 = "martes";
                        valido = true;
                        break;
                    case "miércoles":
                    case "miercoles":
                    case "Miércoles":
                    case "Miercoles":
                    case "3":
                        entero2=3;
                        dia2 = "miércoles";
                        valido = true;
                        break;
                    case "jueves":
                    case "Jueves":
                    case "4":
                        entero2=4;
                        dia2 = "jueves";
                        valido = true;
                        break;
                    case "Viernes":
                    case "viernes":
                    case "5":
                        entero2=5;
                        dia2 = "viernes";
                        valido = true;
                        break;
                    case "sábado":
                    case "sabado":
                    case "Sábado":
                    case "Sabado":
                    case "6":
                        entero2=6;
                        dia2 = "sábado";
                        valido = true;
                        break;
                    case "domingo":
                    case "Domingo":
                    case "7":
                        entero2=7;
                        dia2 = "domingo";
                        valido = true;
                        break;
                    default:
                        System.out.println("El día introducido no es válido, introduzca un valor correcto");
                }
            } while (valido==false);
            do {                
                System.out.print("Introduce la segunda hora: ");
                hora2=s.nextInt();
                if (hora2<0 || hora2>24) {
                    System.out.println("Hora no válida, pruebe de nuevo");
                }
            } while (hora2<0 || hora2>24);
            if (entero1>entero2) {
                System.out.println("El primer día debe ser anterior al segundo, vuelva a introducir los datos");
            }else if(entero1==entero2 && hora1>hora2){
                System.out.println("Si los días coinciden, la segunda hora debe ser posterior");
            }
        }while (entero1>entero2 || (entero1==entero2 && hora1>hora2));
        total1 = hora1 + (entero1-1)*24;
        total2 = hora2 + (entero2-1)*24;
        System.out.println("Entre las " + hora1 + ":00h del " + dia1 + " y las " + hora2 + ":00h del " + dia2 + " hay " + (total2-total1)+ " hora/s");
    }
    
    
}
