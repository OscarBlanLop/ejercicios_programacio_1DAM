import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {

    private static final String FICHERO = "tareas.txt"; //constante global

    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Cargar tareas del fichero
        cargarTareas(tareas);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver tareas");
            System.out.println("2. Añadir tarea");
            System.out.println("3. Guardar y salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiamos el buffer xsiaca

            switch (opcion) {
                case 1:
                    mostrarTareas(tareas);
                    break;
                case 2:
                    anadirTarea(tareas, sc);
                    break;
                case 3:
                    guardarTareas(tareas);
                    System.out.println("Tareas guardadas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 3);

        sc.close();
    }

    // funciones
    private static void cargarTareas(ArrayList<String> tareas) {
        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                tareas.add(linea);
            }
            System.out.println("Tareas cargadas correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero. Se creará uno nuevo al guardar.");

        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }
    }

   private static void mostrarTareas(ArrayList<String> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        System.out.println("\n--- LISTA DE TAREAS ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }
 /*   private static void mostrarTareas(ArrayList<String> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        System.out.println("\n--- LISTA DE TAREAS ---");
        for (String tarea : tareas) {
            int i=0;
            i++;
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }*/

    private static void anadirTarea(ArrayList<String> tareas, Scanner sc) {
        System.out.print("Introduce la nueva tarea: ");
        String tarea = sc.nextLine();

        if (!tarea.isEmpty()) {
            tareas.add(tarea);
            System.out.println("Tarea añadida.");
        } else {
            System.out.println("No se puede añadir una tarea vacía.");
        }
    }

    private static void guardarTareas(ArrayList<String> tareas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO))) {

            for (String tarea : tareas) {
                bw.write(tarea);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al guardar el fichero.");
        }
    }
}