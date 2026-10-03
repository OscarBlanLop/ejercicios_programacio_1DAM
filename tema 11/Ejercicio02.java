package ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306/empresa";
            Connection con = DriverManager.getConnection (url, "root", "1234");
            Statement sentencia = con.createStatement();
            
            String sql = "SELECT * FROM empleado";
            
            System.out.println (sql);
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt ("idEmp");
                String nombre = rs.getString ("nombre");
                int edad = rs.getInt ("edad");
                int ofi = rs.getInt ("oficina");
                String puesto = rs.getString ("puesto");
                Date fechaContrat = rs.getDate ("contrato");
                System.out.println ("EMPLEADO " + id + ": nombre " + nombre + " | edad " + edad +
                        " | oficina " + ofi + " | puesto " + puesto + " | contrato " + fechaContrat);
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
