
package com.mycompany.proyectoaritmetica;

/**
 *
 * @author katyc
 */
public class PruebaAritmetica {
    
    public static void main(String[] args){
        //Crear un objeto de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica();
        
        int resultado = aritmetica.sumar(5, 3);
        System.out.println("resultado = " + resultado);
    }
}
