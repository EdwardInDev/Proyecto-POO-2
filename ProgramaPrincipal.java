package es.ifp.programacion.ejercicio.uf5;

/**
 * ProgramaPrincipal que permite la ejecución del programa de pruebas que contiene: Un proyecto, 2 clientes y 2 jefes de proyecto
 * La estructura de datos escogida es ArrayList por su acceso rápido, flexibilidad y facilidad de manipulación para almacenar y trabajar
 * con varios objetos de la clase Cliente y JefeProyecto
 * Se crean las instancias con el cliente y jefe de proyecto adicionales
 * Se crea los ArrayList llamando a su constructor por defecto
 * En la creación de la instancia proyecto se ha modificado el parámetro respecto al ejercicio anterior para que contenga los arraylist de clientes y jefesproyeco
 * En la instancia de Proyecto con el método toString me extrae los datos de proyecto unicamente
 * porque los de clientes y jefes de proyecto serán impresos en el recorrido del arraylist
 * Los datos que se muestran en consola solo los puede crear el programador, por lo que no se puede modificar por un usuario
 */

//Se importa la clase date para completar los parámetros de Proyecto
//Se importa la clase ArrayList para usar estructura de datos de arraylist
//Se importa la clase iterator para recorrer el arraylist

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Creación de instancias de clientes y jefes de proyecto
		
		Cliente cliente1 = new Cliente (" Andrés", " Gómez Lara", " 12345678A", " ID23");
		Cliente cliente2 = new Cliente (" Andrés2", " Gómez2 Lara2", " 22335577A", " ID24");
		
		JefeProyecto jefeproyecto1 = new JefeProyecto (" Juan Pedro", " Marrero Tarriño", " 98765432B", 5);
		JefeProyecto jefeproyecto2 = new JefeProyecto (" Juan2 Pedro2", " Marrero2 Tarriño2", " 99663322B", 6);
		
		//Creación de Arraylist para almacenar clientes y jefes de proyecto
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<JefeProyecto> jefesProyecto = new ArrayList<>();

		//Creación de la instancia Proyecto con los parámetros de su constructor modificados respecto al ejercicio anterior
		
		Proyecto proyecto = new Proyecto(" BOG", " PRJ1001", " Broker Online BA", new Date(), clientes, jefesProyecto);
		
		//Agregar clientes y jefes de proyecto al ArrayList respectivo
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		
		jefesProyecto.add(jefeproyecto1);
		jefesProyecto.add(jefeproyecto2);
		
		//Se imprime la instancia proyecto con el método toString que me extrae los datos de los que se compone Proyecto
		//por lo que se invocan al programa principal
		
		System.out.println(proyecto.toString());
		
		//Creación de un iteardor para recorrer el ArrayList de clientes
		
		Iterator<Cliente>
		iteradorClientes = clientes.iterator();
		
		//Creación de un iterador para recorrer el ArrayList de JefeProyecto
		
		Iterator<JefeProyecto>
		iteradorJefesProyecto = jefesProyecto.iterator();
		
		//Recorrer el ArrayList utilizando el iterador y el bucle while e imprimir los datos de los cientes
		
		System.out.println("========================================="+"\n"+
		                   "               DATOS CLIENTES            "+"\n"+
		                   "=========================================\n");
		
		while
			(iteradorClientes.hasNext()) {
			Cliente variosClientes =
					iteradorClientes.next();
		//el método toString extrae los datos de la clase Cliente	
		System.out.println(variosClientes.toString());
		System.out.println("\n_________________________________________\n");
		}
		
		//Recorrer el ArrayList utilizando el iterador y el bucle while e imprimir los datos de los jefes de proyecto
		
		System.out.println("========================================="+"\n"+
                           "               DATOS JPS                 "+"\n"+
                           "=========================================\n");
		while
			(iteradorJefesProyecto.hasNext()) {
			JefeProyecto variosJefes =
					iteradorJefesProyecto.next();
		//el método toString extrae los datos de la clase JefeProyecto	
		System.out.println(variosJefes.toString());
		System.out.println("________________________________________\n");
		}
		
	}

}
