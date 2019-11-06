package palabrafinal;

/**
 *
 * @author katyc
 */
public class EjemploPalabraFinal {

    public static void main(String[] args) {
        //Modificar un atributo final, no es posible modificarlo
        //ClaseFinal.VAR_PRIMITIVO = 20;
        
        //Modificar la referencia de un atributo de tipo object
        //ClaseFinal.VAR_PERSONA = new Persona();
        
        ClaseFinal.VAR_PERSONA.setNombre("Katy");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        
        ClaseFinal.VAR_PERSONA.setNombre("Camc");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }

}
