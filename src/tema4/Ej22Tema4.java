package tema4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juann
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
    hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
    Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
    por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
    a las 15:00h.
 */
public class Ej22Tema4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("En este programa de diremos los minutos restantes para llegar al fin de semana");
        System.out.println("El fin de semana comienza el viernes a las 15:00 horas");
        System.out.println("Debe introducir un día de lunes a viernes y una hora válida");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Introduce el día: ");
        String dia = s.nextLine();
        int diaActual=-1,minTotal,minActual,hora,minutos,resultado;
        minTotal= (4*24*60)+(15*60);
        switch (dia) {
            case "Lunes":
            case "lunes":
                diaActual=0;
                break;
            case "Martes":
            case "martes":
                diaActual=1;
                break;
            case "Miercoles":
            case "miercoles":
            case "miércoles":
            case "Miércoles":
                diaActual=2;
                break;
            case "Jueves":
            case "jueves":
                diaActual=3;
                break;
            case "Viernes":
            case "viernes":
                diaActual=4;
                break;
            default:
                System.out.println("El día introdido no es válido");
        }
        if (diaActual>=0) {
            System.out.print("Introduzca la hora: ");
            hora = s.nextInt();
            System.out.print("Introduzca los minutos: ");
            minutos = s.nextInt();
            minActual=(diaActual*24*60)+(hora*60)+minutos;
            resultado=minTotal-minActual;
            System.out.println("Quedan "+ resultado + " minutos para el fin de semana");
        }
    }
    
}
