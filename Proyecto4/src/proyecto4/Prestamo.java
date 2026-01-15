package proyecto4;

public class Prestamo {
	// Atributos de la clase Prestramo
	Libro libro;
	Usuario usuario;
	int diasPrestamo;
	
	// Constructor de la clase Prestamo
	public Prestamo(Libro libro, Usuario usuario) {
		this.libro = libro;
		this.usuario = usuario;
		this.diasPrestamo = 0; // cada vez que preste un libro los días vuelven a 0
		
		// El cambio de estado del prestamo
		libro.cambiarEstado(EstadoPrestamo.PRESTADO);
		
	}
	
    // Métodos de la clase Prestamo
    void mostrarDetalle() {
        System.out.println("Libro: " + libro.titulo);
        System.out.println("Usuario: " + usuario.nombre);
        System.out.println("Días de préstamo: " + diasPrestamo);
        System.out.println("Estado del libro: " + libro.estado);
    }

    void marcarRetraso() {
    	libro.cambiarEstado(EstadoPrestamo.RETRASADO);
    }
	


}
