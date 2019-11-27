package com.gm.ventas;

/**
 *
 * @author katyc
 */
public class Orden {

    private int id;
    private Producto productos[];//declaracion de variable arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.id = ++contadorOrdenes;
        //inicializar el arreglo
        productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos:" + MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio();// total = total + producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #:" + this.id);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + this.calcularTotal());
        System.out.println("Productos de la Orden");
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = productos[i];
            System.out.println(producto);
        }
    }
}
