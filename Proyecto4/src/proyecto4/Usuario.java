package proyecto4;

public class Usuario {
	// Atributos de la clase Usuario
	String dni;
	String nombre;
	int edad;
	
	// Constructor de la clase Usuario
	
	public Usuario(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	
	// Método de la clase Usuario

	void mostrarDatos () {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}


}
