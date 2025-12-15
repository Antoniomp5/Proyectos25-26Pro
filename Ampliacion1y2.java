package holaMundo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1y2 {
    public static void main(String[] args) {

        ArrayList<String> jugadores = new ArrayList<>();

        // Jugadores iniciales
        Collections.addAll(jugadores,
                "Atalai", "Carreras", "Davilito", "Alex", "Campos",
                "Raulilto", "Raulito malvado", "Antoñito", "Jhonalito",
                "Oscar Mézar de La Capital", "Josemari", "Tupe",
                "Chopo", "Álvarito", "Daivid", "Pablito");

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        // ➕ AÑADIR MÁS JUGADORES
        System.out.print("¿Desea añadir más jugadores? (S/N): ");
        String opcion = sc.nextLine();

        while (opcion.equalsIgnoreCase("S")) {
            System.out.print("Nombre del nuevo jugador: ");
            String nuevoJugador = sc.nextLine();
            jugadores.add(nuevoJugador);

            System.out.print("¿Añadir otro jugador? (S/N): ");
            opcion = sc.nextLine();
        }

        // CONVOCADOS
        ArrayList<String> convocados = new ArrayList<>();

        System.out.print("\n¿Cuántos jugadores desea convocar?: ");
        int numConvocados = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numConvocados && !jugadores.isEmpty(); i++) {
            int indiceAleatorio = aleatorio.nextInt(jugadores.size());
            String personaSeleccionada = jugadores.get(indiceAleatorio);

            convocados.add(personaSeleccionada);
            jugadores.remove(indiceAleatorio);
        }

        // ⚽ MEZCLAR Y DIVIDIR EN EQUIPOS
        Collections.shuffle(convocados);

        System.out.print("\n¿Cuántos equipos desea crear?: ");
        int numEquipos = Integer.parseInt(sc.nextLine());

        ArrayList<ArrayList<String>> equipos = new ArrayList<>();

        for (int i = 0; i < numEquipos; i++) {
            equipos.add(new ArrayList<>());
        }

        for (int i = 0; i < convocados.size(); i++) {
            equipos.get(i % numEquipos).add(convocados.get(i));
        }

        // MOSTRAR EQUIPOS
        System.out.println("\n⚽ EQUIPOS GENERADOS:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println("\nEquipo " + (i + 1) + ":");
            for (String jugador : equipos.get(i)) {
                System.out.println(" - " + jugador);
            }
        }

        sc.close();
    }
}
