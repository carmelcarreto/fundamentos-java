
package com.mycompany.sobrecargametodos;

/**
 *
 * @author katyc
 */
public class SobrecargaMetodos {
    
    public static void main(String [] args){
        System.out.println("Resultado 1 es: " + Operaciones.sumar(3, 4));
        
        System.out.println("Resultado 2 es: " + Operaciones.sumar(2.0,4));
        
        System.out.println("Resultado 3 es: " + Operaciones.sumar(3,5L));
        
        System.out.println("Resultado 4 es: " + Operaciones.sumar(3F,'A'));
    }
}
