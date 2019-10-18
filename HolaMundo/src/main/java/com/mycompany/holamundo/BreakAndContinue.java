package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class BreakAndContinue {

    public static void main(String args[]) {

        //for (var i = 0; i < 3; i++) {
            //Imprimir solo numeros pares
          //  if (i % 2 == 0) {
            //    System.out.println("i = " + i);
              //  break;
            //}
        //}
        
        for (var i = 0; i < 3; i++) {
            //Imprimir solo numeros pares
            if (i % 2 != 0) {
                continue;
            }
                System.out.println("i = " + i);
        }
    }
}
