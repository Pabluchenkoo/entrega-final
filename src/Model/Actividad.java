package Model;
import java.util.LinkedList;

public class Actividad 
{

    //Constantes

    private static final String DOCUMENTACION = "documentacion";

    private static final String IMPLEMENTACION = "implementacion";
      
    private static final String PRUEBAS = "pruebas";
      
    private static final String INVESTIGACION = "investigacion";
  
    private static final String DISENIO = "disenio";


    //Atributos

    private String titulo;

    private String descripcion;

    private String tipo;

    private String fecha;

    private String horaI;

    private String horaF;

    private LinkedList<Participante> participantes;


    //constructor

    public Actividad(String pTitulo, String pDescripcion, String pTipo, String pFecha, String horaIA, String horaFA)
    {
        setTitulo(pTitulo);
        setDescripcion(pDescripcion);
        setTipo(pTipo);
        setFecha(pFecha);
        setHoraI(horaIA);
        setHoraF(horaFA);
        participantes = new LinkedList<Participante>();


    }



    //Metodos
    

    public String getHoraF() {
        return horaF;
    }



    public void setHoraF(String horaF) {
        this.horaF = horaF;
    }



    public String getHoraI() {
        return horaI;
    }



    public void setHoraI(String horaI) {
        this.horaI = horaI;
    }



    public String getFecha() {
        return fecha;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public void modificarFecha(String pFechaNueva)
    {
        setFecha(pFechaNueva);
    }
    public LinkedList<Participante> getParticipantes()
    {
        return participantes;

    }
    public void addParticipante(String pNombre, String pCorreo)
    {

        Participante aAnadir = new Participante(pNombre, pCorreo);

        participantes.addLast(aAnadir);
    }

}
