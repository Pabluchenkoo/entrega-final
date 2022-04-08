package Controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;

import Model.Actividad;
import Model.Model;
import Model.Participante;
import Model.Proyecto;

import javax.swing.text.View;

public class Controller

{

	/* Instancia del Modelo */
	private Model modelo;

	/**
	 * Crear la vista y el modelo del proyecto
	 * 
	 */
	public Controller() {

		modelo = new Model();
	}

	public void printMenu() {

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

	public void run() {
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		Object respuesta = null;

		while (!fin) {
			printMenu();

			int option = lector.nextInt();
			switch (option) {
				case 1:
					LinkedList<Proyecto> proyectos = modelo.darProyectos();
					for (int i = 0; i < proyectos.size(); i++) {
						modelo.cargarProyecto();
					}

					break;

				case 2:
					System.out.println("Introducir nombre del proyecto");
					String nombre = lector.nextLine();
					System.out.println("Introducir descripción del proyecto");
					String descripcion = lector.nextLine();
					System.out.println("Introducir fecha de inicio del proyecto DD/MM/AA");
					String fechaI = lector.nextLine();
					System.out.println("Introducir correo");
					String correo = lector.nextLine();
					System.out.println("Introducir nombre del creador");
					String duenio = lector.nextLine();
					Proyecto nuevoProyecto = new Proyecto(nombre, descripcion, fechaI, correo);

					System.out.println("Proyecto creado correctamente");

					break;
				case 3:

					System.out.println("_________crear participante__________");
					System.out.println("Introducir nombre del participante");
					String nombreParticipante = lector.nextLine();
					System.out.println("Introducir correo del participante");
					String correoParticipante = lector.nextLine();

					Participante nuevoParticipante = new Participante(nombreParticipante, correoParticipante);
					modelo.asignarParticipante(nuevoProyecto, nuevoParticipante);

				case 4:
					System.out.println("_________crear actividad__________");
					System.out.println("Introducir titulo de la actividad");
					String titulo = lector.nextLine();
					System.out.println("Introducir descripcion del proyecto");
					String descrip = lector.nextLine();
					System.out.println("Introducir tipo del proyecto");
					String tipo = lector.nextLine();
					System.out.println("Introducir fecha del proyecto DD/MM/AA");
					String fechaA = lector.nextLine();
					System.out.println("Introducir hora incial de la actividad HH:MM");
					String horaIA = lector.nextLine();
					System.out.println("Introducir hora final de la actividad HH:MM");
					String horaFA = lector.nextLine();
					Actividad nueva = new Actividad(titulo, descrip, tipo, fechaA, horaIA, horaFA);
					try {
						if (tipo.equals("documentacion") | tipo.equals("implementacion") | tipo.equals("pruebas")
								| tipo.equals("investigacion") | tipo.equals("disenio")) {

							
							modelo.agregarActividad(nueva);
						}
					} catch (Exception e) {
						System.out.println("El tipo no corresponde a ninguno de los estipulados para una actividad");
						e.printStackTrace();
					}

					break;
				case 5:
				System.out.println("_________Indicar inicio de actividad__________");
				String inicioActividad = java.time.LocalTime.now().toString();
				nueva.setHoraI(inicioActividad);
				System.out.println(java.time.LocalTime.now());
					break;

				case 6:
				System.out.println("_________Indicar fin de actividad__________");
				String finActividad = java.time.LocalTime.now().toString();
				nueva.setHoraF(finActividad);
				System.out.println(java.time.LocalTime.now());
					
				break;

				case 7:
					modelo.generarReporte();
					break;




				default:

					break;
			}
		}
	}

}
