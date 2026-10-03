public class Main {

    public static void main(String[] args) {

        Arena arena = new Arena(5);

        Guerrero g1 = new Guerrero("Ilia Topuria", 100, 3, 20, 5);
        Mago m1 = new Mago("Harry Potter", 80, 4, 25, 50);
        Arquero a1 = new Arquero("Legolas", 90, 6, 18);

        arena.agregarPersonaje(g1);
        arena.agregarPersonaje(m1);
        arena.agregarPersonaje(a1);

        arena.mostrarPersonajes();

        arena.combate(0, 1);

        System.out.println("\nEstado final:");
        arena.mostrarPersonajes();
    }
}