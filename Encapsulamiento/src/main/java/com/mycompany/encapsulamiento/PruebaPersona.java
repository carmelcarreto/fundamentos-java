package com.mycompany.encapsulamiento;

/**
 *
 * @author katyc
 */
public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona persona = new Persona("Katy", 10000, false);
        //System.out.println("Nombre persona: " + persona.getNombre());
        //System.out.println("Sueldo persona: " + persona.getSueldo());
        //System.out.println("Persona borrada?: " + persona.isEliminado());
        
        System.out.println("persona: " + persona);
        
        persona.setNombre("Camc");
        persona.setSueldo(2000);
        persona.setEliminado(true);
        
        System.out.println("persona: " + persona);
    }

}
