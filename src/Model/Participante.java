package Model;


public class Participante {

     //Atributos 


    private String nombre;

    private String correo;


     //Constructor 


     public Participante (String pNombre, String pCorreo)
     {

        nombre = pNombre;

        correo = pCorreo;


     }

     public String darNombre()
     {
        return nombre;
     }

     public String darCorreo()
     {
        return correo;
     }
     
     //Metodos


}
