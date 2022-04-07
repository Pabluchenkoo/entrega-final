package Controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import Model.Proyecto;
import javax.swing.text.View;

public class Controller {
    /* Instancia del Modelo */
    private Proyecto modelo;

    /* Instancia de la Vista */
    private View view;

    /**
     * Crear la vista y el modelo del proyecto
     * 
     */
    public Controller() {
        view = new View();
        modelo = new Proyecto(null, null, null, null);
    }

    public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		Object respuesta = null;

		
		while(!fin)
        {
			view.printMenu();
			
			int option = lector.nextInt();
			switch(option)
            {
				case 1:
					view.printMessage("Inicializando...");
					try 
                    {
                        String a = lector.nextString();
					view.printMessage(modelo.guardarProyecto(a));
				    } 
                    catch (ParseException e1) 
                    {
					    // TODO Auto-generated catch block
					    e1.printStackTrace();
                    }
					
				break;	

				case 2:

					view.printMessage("Seleccione un requerimiento");
					int res = lector.nextInt();
					
					break;					
				case 3:
					
				case 4:
					view.printMessage("");
					break;
				case 5: 
					view.printMessage("--------- \n Hasta pronto !! \n---------"); 
					lector.close();
					fin = true;
					break;				
				
				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
	}
    
}
