package com.mycompany.ejemploherencia;

/**
 *
 * @author katyc
 */
public class Empleado extends Persona {

    private int id;
    private double sueldo;
    public static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.id = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "id=" + id + ", sueldo=" + sueldo + '}';
    }
}

