package es.ifp.programacion.ejercicio.uf5;

/**
 * Se realiza encapsulamiento poniendo el modificador de visibilidad en private para los atributos y en public para los métodos
 * Se indica los atributos con el apuntador this. como buena práctica
 * Definición de la clase Persona
 * Una persona se compone de un nombre, apellidos y dni
 */
public class Persona {

	//Definición de atributos
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	/**
	 * Constructor con todos los parámetros:
	 * @param nom para el nombre del cliente
	 * @param ape para los apellidos del cliente
	 * @param id para la identificación del cliente
	 */
	public Persona (String nom, String ape, String id){
		this.nombre=nom;
		this.apellidos=ape;
		this.dni=id;
	}
	
	//Definición de métodos sin setters porque no se puede modificar estos datos
	
	/**
	 * Método get que retorna el nombre de la persona
	 * @return un String con el nombre de la persona
	 */
	public String getNom() {
		return this.nombre;
	}
	
	/**
	 * Método get que retorna los apellidos de la persona
	 * @return un String con los apellidos de la persona
	 */
	public String getApe() {
		return this.apellidos;
	}
	
	/**
	 * Método get que retorna el DNI de la persona
	 * @return un String con el DNI de la persona
	 */
	public String getId() {
		return this.dni;
	}
	
	@Override
	/**
	 * Se sobreescribe el método toString para que retorne todos los datos de persona en un String
	 * @return un String con todos los atributos de la clase persona
	 */
	public String toString() {
		return "Nombre:"+this.getNom()+"\n"+
			   "Apellidos:"+this.getApe()+"\n"+
			   "DNI:"+this.getId()+"\n";
	}
	
}