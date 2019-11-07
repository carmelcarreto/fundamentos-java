package matrices;

/**
 *
 * @author katyc
 */
public class EjemploMatricesPrueba {

    public static void main(String[] args) {

        //1. Declaracion de una matriz de int
        int edades[][];

        //2. Instanciamos la matriz de int
        edades = new int[3][2];

        //3. Instanciamos los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        //4. Imprimir los valores de la matriz
        System.out.println("Matriz de enteros en el indice 0x0: " + edades[0][0]);
        System.out.println("Matriz de enteros en el indice 0x1: " + edades[0][1]);
        System.out.println("Matriz de enteros en el indice 1x0: " + edades[1][0]);
        System.out.println("Matriz de enteros en el indice 1x1: " + edades[1][1]);
        System.out.println("Matriz de enteros en el indice 2x0: " + edades[2][0]);
        System.out.println("Matriz de enteros en el indice 2x1: " + edades[2][1]);

        //1. Declarar e instanciar una matriz de objetos de tipo persona
        Persona personas[][] = new Persona[1][2];

        //2. Inicializar los valores
        personas[0][0] = new Persona("Katy");
        personas[0][1] = new Persona("Kat");

        //3. Imprimimos los valores
        System.out.println("Matriz de objeto en el indice 0x0: " + personas[0][0]);
        System.out.println("Matriz de objeto en el indice 0x1: " + personas[0][1]);
        
        
        //4. Recorrer una matriz con apoyo de un ciclo for anidado
        // el ciclo for mas externo maneja los reglones 
        // y el ciclo for mas interno maneja los columnas 
        // he internamente se va accediendo a cada unos de los elementos de la matriz
        for(int renglon = 0; renglon < personas.length; renglon++){
            for(int columna = 0; columna < personas[renglon].length; columna++){
                System.out.println("Matriz personas indice: " + renglon + " - " + columna + ": " + personas[renglon][columna]);
            }
        }
    }
}
