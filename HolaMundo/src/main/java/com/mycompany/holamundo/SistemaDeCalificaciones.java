package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author katyc
 */
public class SistemaDeCalificaciones {

    public static void main(String args[]) {

        var ustedObtuvo = "Calificacion";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporcionar un valor entre 0 y 10 ");
        int calificacion = Integer.parseInt(scanner.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            ustedObtuvo = "Calificacion A";
        } else if (calificacion >= 8 && calificacion < 9) {
            ustedObtuvo = "Calificacion B";
        } else if (calificacion >= 7 && calificacion < 8) {
            ustedObtuvo = "Calificacion C";
        }else if (calificacion >= 6 && calificacion < 7) {
            ustedObtuvo = "Calificacion D";
        }else if (calificacion >= 0 && calificacion < 6) {
            ustedObtuvo = "Calificacion F";
        }else {
            ustedObtuvo = "Un Valor Desconocido";
        }
        System.out.println("ustedObtuvo = " + ustedObtuvo);
    }
}
