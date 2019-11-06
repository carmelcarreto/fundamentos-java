package com.mycompany.sobrecargaconstructores;

/**
 *
 * @author katyc
 */
public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    private Persona() {
        //super(); se manda llamar de manera automatica
        this.id = ++contadorPersonas;
    }

    //constructor completo - sobrecarga
    public Persona(String nombre, int edad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
}
