package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author katyc
 */
public class SentenciaSwitch {

    public static void main(String args[]) {

        var numero = 2;
        var numeroTexto = "numero desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            default:
                numeroTexto = "numero desconocido";
        }
        System.out.println(" numeroTexto: " + numeroTexto + " para el numero proporcionado: " + numero);
    }

}
