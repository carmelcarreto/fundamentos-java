package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class PrecedenciaDeOperadores {

    public static void main(String args[]) {

        var x = 5;
        var y = 10;
        var z = ++x + y--; //resultado esperado x=6, y=10, z=16
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        //Depende de los operadores que se usen, modifica la prioridad de ejecucion
        //Los operadores unarios son los que tienen mayor prioridad, luego los parentesis
        System.out.println("\nEjemplo 2 precendencia de operadores");
        var resultado = 4 + 5 * 6 / 3;// 4+((5*6)/3)4 => 4+(30/3) => 4+10=>14
        System.out.println("resultado = " + resultado);

        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    }

}
