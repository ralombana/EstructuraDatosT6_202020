package view;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("----------");
			System.out.println("1. Cargar Grafo");
			System.out.println("2. Grado de entrada y salida de un vertice");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
}
