package View;

public class View {

    /**
     * Metodo constructor
     */
    public View() 
    {

    }

    public void printMenu() 
    {
        System.out.println("1. Cargar estructuras");
        System.out.println("2. Cargar Requerimientos ");
        System.out.println("3. Probar metodo .get()");
        System.out.println("4. Exit");
        System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
    }

    public void printMessage(String mensaje) 
    {

        System.out.println(mensaje);
    }

}
