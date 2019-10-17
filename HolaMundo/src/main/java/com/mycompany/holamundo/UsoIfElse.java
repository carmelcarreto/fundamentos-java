package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class UsoIfElse {

    public static void main(String args[]) {

        var condicion = true;

        if (condicion) {
            System.out.println("condicion es verdarera");
        } else {
            System.out.println("condicion es falsa");
        }

        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else {
            numeroTexto = "Valor desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }

}
