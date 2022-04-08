package Model;

import java.util.HashMap;
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


    public void guardar(){
        for (int i =0; i<proyectos.size(); i++)
        {
            Proyecto actual = proyectos.get(i);
            actual.guardarProyecto();
        }
    }

    public LinkedList<Proyecto> darProyectos()
    {
        return proyectos;
    }

    public Proyecto crearProyecto(String pNombre, String pDescripcion, String pFechaInicio, String pCorreo, String pNombreDuenio)
    {
        Participante duenio = new Participante(pNombreDuenio, pCorreo);
        Proyecto nuevo = new Proyecto(pNombre, pDescripcion, pFechaInicio, pCorreo);

        proyectos.addLast(nuevo);

        return nuevo;
    }

    public void asignarParticipante(Proyecto pProyecto, Participante pParticipante) {
        
        for (int i =0; i<proyectos.size(); i++)
        {
            Proyecto actual = proyectos.get(i);
            if(actual == pProyecto){
                HashMap<Proyecto, LinkedList<Participante>> hash = actual.darHash();
                LinkedList<Participante> participantes = new LinkedList<Participante>();
                participantes.addLast(pParticipante);
                hash.put(pProyecto, participantes);
            }
        }

    }

    public void agregarActividad(Actividad pActividad)
    {
        for (int i =0; i<proyectos.size(); i++)
        {
            Proyecto actual = proyectos.get(i);
            actual.agregarActividad(pActividad);
        }
    }


    public void generarReporte() {
        for (int i =0; i<proyectos.size(); i++)
        {
            Proyecto actual = proyectos.get(i);
            actual.generarReporte();
        }

    }
    
    
}
