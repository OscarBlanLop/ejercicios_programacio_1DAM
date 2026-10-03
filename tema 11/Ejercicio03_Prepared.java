package ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio03_Prepared {
    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306/empresa";
            Connection con = DriverManager.getConnection (url, "root", "1234");
            
            
            Scanner entrada = new Scanner (System.in);
            
            System.out.print ("Dime el nombre de la ciudad: ");
            String nombreCiudad = entrada.nextLine();

            
            String sql = "SELECT * FROM oficina " +
                            " where lower(ciudad) like lower( ? )";

            System.out.println (sql);

            PreparedStatement stm = con.prepareStatement(sql);
            nombreCiudad = "%" + nombreCiudad + "%";
            stm.setString(1, nombreCiudad);
            
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt ("idOfi");
                String ciudad = rs.getString ("ciudad");
                int superficie = rs.getInt ("superficie");
                int ventas = rs.getInt ("ventas");
                System.out.println ("OFICINA " + id + ": ciudad " + ciudad +
                        " | superficie " + superficie + " | ventas " + ventas);
            }
            
            stm.close();
            con.close();
            
        } catch (SQLException e) {
            System.out.println ("SQLException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println ("Se ha producido una excepción. " + e.getMessage());
        }
    }
    
}
