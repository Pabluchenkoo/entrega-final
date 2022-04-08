package Model;

import java.util.LinkedList;

public class Model 
{

    private LinkedList<Proyecto> proyectos;

    public Model()
    {

        proyectos = new LinkedList<Proyecto>();

    }


    public void cargarProyecto()
    {
        for (int i = 0; i < proyectos.size(); i++)
        {
            Proyecto actual = proyectos.get(i);
            actual.cargarProyecto();
        }

    }


    public void guardar(String pNombreArchivo){
        for (int i =0; i<proyectos.size(); i++)
        {
            Proyecto actual = proyectos.get(i);
            actual.guardarProyecto(pNombreArchivo);
        }
    }

    public LinkedList<Proyecto> darProyectos()
    {
        return proyectos;
    }

    public void crearProyecto(String pNombre, String pDescripcion, String pFechaInicio, String pCorreo, String pNombreDuenio)
    {
        Participante duenio = new Participante(pNombreDuenio, pCorreo);
        Proyecto nuevo = new Proyecto(pNombre, pDescripcion, pFechaInicio, pCorreo, duenio);

        proyectos.addLast(nuevo);
    }
    
    
}
