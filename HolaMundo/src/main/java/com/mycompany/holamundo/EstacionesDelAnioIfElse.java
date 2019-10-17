package com.mycompany.holamundo;

import java.util.Scanner;
/**
 *
 * @author katyc
 */
public class EstacionesDelAnioIfElse {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el mes del año: ");
        var mes = scanner.nextInt(); // mes del año

        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println(" Estacion: " + estacion + " para el mes: " + mes);
    }
}
