package com.mycompany.mavenproject1;

/**
 *
 * @author katyc
 */
public class EjemploEstatico {

    public static void main(String[] args) {
        Persona persona = new Persona("Kty");
        System.out.println(persona);

        Persona persona1 = new Persona("carmel");
        System.out.println(persona1);

        Persona persona2 = new Persona("camc");
        System.out.println(persona2);

        System.out.println("contadorPersonas: " + Persona.getContadorPersonas());
    }
}

