// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Persona: Presidente
        Presidente presidente = new Presidente();
        presidente.setNombre("Florentino");
        presidente.setApellido("Perez");

        Presidente presidente2 = new Presidente();
        presidente2.setNombre("Joan");
        presidente2.setApellido("Laporta");

        // Persona: Entrenador
        Entrenador entrenador = new Entrenador();
        entrenador.setNombre("Carlo");
        entrenador.setApellido("Ancelotti");

        Entrenador entrenador2 = new Entrenador();
        entrenador2.setNombre("Xavi");
        entrenador2.setApellido("Hernandez");

        // Persona: Jugador
        Jugador jugador = new Jugador();
        jugador.setNombre("Jude");
        jugador.setApellido("Bellingham");

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Robert");
        jugador2.setApellido("Lewandowski");

        imprimir(presidente);
        imprimir(entrenador);
        imprimir(jugador);
        imprimir(presidente2);
        imprimir(entrenador2);
        imprimir(jugador2);
    }

public static void imprimir(Persona persona) {
    System.out.println("Nombre:" + persona.getNombre());

    System.out.println("Apellido:" + persona.getApellido());

    }
}