package Model;

import java.util.LinkedList;

public class Model 
{

    private LinkedList<Proyecto> proyectos;

    public Model()
    {

        proyectos = new LinkedList<Proyecto>();

    }

    public void guardar(String pNombreArchivo){
        for (int i =0; i<proyectos.size(); i++)
        {
            Proyecto actual = proyectos.get(i);
            actual.guardarProyecto(pNombreArchivo);
        }
    }
    
}
