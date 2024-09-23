package es.ifp.programacion.ejercicio.uf5;

/**
 * Se realiza encapsulamiento poniendo el modificador de visibilidad en private para los atributos y en public para los métodos
 * Se indica los atributos con el apuntador this. como buena práctica
 * La clase JefeProyecto hereda los atributos de la clase Persona
 * Se implementa un método desde una clase interface
 */
public class JefeProyecto extends Persona implements IRol {
	
	
	//Definición de de atributos
	
	private int numEmpleado;
	
	//Definición de Constructores

	/**
	 * Constructor de la clase JefeProyecto que invoca al constructor de la clase padre, Persona
	 * @param nombre tipo String del jefe de proyectos
	 * @param apellidos tipo String del jefe de proyectos
	 * @param dni tipo String del jefe de proyectos
	 * @param nEmp tipo entero es el numero de empleado del jefe de proyectos
	 */
	
	public JefeProyecto (String nombre, String apellidos, String dni, int nEmp) {
		//Con la palabra reservada "super" llamamos a un constructor de la clase padre
		super (nombre, apellidos, dni);
		this.numEmpleado=nEmp;
	}
	
	//Definición de métodos
	/**
	 * Método get que retorna el número de empleado del jefe de proyectos
	 * @return un String con el número de empleado del jefe de proyectos
	 */
	public int getNEmp() {
		return this.numEmpleado;
	}
	
	/**
	 * Método set del atributo numEmpleado para mofidicar el número de empleado
	 * @param nuevoNEmp nuevo valor int que se asigna al número de empleado del jefe de proyectos
	 */
	public void setNEmp(int nuevoNEmp) {
		this.numEmpleado=nuevoNEmp;
	}
	
	/**
	 * Se sobreescribe el método toString para que retorne todos los datos de JefeProyecto en un String
	 * @return un String con todos los atributos de la clase JefeProyecto
	 */
	
	@Override
	public String toString() {
		return super.toString()+
				"Rol:"+getRole()+"\n"+
				"Número de empleado:"+this.getNEmp();
	}
	
	/**
	 * Método implementado de la interface IRol que retorna el rol del empleado
	 * @return el rol del empleado como JP
	 */
	public String getRole() {
		return "JP";
	}
	
}