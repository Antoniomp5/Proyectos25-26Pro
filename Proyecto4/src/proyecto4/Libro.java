package proyecto4;

public class Libro {
	
	// Atribuos de la clase libro
	String isbn;
	String titulo;
	String autor;
	int anioPublicacion;
	EstadoPrestamo estado;
	boolean esAntiguo;
	
	// Constructor de la clase libro
	public Libro(String isbn, String titulo, String autor, int anioPublicacion, EstadoPrestamo estado) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.estado = estado;
	}
	
	
	// Métodos de la clase libro
	void mostrarInformacion() {
		System.out.println("ISBN: " + isbn);
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Año: " + anioPublicacion);
		System.out.println("Estado: " + estado);
	}
	
	boolean esAntiguo() {
		int anioActual = 2026;
		return  (anioActual - anioActual)  > 20;
		} 
	
	void cambiarEstado(EstadoPrestamo nuevoEstado) {
	    this.estado = nuevoEstado;
	    System.out.println("El estado del libro ha cambiado a: " + nuevoEstado);
		
	}


}
