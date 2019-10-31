package com.mycompany.ejemploherencia;

import java.util.Date;

/**
 *
 * @author katyc
 */
public class Cliente extends Persona {

    private int id;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip) {
        this.id = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getId() {
        return id;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "id=" + id + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
}
