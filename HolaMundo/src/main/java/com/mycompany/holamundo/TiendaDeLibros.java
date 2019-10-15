package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author katyc
 */
public class TiendaDeLibros {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Proporcionar el id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.println("Proporcionar un simbolo: ");
        char simbolo = scanner.nextLine().charAt(0);

        System.out.println("Proporcionar el envio gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

    }

}
