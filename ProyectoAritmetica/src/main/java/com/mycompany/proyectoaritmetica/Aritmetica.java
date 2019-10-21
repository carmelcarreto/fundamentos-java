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
        System.out.println("Ejecutando Contructor vacio");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando contructor con 2 argumentos");
    }

    public int sumar() {
        return this.a + this.b;
    }

    public int restar() {
        return this.a - this.b;
    }

    public int multiplicar() {

        return this.a * this.b;
    }

    public int dividir() {

        return this.a / this.b;
    }

}
