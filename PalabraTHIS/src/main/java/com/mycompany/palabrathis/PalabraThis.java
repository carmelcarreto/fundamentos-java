package com.mycompany.palabrathis;

/**
 *
 * @author katyc
 */
public class PalabraThis {
    
    public static void main (String[] args){
        Persona persona = new Persona("Katy");
        
    }
    
}
class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre= nombre;// this apunta a un objeto de tipo persona
        System.out.println("Impresion del operador this dentro de la clase Persona: " + this);//this apunta a un objeto de tipo Persoona
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//this contiene una referencia al objeto persona
        
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Impresion del argumento persona: " + persona);//valor del objeto persona
        System.out.println("Impresion objeto actual(this): " + this);//this apunta a un objeto de tipo imprimir
    }
}
