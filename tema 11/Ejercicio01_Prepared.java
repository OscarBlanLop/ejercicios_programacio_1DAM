package ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio01_Prepared {
    public static void main(String[] args) {
        try {

            // Recoger los datos del nuevo socio por teclado
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca los datos del nuevo empleado: ");

            System.out.print("Nº de empleado: ");
            int numEmp = teclado.nextInt();
            teclado.nextLine(); // Coge el salto de línea

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Edad: ");
            int edad = teclado.nextInt();

            System.out.print("Oficina: ");
            int oficina = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Puesto: ");
            String puesto = teclado.nextLine();

            String url = "jdbc:mysql://localhost:3306/empresa";

            // Crea la conexión a la bbdd
            Connection con = DriverManager.getConnection(url, "root", "1234");

            // Crea la query con parámetros
            String insert = "INSERT INTO empleado VALUES "
                    + "(?, ?, ?, ?,?, now())";
            System.out.println (insert);
            
            // Crea el statement con la query con parámetros
            PreparedStatement stm = con.prepareStatement(insert);
            // Da valor a los parámetros
            stm.setInt (1, numEmp);
            stm.setString (2, nombre);
            stm.setInt(3, edad);
            stm.setInt(4, oficina);
            stm.setString (5, puesto);
            
            // Ejecuta
            int numFilas = stm.executeUpdate ();
            System.out.println ("Se han insertado " + numFilas + " filas");
            System.out.println ("Se ha dado de alta un nuevo empleado llamado " + nombre);
            
            stm.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("ERROR en la BBDD: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
