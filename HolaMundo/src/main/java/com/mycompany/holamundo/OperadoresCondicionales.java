package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class OperadoresCondicionales {

    public static void main(String args[]) {

        int a = 15;
        int valorMinimo = 0;
        int valorMaximo = 10;

        //Operador condicional que comprueba si los dos valores son verdaderos
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);

        boolean vacaciones = false;
        boolean diaDeDescanso = true;

        if (vacaciones || diaDeDescanso) {
            System.out.println("El Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El Padre esta ocupado");
        }

    }

}
