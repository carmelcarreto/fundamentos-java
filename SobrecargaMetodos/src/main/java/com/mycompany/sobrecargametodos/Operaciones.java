package com.mycompany.sobrecargametodos;

/**
 *
 * @author katyc
 */
public class Operaciones {

    //metodo sumar
    public static int sumar(int a, int b) {
        System.out.println("Metodo sumar (int, int)");
        return a + b;
    }

    //sobrecarga de metodo sumar
    public static double sumar(double a, double b) {
        System.out.println("Metodo sumar(double, double)");
        return a + b;
    }

    public static double sumar(int a, double b) {
        System.out.println("Metod sumar (int, double)");
        return a + b;
    }

    public static double sumar(double a, int b) {
        System.out.println("Metod sumar (double, int)");
        return a + b;
    }
}
