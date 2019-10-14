package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author katyc
 */
public class ClaseScanner {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona un nombre del titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporcionar el nombre del autor: ");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por: " + autor);

    }

}
