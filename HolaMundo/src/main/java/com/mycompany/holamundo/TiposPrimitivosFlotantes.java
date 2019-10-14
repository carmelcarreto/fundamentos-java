/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class TiposPrimitivosFlotantes {

    public static void main(String args[]) {

        float floatVar = 3.4028235E38F;
        System.out.println("floatVar = " + floatVar);
        
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float: " + Float.MAX_VALUE);
        
        double dobleVar = 1.7976931348623157E308;
        System.out.println("dobleVar = " + dobleVar);
        
        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);
        System.out.println("valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double: " + Double.MAX_VALUE);
      
    }

}
