package Controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import Model.Proyecto;
import javax.swing.text.View;

public class Controller {
    /* Instancia del Modelo */
    private Proyecto modelo;

   
    

    /**
     * Crear la vista y el modelo del proyecto
     * 
     */
    public Controller() {
        
        modelo = new Proyecto(null, null, null, null);
    }

	public void printMenu()
		{
			
			System.out.println("\nBienvenido al administrador de proyectos github...");
			System.out.println("1.Cargar proyectos");
			System.out.println("2. Crear Proyecto");
			System.out.println("3. Crear Participantes");
			System.out.println("4. Crear Actividad");
			System.out.println("5. indicar inicio de actividad");
			System.out.println("6. indicar fin de actividad");
			System.out.println("7. Mostrar reporte actividades");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}





    public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		Object respuesta = null;

		
		while(!fin)
        {
			printMenu();
			
			int option = lector.nextInt();
			switch(option)
            {
				case 1:
					
				
				break;	

				case 2:

				
					break;					
				case 3:
					
				case 4:
					
					break;
				case 5: 
					
					break;				
				
				default: 
					
					break;
			}
		}
	}
    
}
