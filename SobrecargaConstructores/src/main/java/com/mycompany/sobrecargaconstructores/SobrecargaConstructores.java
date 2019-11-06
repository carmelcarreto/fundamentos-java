package com.mycompany.sobrecargaconstructores;

/**
 *
 * @author katyc
 */
public class SobrecargaConstructores {
    
    public static void main (String [] args){
    
        Persona persona1 = new Persona("kAT", 30);
        System.out.println("persona1 = " + persona1);
        
        Empleado empleado1 = new Empleado("Camc", 30, 5000);
        System.out.println("empleado1 = " + empleado1);
    }
}
