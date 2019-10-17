package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author katyc
 */
public class MayorDeDosNumeros {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el primer valor: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el segundo valor: ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);

    }

}
