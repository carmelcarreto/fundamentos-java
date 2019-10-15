package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class TiposPrimitivosTipoChar {

    public static void main(String args[]) {

        char charVar = '\u0021';
        System.out.println("charVar = " + charVar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("valor minimo tipo char: " + Character.MIN_VALUE);
        System.out.println("valor maximo tipo char: " + Character.MAX_VALUE);

    }

}
