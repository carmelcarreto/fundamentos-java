package com.mycompany.proyectoaritmetica;

/**
 *
 * @author katyc
 */
public class PruebaAritmetica {

    public static void main(String[] args) {

        //Crear un objeto de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica();
        //De esta forma se puede modificar los valores de los atributos de la clase
        //No es buena practica 
        aritmetica.a = 10;
        aritmetica.b = 3;

        int resultado = aritmetica.sumar();
        System.out.println("resultado = " + resultado);
        
        //Crar un segundo objeto Aritmetica
        Aritmetica aritmetica1 = new Aritmetica(4,2);
        System.out.println("resultado2 = "+ aritmetica1.sumar());
    }
}
