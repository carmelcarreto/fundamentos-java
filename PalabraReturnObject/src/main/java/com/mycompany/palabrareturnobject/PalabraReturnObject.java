package com.mycompany.palabrareturnobject;

/**
 *
 * @author katyc
 */
public class PalabraReturnObject {

    public static void main(String[] args) {
        
        Suma sum = creaObjetoSuma();
        System.out.println("Resultado de llamar el metodo sumar: " + sum.sumar());
    }
    
    private static Suma creaObjetoSuma(){
        Suma suma = new Suma(4,6);
        return suma;
    }

}

class Suma {

    int a;
    int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumar() {
        return this.a + this.b;
    }
}
