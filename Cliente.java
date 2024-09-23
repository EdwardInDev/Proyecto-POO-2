package es.ifp.programacion.ejercicio.uf5;

/**
 * Se realiza encapsulamiento poniendo el modificador de visibilidad en private para los atributos y en public para los métodos
 * Se indica los atributos con el apuntador this. como buena práctica
 * La clase Cliente hereda los atributos de la clase Persona
 * Se implementa un método desde una clase interface
 */
public class Cliente extends Persona implements IRol {
	
	
	//Definición de atributos
	
	private String idCliente;

	//Definición de constructores
	
	/**
	 * Constructor de la clase Cliente que invoca al constructor de la clase padre, Persona
	 * @param nombre del cliente
	 * @param apellidos del cliente
	 * @param dni del cliente
	 * @param idCli identificación del cliente
	 */
	public Cliente (String nombre, String apellidos, String dni, String idCli) {
		//Con la palabra reservada "super" llamamos a un constructor de la clase padre
		super(nombre, apellidos, dni);
		this.idCliente=idCli;
	}
	
	//Definición de métodos
	
	/**
	 * Metodo get que retorna la identificacion del cliente
	 * @return un String con la identificacion del cliente
	 */
	public String getIdCli() {
		return this.idCliente;
	}
	
	/**
	 * Metodo set del atributo idCli para mofidicar la identificacion del cliente
	 * @param nuevoIdCli nuevo valor String que se asigna a la identificacion del cliente
	 */
	public void setIdCli(String nuevoIdCli) {
		this.idCliente=nuevoIdCli;
	}
	
	/**
	 * Se sobreescribe el método toString para que retorne todos los datos de Cliente en un String
	 * @return un String con todos los atributos de la clase Cliente
	 */
	
	@Override
	public String toString() {
		return super.toString()+
				"Rol:"+getRole()+"\n"+
				"Identificación del cliente:"+this.getIdCli();
	}
	
	//Implementación del método de la interface
	
	/**
	 * Método implementado de la interface IRol que retorna el rol del empleado
	 * @return el rol del empleado como CLI
	 */
	public String getRole() {
		return "CLI";
	}
}