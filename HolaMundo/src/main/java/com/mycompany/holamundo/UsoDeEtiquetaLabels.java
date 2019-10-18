package com.mycompany.holamundo;

/**
 *
 * @author katyc
 */
public class UsoDeEtiquetaLabels {
    
    public static void main(String args[]) {
        
        //Nota no es recomendable utilizarla 
        // por que seria mas confuso de leer
       
        inicio:
        for (var i = 0; i < 3; i++) {
            //Imprimir solo numeros pares
          if (i % 2 == 0) {
               System.out.println("i = " + i);
               break inicio;
            }
        }
        
        //inicio:
        //for (var i = 0; i < 3; i++) {
            //Imprimir solo numeros pares
          //  if (i % 2 != 0) {
            //    continue inicio;
            //}
              //  System.out.println("i = " + i);
        //}
    }
    
}
