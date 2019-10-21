package com.mycompany.proyectoaritmetica;

/**
 *
 * @author katyc
 */
public class PruebaAritmetica {

    public static void main(String[] args) {

        //variables locales
        int operandoA = 6;
        int operandoB = 2;

        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        //Imprimiendo los valores de los operandos 
        System.out.println("OperandoA = " + operandoA);
        System.out.println("OperandoB = " + operandoB);

        //Imprimiento el resultado de la suma
        System.out.println("\nEl resultado de la suma es: " + objeto1.sumar());

        //Imprimiento el resultado de la resta
        System.out.println("\nEl resultado de la resta es: " + objeto1.restar());
        
        
        //Imprimiento el resultado de la multiplicacion
        System.out.println("\nEl resultado de la multiplicacion es: " + objeto1.multiplicar());
        
        //Imprimiento el resultado de la division
        System.out.println("\nEl resultado de la division es: " + objeto1.dividir());
    }
}
