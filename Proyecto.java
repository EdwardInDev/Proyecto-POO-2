package es.ifp.programacion.ejercicio.uf5;

/**
 * Modificación en la clase proyecto respecto al ejercicio anterior en la que se modifica el constructor asignando estos ArrayList
 * Se realiza encapsulamiento poniendo el modificador de visibilidad en private para los atributos y en public para los métodos
 * Se indica los atributos con el apuntador this. como buena práctica
 */

//Se importa la clase Date para la fecha inicial
//Se importa la clase ArrayList para usar estructura de datos de arraylist
import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
	
	
	//Definición de atributos
	
	private String nombreProyecto;
	private String idProyecto;
	private String descProyecto;
	private Date fechaIni;
	
	//Definición de atributos con arraylist para la clase Cliente y JefeProyecto
	
	private ArrayList<Cliente> clientes;
	private ArrayList<JefeProyecto> jefesproyecto;
	
	//Definición de constructores

/**
 * Contructor con todos los parámetros
 * @param nomPro nombre del proyecto
 * @param idPro identificador del proyecto
 * @param descPro descripción del proyecto
 * @param fechaIn fecha de inicio del proyecto
 * @param clientes ArrayList que contiene los clientes
 * @param jefesproyecto ArrayList que contiene los jefes de proyecto
 */	
	public Proyecto (String nomPro, String idPro, String descPro, Date fechaIn, ArrayList<Cliente> clientes, ArrayList<JefeProyecto> jefesproyecto){
		this.nombreProyecto=nomPro;
		this.idProyecto=idPro;
		this.descProyecto=descPro;
		this.fechaIni=fechaIn;
		this.clientes= clientes;
		this.jefesproyecto = jefesproyecto;
}

	//Definición de métodos
	
	/**
	 * Método que retorna el identificador del proyecto
	 * @return un string con el identificador del proyecto
	 */
	public String getIdPro() {
		return this.idProyecto;
	}
	
	/**
	 * Modifica el identificador del proyecto
	 * @param nuevoIdPro valor del tipo String con el nuevo identificador del proyecto
	 */
	public void setIdPro(String nuevoIdPro) {
		this.idProyecto=nuevoIdPro;
	}
	
	/**
	 * Método que retorna el nombre del proyecto
	 * @return un String con el nombre del proyecto
	 */
	public String getNomPro() {
		return this.nombreProyecto;
	}
	
	/**
	 * Modifica el nombre del proyecto
	 * @param nuevoNomPro valor del tipo String con el nuevo nombre del proyecto
	 */
	public void setNomPro(String nuevoNomPro) {
		this.nombreProyecto=nuevoNomPro;
	}
	
	/**
	 * Método que retorna la descripción del proyecto
	 * @return un String con la descripción del proyecto
	 */
	public String getDescPro() {
		return this.descProyecto;
	}
	
	/**
	 * Modifica la descripción del proyecto
	 * @param nuevoDescPro valor del tipo String con la nueva descripción del proyecto
	 */
	public void setDescPro(String nuevaDescPro) {
		this.descProyecto=nuevaDescPro;
	}
	
	/**
	 * Método que retorna la fecha de inicio del proyecto
	 * @return un Date con la fecha de inicio del proyecto
	 */
	public Date getFechaIn() {
		return this.fechaIni;
	}
	
	/**
	 * Modifica la fecha de inicio del proyecto
	 * @param nuevoFechaIn valor del tipo Date con la nueva fecha de inicio del proyecto
	 */
	public void setFechaIn(Date nuevaFechaIn) {
		this.fechaIni=nuevaFechaIn;
	}
	
	/**
	 * Método que retorna los clientes listados
	 * @return clientes un ArrayList con los clientes
	 */
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * Modifica el ArrayList de los clientes listados
	 * @param clientes valor del tipo ArrayList con nuevos clientes
	 */
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	/**
	 * Método que retorna los jefes de proyecto listados
	 * @return jefesproyecto un Arraylist con los jefes de proyecto
	 */
	public ArrayList<JefeProyecto> getJefesproyecto() {
		return jefesproyecto;
	}

	/**
	 * Modifica el ArrayList de los jefes de proyecto listados
	 * @param jefesproyecto valor del tipo ArrayList con nuevos clientes
	 */
	public void setJefesproyecto(ArrayList<JefeProyecto> jefesproyecto) {
		this.jefesproyecto = jefesproyecto;
	}
	
	//Llamada al método toString
	
	/**
	 * Se sobreescribe el método toString para que retorne todos los datos de Proyecto en un String
	 * @return un String con todos los atributos de la clase Proyecto
	 */
	
	@Override
	public String toString() {
		return  "========================================="+"\n"+
				"              DATOS PROYECTO             "+"\n"+
				"========================================="+"\n"+
				"Nombre del proyecto:"+this.getNomPro()+"\n"+
				"Identificador del proyecto:"+this.getIdPro()+"\n"+
				"Descripción:"+this.getDescPro()+"\n"+
				"Fecha de inicio:"+this.getFechaIn();
	}
	
}