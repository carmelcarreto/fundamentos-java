package arreglos;

/**
 *
 * @author katyc
 */
public class EjemploArreglos {

    public static void main(String[] args) {

        //1. Declaramos una variable de tipo arreglo, un arreglo de int
        int edades[];

        //2. Instanciamos el arreglo de int
        edades = new int[3];

        //3. Inicializamos los valores de los elementos del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        //4. Imprimimos los valores del arreglo
        System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2]);
        //System.out.println("Arreglo enteros indice 3: " + edades[3]);

        //1. Declarar  e instanciar un arreglo de tipos object
        Persona personas[] = new Persona[4];

        //2. Inicializar los valores del arreglo
        personas[0] = new Persona("Katy");
        personas[2] = new Persona("Cam");
        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);
        System.out.println("Arreglo personas indice 3: " + personas[3]);
        //System.out.println("Arreglo personas indice 4: " + personas[4]);

        //Arreglo utilizando notacion simplificada
        String nombres[] = {"Kat", "Katy", "Camc", "Carmel"};
        //Recorrer los elementos de un arreglo
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String indice: " + i + " : " + nombres[i]);
        }
    }
}
