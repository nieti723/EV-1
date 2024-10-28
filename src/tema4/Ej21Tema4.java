/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author juann Calcula la nota de un trimestre de la asignatura Programación.
 * El programa pedirá las dos notas que ha sacado el alumno en los dos primeros
 * controles. Si la media de los dos controles da un número mayor o igual a 5,
 * el alumno está aprobado y se mostrará la media. En caso de que la media sea
 * un número menor que 5, el alumno habrá tenido que hacer el examen de
 * recuperación que se califica como apto o no apto, por tanto se debe preguntar
 * al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si
 * el resultado de la recuperación es apto, la nota será un 5; en caso
 * contrario, se mantiene la nota media anterior.
 */
public class Ej21Tema4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido, este programa le dirá cual es su nota de programación en este trimestre");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Introduzca la nota de los dos primero exámenes");
        System.out.print("Examen 1: ");
        double nota1 = s.nextDouble();
        System.out.print("Examen 2: ");
        double nota2 = s.nextDouble();
        s.nextLine();
        double media = Math.round((nota1 + nota2) / 2);
        String rec;
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Las notas introducidas no son válidas, deben de estar comprendidas entre 0 y 10");
        } else {
            if (media >= 5) {
                System.out.println("Enhorabuena, usted ha aprobado.");
                System.out.println("Su media es: " + media);
            } else if (media < 5) {
                System.out.println("Usted suspendió, por lo que tuvo que realizar el examen de recuperación");
                System.out.println("¿Cuál fue su calificación? (apto/no apto)");
                rec = s.nextLine();
                switch (rec) {
                    case "apto":
                        media = 5;
                        System.out.println("Enhorabuena, usted ha aprobado.");
                        System.out.println("Su media es: " + media);
                        break;
                    case "no apto":
                        System.out.println("Su media es: " + media);
                        break;
                    default:
                        System.out.println("Respuesta no válida");
                        break;
                }
            }
        }
    }

}
