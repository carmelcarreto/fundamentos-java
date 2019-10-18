package com.mycompany.creacionclasesobjetos;

/**
 *
 * @author katyc
 */
public class PruebaPersonas {

    public static void main(String[] args) {

        //Crear objeto de tipo Persona
        //Definir la variable de tipo Persona
        Persona persona1;

        //Instanciar(crear) un objeto de la clase Persona
        persona1 = new Persona();

        //Acceder al objeto persona1 y llamar al metodo desplegarNombres()
        persona1.desplegarNombres();

        //Modificar los valores de los atributos del objeto Persona
        persona1.nombre = "Katy";
        persona1.apellido = "Carreto";

        //Volvemos a imprimir los valores
        System.out.println("");
        persona1.desplegarNombres();
        
        //Crear un segundo objeto tipo Persona
        Persona persona2 = new Persona();
        persona2.nombre = "Juan";
        persona2.apellido ="Molina";
        
        //Volvemos a imprimir los valores
        System.out.println("");
        persona2.desplegarNombres();
        
    }
}
