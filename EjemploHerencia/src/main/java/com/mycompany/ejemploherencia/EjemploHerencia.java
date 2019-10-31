package com.mycompany.ejemploherencia;

import java.util.Date;

/**
 *
 * @author katyc
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Kat", 5000);
        empleado1.setEdad(30);
        empleado1.setSexo('M');
        empleado1.setDireccion("Emperadores # 184");
        System.out.println(empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Camc");
        cliente1.setEdad(32);
        System.out.println(cliente1);
    }
}
