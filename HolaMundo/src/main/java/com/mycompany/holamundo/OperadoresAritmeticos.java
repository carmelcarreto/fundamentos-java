package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class OperadoresAritmeticos {
    
    public static void main(String args[]) {

        int a = 3;
        int b = 2;
        
        int resultadoSuma = a + b;
        System.out.println("resultadoSuma = " + resultadoSuma);
        System.out.println("resultadoSuma = " + (a + b));
        
        int resultadoResta = a - b;
        System.out.println("resultadoResta = " + resultadoResta);
        System.out.println("resultadoResta = " + (a - b));
        
        int resultadoMultiplicacion = a * b;
        System.out.println("resultadoMultiplicacion = " + resultadoMultiplicacion);
        System.out.println("resultadoMultiplicacion = " + (a * b));
        
        int resultadoDivision = a / b;
        System.out.println("resultadoDivision = " + resultadoDivision);
        System.out.println("resultadoDivision = " + (a / b));
        
        var resultadoFlotante = 3F / b;
        System.out.println("resultadoFlotante = " + resultadoFlotante);
        System.out.println("resultadoFlotante = " + (3F / b));
        
        var resultadoDouble = 3D / b;
        System.out.println("resultadoDouble = " + resultadoDouble);
        System.out.println("resultadoDouble = " + (3D / b));
        
        
        int resultadoModulo = a % b;
        System.out.println("resultadoModulo = " + resultadoModulo);
        System.out.println("resultadoModulo = " + (a % b));
        
        int resultado = 123 % 2;
        System.out.println("resultado = " + resultado);
        
        if(resultado == 0){
            System.out.println("es numero par");
        }else {
            System.out.println("es numero impar");
        }
    }
    
}
