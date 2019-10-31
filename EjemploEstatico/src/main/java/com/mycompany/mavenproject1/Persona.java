
package com.mycompany.mavenproject1;

/**
 *
 * @author katyc
 */
public class Persona {
    
    private int id; //se asocia con un objeto (instancia)
    private String nombre;
    private static int contadorPersonas;//se asocia con la clase
    
    public Persona(String nombre){
        this.id = ++contadorPersonas;
        this.nombre = nombre;
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
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    
    @Override
    public String toString(){
        return "id: " + id + ", nombre: " + nombre + ", contadorPersona: " + contadorPersonas;
    }
}
