package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class OperadoresDeIgualdadYRelacionales {

    public static void main(String args[]) {

        //Operadores de igualdad
        int a = 3;
        int b = 4;

        boolean c = (a == b);
        System.out.println("c = " + c);

        c = (a != b);
        System.out.println("c = " + c);

        //cuando se trabaja con objects se usa asi
        //Para comparar cadenas
        String cadena = "Hola";
        String cadena2 = "Adios";
        System.out.println(cadena.equals(cadena2));

        //Operadores relacionales
        boolean d = a < b;
        System.out.println("d = " + d);

        d = a > b;
        System.out.println("d = " + d);

        d = a >= b;
        System.out.println("d = " + d);

        d = a <= b;
        System.out.println("d = " + d);

        //Ejercicio para probar el operador de asignacion
        //es par o impar
        if (b % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es Impar");
        }

        //Operador relacional
        int edad = 31;
        int adulto = 18;

        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }

    }

}
