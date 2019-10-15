package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author katyc
 */
public class TareaRectangulo {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporcionar el alto del Rectangulo: ");
        int alto = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporcionar el ancho del Rectangulo: ");
        int ancho = Integer.parseInt(scanner.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

    }
}
