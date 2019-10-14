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
public class ClaseScanner {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona un nombre: ");
        var usuario = scanner.nextLine();
        System.out.println("usuario " + usuario);

    }

}
