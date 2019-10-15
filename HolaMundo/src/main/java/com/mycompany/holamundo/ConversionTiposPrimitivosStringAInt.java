/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author katyc
 */
public class ConversionTiposPrimitivosStringAInt {
    
    public static void main(String args[]) {
        
        //Conversion de un String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Convertir un char a un String
        //Realmente no es convertir toda la cadena "hola"
        //sino seleccionar uno de los elementos un caracter de este string
        char c = "hola".charAt(3);
        System.out.println("c = " + c);
        
        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        //Conversion de tipos enteros a string
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);
        
        
        
    }
    
}
