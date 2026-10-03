package ejercicios;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Ejercicio01 {
    public static void main (String [] args) {
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

            //System.out.print("Fecha de contrato (YYYY-MM-DD): ");
            //String contrato = teclado.nextLine();

            String url = "jdbc:mysql://localhost:3306/empresa";

            // Crea la conexión a la bbdd
            Connection con = DriverManager.getConnection(url, "root", "1234");

            // Crea el statement
            Statement stm = con.createStatement();
            String insert = "INSERT INTO empleado VALUES "
                    + "(" + numEmp + ", '" + nombre + "', " + edad + ", "+ oficina + ","+
                    "'" + puesto +"', now())";
            System.out.println (insert);
            int numFilas = stm.executeUpdate (insert);
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
