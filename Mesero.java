package proyectorestaurante;
/*
@authors Andres and Alvaro
*/
public class Mesero {

	private String nombre;
	private String nombreRestaurante;
	
//getter and setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreRestaurante() {
		return nombreRestaurante;
	}

	public void setNombreRestaurante(String nombreRestaurante) {
		this.nombreRestaurante = nombreRestaurante;
	}
	
	
	@Override
	public String toString() {
		return "Hola, bienvenido a " +nombreRestaurante+ " soy " + nombre + ", su asistente virtual";
	}
	
	
}
