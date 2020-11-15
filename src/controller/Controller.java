package controller;

import java.util.Scanner;

import clases.Pelicula;
import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo(this);
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		try {
			while( !fin ){
				view.printMenu();
				int option = lector.nextInt();
				switch(option){

				case 1:
					view.printMessage("--------- \nCargando Grafo...");
					modelo = new Modelo(this);
					modelo.CargarGrafo();
					view.printMessage("--------- \nGrafo Cargado!");
					break;

				case 2:
					view.printMessage("Ingrese un Vertice a verificar");
					int id = lector.nextInt();
					modelo.gradoInOut(id);

				case 3:
					

				case 4:
					
				}
			}
		}
		catch(Exception e) {
			view.printMessage("--------- \n Error!! \n---------");
			e.printStackTrace();
			run();
		}
	}
	
	public void ImprimirPelicula(Pelicula aImprimir) {
		if (aImprimir != null) {
			view.printMessage("----------");
			view.printMessage("ID:"+aImprimir.darIdentificador());
			view.printMessage("Nombre:"+aImprimir.darNombrePelicula());
			view.printMessage("Votos:"+(int)aImprimir.darCantidadVotos());
			view.printMessage("Promedio de Votacion:"+aImprimir.darVotosPromedio());
			view.printMessage("Genero:"+aImprimir.darGenero());
			view.printMessage("Actores:");
			String[] actores = aImprimir.darListaNombresActores();
			for (int i =0;i<5;i++) {
				view.printMessage(actores[i]);
			}
		}
		else {
			view.printMessage("Ocurrio un errror, revise que el indice dado sea menor al tamaño de la lista");
		}
	}
}
