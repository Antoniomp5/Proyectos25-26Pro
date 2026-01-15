package proyecto4;

public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear libros
		Libro libro1 = new Libro ("9788445003022", "El Señor de los Anillos", "J. R. R. Tolkien", 1954, EstadoPrestamo.DISPONIBLE);
		Libro libro2 = new Libro ("9788408296225", "RECONCILIACIÓN", "Juan Carlos I", 2025, EstadoPrestamo.DISPONIBLE);
		Libro libro3 = new Libro ("9788499086514", "LOS PILARES DE LA TIERRA", "Ken Follett", 2010, EstadoPrestamo.DISPONIBLE);
		
        // Crear usuarios
        Usuario usuario1 = new Usuario("48392017M", "Ana", 30);
        Usuario usuario2 = new Usuario("75618432F", "Carlos", 20);
        Usuario usuario3 = new Usuario("20947365R", "Jose María", 70);
        
        // información antes del prestamo
        System.out.println("=== Información antes del préstamo ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        System.out.println(); 

        // Realizar préstamo
        Prestamo prestamo1 = new Prestamo(libro1, usuario1);
        Prestamo prestamo2 = new Prestamo(libro3, usuario2);
        Prestamo prestamo3 = new Prestamo(libro2, usuario3);

        // Mostrar información DESPUÉS del préstamo
        System.out.println("=== Información después del préstamo ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        System.out.println();

        // Mostrar detalles del préstamo
        System.out.println("=== Detalle del préstamo ===");
        prestamo1.mostrarDetalle();
        prestamo2.mostrarDetalle();
        prestamo3.mostrarDetalle();

        // Comprobar referencia: cambiar estado desde el préstamo
        prestamo1.libro.cambiarEstado(EstadoPrestamo.DISPONIBLE);
        prestamo2.libro.cambiarEstado(EstadoPrestamo.DISPONIBLE);
        prestamo3.libro.cambiarEstado(EstadoPrestamo.DISPONIBLE);

        System.out.println();
        System.out.println("=== Estado del libro tras cambiarlo desde el préstamo ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
		
		

	}

}
