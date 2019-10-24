package com.mycompany.palabranull;

/**
 *
 * @author katyc
 */
public class PalabraNull {
    
    public static void main(String[] args){
        
        Persona persona1 = new Persona("Katy");
        System.out.println("Persona1: " + persona1.obtenerNombre());
        
        Persona person2 = persona1;
        
        System.out.println("Persona2: " + person2.obtenerNombre());
        
        persona1 = null;
        if(persona1 != null)
            System.out.println("Persona1: " + persona1.obtenerNombre());
        else
            System.out.println("La variable persona1 no apunta a ningun objeto");
    }
    
}

class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
}
