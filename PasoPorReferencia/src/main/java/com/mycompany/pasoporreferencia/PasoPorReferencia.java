package com.mycompany.pasoporreferencia;

/**
 *
 * @author katyc
 */
public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.cambiarNombre("Katy");
        System.out.println("valor nombre: " + persona.obtenerNombre());

        //Paso por referencia
        modificarPersona(persona);
        System.out.println("valor nombre modificado:" + persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Camc");
    }
}
