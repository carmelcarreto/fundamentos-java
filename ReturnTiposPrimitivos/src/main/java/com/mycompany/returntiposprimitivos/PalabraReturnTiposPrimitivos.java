package com.mycompany.returntiposprimitivos;

/**
 *
 * @author katyc
 */
public class PalabraReturnTiposPrimitivos {

    public static void main(String[] args) {

        sumarSinRetornarValor(3, 6);
        int resultado = sumarRetornandoValor(4, 2);
        System.out.println("Resultado sumar resultando valor= "+ resultado);
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("El resultado sumar sin retornar valor es : " + (a + b));

    }

    private static int sumarRetornandoValor(int a, int b) {
        if(a == 0 && b==0){
            System.out.println("Debe proporcionar valores distintos de cero");
            return 0;
        }
        System.out.println("Los valores proporcionados son distintos de cero");
        return (a + b);
    }
}
