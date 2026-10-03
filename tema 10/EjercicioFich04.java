package ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioFich04 {
    public static void main(String[] args) {
        
        try {
            
            // Acceso al fichero de lectura 1
            Scanner entFich1 = new Scanner (new File ("avila.txt"));
            
            // Acceso al fichero de lectura 2
            Scanner entFich2 = new Scanner (new File ("fruta.txt"));
            
            // Acceso al fichero de escritura
            FileWriter fichW = new FileWriter (new File ("mezcla.txt"));
            
            String linea1 = "";
            String linea2 = "";
            
            while (entFich1.hasNext() || entFich2.hasNext()) {
                if (entFich1.hasNext()) {
                    linea1 = entFich1.nextLine();
                    fichW.write (linea1 + "\n");
                }
                if (entFich2.hasNext()) {
                    linea2 = entFich2.nextLine();
                    fichW.write (linea2 + "\n");
                }
            }
            
            entFich1.close();
            entFich2.close();
            fichW.close();            
            
        } catch (IOException e) {
            System.out.println ("Se ha producido un error de lect/escr. ERROR: " + e.getMessage());
        }
    }
    
}
