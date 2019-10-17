package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class OperadorTernario {

    public static void main(String args[]) {

        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 8;
        var par = (numero % 2 == 0) ? "Numero Par" : "Numero Impar";
        System.out.println("par = " + par);
    }

}
