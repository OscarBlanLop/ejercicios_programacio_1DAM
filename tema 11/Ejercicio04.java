package ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio04 {
 public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306/empresa";
            Connection con = DriverManager.getConnection (url, "root", "1234");
            Statement sentencia = con.createStatement();
            
            Scanner entrada = new Scanner (System.in);
            
            System.out.print ("Dime la edad mínima del empleado: ");
            int edadMin = entrada.nextInt();

            System.out.print ("Dime la edad máxima del empleado: ");
            int edadMax = entrada.nextInt();

            String sql = "SELECT * FROM empleado " +
                            " where edad >= "+edadMin+" and edad <= "+edadMax;
            
            System.out.println (sql);
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                String nombre = rs.getString ("nombre");
                int edad = rs.getInt ("edad");
                System.out.println ("EMPLEADO: nombre " + nombre + " | edad " + edad);
            }
            
            sentencia.close();
            con.close();
            
        } catch (SQLException e) {
            System.out.println ("SQLException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println ("Se ha producido una excepción. " + e.getMessage());
        }
    }
    
}
