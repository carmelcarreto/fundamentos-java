package com.mycompany.proyectoaritmetica;

/**
 *
 * @author katyc
 */
public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    public Aritmetica() {
        //De esta forma se puede modificar los valores de los atributos de la clase
        //a=5;
        //b=3;
        System.out.println("Ejecutando Contructor vacio");
    }

    public Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando contructor con 2 argumentos");
    }

    public int sumar() {
        int resultado = a + b;//Se usan los atributos de la clase
        return resultado;
    }
}
