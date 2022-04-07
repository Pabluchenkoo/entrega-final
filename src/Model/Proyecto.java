
package Model;
import java.io.PrintWriter;

import java.util.HashMap;

import java.util.LinkedList;



public class Proyecto{


  


    //Atributos

    private String nombre;

    private String descripcion;

    private String fechaInicio;

    private Participante dueño;

    private LinkedList<Actividad> actividades;

    private HashMap<Actividad, LinkedList<Participante>> hash;





    //constructor

    public Proyecto(String pNombre, String pDescripcion, String pFechaInicio, String pCorreo  ){

        nombre = pNombre;

        descripcion = pDescripcion;

        fechaInicio = pFechaInicio;

        dueño = new Participante(pNombre, pCorreo);

        actividades = new LinkedList<Actividad>();

        hash = new HashMap<Actividad,LinkedList<Participante>>();

        

    }




    //metodos

     /*
    * Añade una actividad a la lista de actividades 
    * @param participante
    */
    public void addActividad( ){

        

    }
    /*
    * Metodo que retorna actividad segun participante recibido por param 
    * @param NombreParticipante
    */
    public String mostrarActividad(String pNombreParticipante){
        
        String respuesta = "";


        

        return respuesta;

    }

    public void guardarProyecto(String pNombreArchivo)
    {

        try(PrintWriter writer = new PrintWriter(pNombreArchivo + ""))
        {

        StringBuilder sb = new StringBuilder();
        
        sb.append("nombre");
        sb.append(',');
        sb.append("descripcion");
        sb.append(',');
        sb.append("dueno");
        sb.append('\n');

        sb.append(nombre);
        sb.append(',');
        sb.append(descripcion);
        sb.append(',');
        sb.append(dueño);
        sb.append('\n');
        sb.append("actividades");
        sb.append('\n');

        for(int i = 0; i < actividades.size();i++)
        {
            Actividad actual = actividades.get(i);
            sb.append (actual.getTitulo());
            sb.append(',');
            sb.append (actual.getTipo());
            sb.append(',');
            sb.append (actual.getDescripcion());
            sb.append(',');
            sb.append (actual.getTitulo());
            sb.append(',');
            sb.append('\n');
            sb.append("participantes");
            sb.append('\n');
            LinkedList<Participante> participantes = actual.getParticipantes();
            sb.append(participantes.toString());
        }

        }
        catch(Exception e )
        {

        }


        

    }








}



