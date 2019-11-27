
package ventas;

import com.gm.ventas.*;

/**
 *
 * @author katyc
 */
public class Ventas {
    
    public static void main(String[] args){
        //crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Pantalon",100);
        Producto producto3 = new Producto("Sudadera",500);
        Producto producto4 = new Producto("Chamarra",1000);
        
        //Creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        
        //Agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        
        //imprimir la orden
        orden1.mostrarOrden();
    }
    
}
