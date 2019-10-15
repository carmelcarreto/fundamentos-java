package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class TiposPrimitivosTipoBoolean {

    public static void main(String args[]) {

        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);

        boolean booleanVar = false;

        if (booleanVar) {
            System.out.println("El valor es verdadero");
        } else {
            System.out.println("El valor es falso");
        }

        System.out.println("");

        var edad = 30;
        var esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);

    }

}
