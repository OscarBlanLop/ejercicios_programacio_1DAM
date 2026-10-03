package ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.io.FileReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.io.BufferedReader;

public class EjercicioFich01 {
    public static void main(String[] args) {
        
        /*OPCIÓN 1. Con File y Scanner*/
        try {

            System.out.println ("\n******\nOPCIÓN 1. Con File y Scanner");
            Scanner entFich = new Scanner (new File ("avila.txt"));
            /* Es lo mismo que poner: 
            File fich = new File ("avila.txt");
            Scanner entFich = new Scanner (fich);
            */

            String linea = "";
            while (entFich.hasNext()) {
                linea = entFich.nextLine();
                System.out.println (linea);
            }
            
            entFich.close();    
                
        } catch (IOException e) {
            System.out.println ("No se puede leer el fichero: " + e.getMessage());
        }


        /*OPCIÓN 2. Con FileReader y BufferedReader*/
        try {

            System.out.println ("\n******\nOPCIÓN 2. Con FileReader y BufferedReader");
            BufferedReader brFich = new BufferedReader (new FileReader ("avila.txt"));
            /* Es lo mismo que poner: 
            FileReader fichLect = new FileReader ("avila.txt");
            BufferedReader brFich = new BufferedReader (fichLect);
            */

            String linea = "";
            while (brFich.ready()) {
                linea = brFich.readLine();                
                System.out.println (linea);
            }
            
            brFich.close();    
                
        } catch (IOException e) {
            System.out.println ("No se puede leer el fichero: " + e.getMessage());
        }
    
    
        /*OPCIÓN 3. con FileInputStream, InputStreamReader y BufferedReader*/
        try {
            
            System.out.println ("\n******\nOPCIÓN 3. Con FileInputStream, InputStreamReader y BufferedReader");

            FileInputStream fis = new FileInputStream ("avila.txt");
            InputStreamReader isr = new InputStreamReader (fis);
            BufferedReader br = new BufferedReader (isr);

            String linea = "";
            while (br.ready()) {
                linea = br.readLine();                
                System.out.println (linea);
            }
            
            br.close();  
            isr.close();
            fis.close();
                
        } catch (IOException e) {
            System.out.println ("No se puede leer el fichero: " + e.getMessage());
        }
    }

}
