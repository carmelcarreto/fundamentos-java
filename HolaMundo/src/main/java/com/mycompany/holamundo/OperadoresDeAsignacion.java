package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class OperadoresDeAsignacion {
    
     public static void main(String args[]) {

        int a = 3;
        int b = 2;
        
        //Operador de asignacion
        int c = a+5-b;
        System.out.println("c = " + c);
     
        a += 1;// es equivalente a=a+1
        System.out.println("a = " + a);
        
        a += 3; //es equivalente a=a+3
        System.out.println("a = " + a);
        
        b -= 1;//es equivalente b=b-1
        System.out.println("b = " + b);
        
        a *= 1;//es equivalente a=a*1
        System.out.println("a = " + a);
        
        a /= 1;//es equivalente a=a/1
        System.out.println("a = " + a);
        
        a %= 1;//es equivalente a=a%1
        System.out.println("a = " + a);
    }
    
}
