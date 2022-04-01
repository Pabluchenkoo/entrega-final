import java.util.ArrayList;

public class Proyecto{


    //Constantes

    private static final String DOCUMENTACION = "documentacion";

    private static final String IMPLEMENTACION = "implementacion";
    
    private static final String PRUEBAS = "pruebas";
    
    private static final String INVESTIGACION = "investigacion";

    private static final String DISENIO = "disenio";


    //Atributos

    private String nombre;

    private String descripcion;

    private String fechaIncio;

    private Participante dueño;

    private String tipo;

    private ArrayList<Participante> participantes;




    //constructor

    public Proyecto(String pNombre, String pDescripcion, String pFechaInicio, String pTipo, String pCorreo  ){

        nombre = pNombre;

        descripcion = pDescripcion;

        fechaIncio = pFechaInicio;

        dueño = new Participante(pNombre, pCorreo);

        participantes = new ArrayList<Participante>();


    }




    //metodos

    

    








}



