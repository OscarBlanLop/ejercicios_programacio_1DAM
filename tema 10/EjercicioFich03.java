package ejercicios;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.File;
import java.io.FileWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class EjercicioFich03 {
    public static void main(String[] args) {
        
        /*OPCIÓN 1. Con File y FileWriter*/
        try {
            
            System.out.println ("\n******\nOPCIÓN 1. Con File y FileWriter");

            File fich = new File ("fruta.txt");
            FileWriter fichWr = new FileWriter (fich);            
            // Las dos líneas anteriores son similares a:
            // FileWriter fichWr = new FileWriter (new File ("fruta.txt"));
            
            fichWr.write ("\n*** Opción 1 ***\n");
            fichWr.write ("naranja\n");
            fichWr.write ("mango\n");
            fichWr.write ("fresa\n");
            
            fichWr.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el fichero. ERROR: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println ("No se ha podido escribir en el fichero. ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println ("Se ha producido la siguiente excepción: " + e.getMessage());
            e.printStackTrace();
        }

        /*OPCIÓN 2. Con FileWriter y BufferedWriter*/
        try {
            
            System.out.println ("\n******\nOPCIÓN 2. Con FileReader y BufferedReader");

            FileWriter fichWr = new FileWriter ("fruta.txt", true);
            BufferedWriter bw = new BufferedWriter (fichWr);
            
            // Las dos líneas anteriores son similares a:
            // FileWriter fichWr = new FileWriter (new File ("fruta.txt"));
            
            bw.write ("\n*** Opción 2 ***\n");
            bw.write ("chirimoya\n");
            bw.write ("mango\n");
            bw.write ("pera\n");
            bw.write ("manzana\n");
            bw.write ("mandarina\n");
            
            bw.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el fichero. ERROR: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println ("No se ha podido escribir en el fichero. ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println ("Se ha producido la siguiente excepción: " + e.getMessage());
            e.printStackTrace();
        }
        
        /*OPCIÓN 3. Con FileInputStream, InputStreamReader y BufferedReader*/
        try {
            
            System.out.println ("\n******\nOPCIÓN 3. Con FileInputStream, InputStreamReader y BufferedReader");
            
            FileOutputStream fos = new FileOutputStream ("fruta.txt",true);
            OutputStreamWriter osw = new OutputStreamWriter (fos);
            BufferedWriter bw = new BufferedWriter (osw);
            
            bw.write ("\n*** Opción 3 ***\n");
            bw.write ("chirimoya\n");
            bw.write ("mango\n");
            bw.write ("pera\n");
            bw.write ("manzana\n");
            bw.write ("fresa\n");
            
            bw.close();
            osw.close();
            fos.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el fichero. ERROR: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println ("No se ha podido escribir en el fichero. ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println ("Se ha producido la siguiente excepción: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
