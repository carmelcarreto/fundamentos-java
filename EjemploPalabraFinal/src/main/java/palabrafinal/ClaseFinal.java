package palabrafinal;

/**
 *
 * @author katyc
 */
public final class ClaseFinal {

    //Variables marcadas como final
    public final int varNumero = 10;

    //Constantes en Java
    public static final int VAR_PRIMITIVO = 15;

    public static final Persona VAR_PERSONA = new Persona();
    
    //Metodo final, lo veremos a detalle en el tema de sobreescritura
    public final void metodoFinal(){}
}

//No es posible crear clases hijas
//de una clase marcada como final
//class ClaseHija extends ClaseFinal{
    
    //no es posible modificar el comportamienro(sobreescritura)
    //de un metodo padre marcado como final
    //public  void metodoFinal(){}
//}
