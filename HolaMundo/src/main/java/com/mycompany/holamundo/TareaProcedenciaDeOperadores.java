package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class TareaProcedenciaDeOperadores {

    public static void main(String args[]) {

        int a = 2;
        var b = 3;
        var resultado = -3 + 6 / ++a * 4 - b-- + b;
        //se evalua 6 / ++a donde a = 3
        System.out.println(6 / 3);// el valor es 2
        // se evalua 2 * 4 
        System.out.println(2 * 4);//el valor es 8
        //se evalua -3 + 8
        System.out.println(-3 + 8);//el valor es 5
        //se evalua 5 - b-- donde b = 3
        System.out.println(5 - 3);//el valor es 2
        //se evalua 2 + b
        System.out.println(2 + 2);//el valor es 4
        System.out.println("resultado = " + resultado);

        //Resuelto con parentesis
        int resultado2 = ((-3 + ((6 / ++a) * 4)) - b--) + b;
        System.out.println("resultado2 = " + resultado2);
    }

}
