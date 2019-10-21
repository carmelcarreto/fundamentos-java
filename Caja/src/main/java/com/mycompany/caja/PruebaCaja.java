package com.mycompany.caja;

/**
 *
 * @author katyc
 */
public class PruebaCaja {
    
     public static void main(String[] args) {

        int medidasAncho = 3;
        int medidasAlto = 2;
        int medidasProfundo = 6;

        Caja caja1 = new Caja();
        int resultado = caja1.calcularVolumen(medidasAncho, medidasAlto, medidasProfundo);
        System.out.println("Resultado de caja 1 es: " + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("Resultado de caja 2: " + caja2.calcularVolumen());
    }
}
