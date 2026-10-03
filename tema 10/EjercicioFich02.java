package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import java.io.FileReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.io.BufferedReader;

public class EjercicioFich02 {
    public static void main(String[] args) {

        String nombreFich ="";
        try {

            Scanner entTeclado = new Scanner(System.in);
            System.out.print("Dame el nombre del fichero: ");
            nombreFich = entTeclado.nextLine();
            System.out.println ();
        } catch (Exception e) {
            System.out.println ("Se ha producido la siguiente excepción: " + e.getMessage());
            e.printStackTrace();
        }
            
        /*OPCIÓN 1. Con File y Scanner*/
        try {

            System.out.println ("\n******\nOPCIÓN 1. Con File y Scanner");

            File fich = new File(nombreFich);
            Scanner entFich = new Scanner(fich);
            
            int cantNum = 0;
            double suma = 0;
            String linea = "";
            
            while (entFich.hasNext()) {
                linea = entFich.nextLine();
                cantNum++;
                suma += Double.parseDouble (linea);
                System.out.println ("Elemento: " + cantNum +
                        " | Número: " + linea);
            }
            System.out.println ("La media aritmética es: " + suma/cantNum);
            entFich.close();

        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el fichero. ERROR: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println ("Error escribiendo en el fichero. ERROR: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println ("Se ha producido la siguiente excepción: " + e.getMessage());
            e.printStackTrace();
        }

        
        /*OPCIÓN 2. Con FileReader y BufferedReader*/
        try {

            System.out.println ("\n******\nOPCIÓN 2. Con FileReader y BufferedReader");

            FileReader fich = new FileReader(nombreFich);
            BufferedReader entFich = new BufferedReader(fich);
            
            int cantNum = 0;
            double suma = 0;
            
            String linea = entFich.readLine();
            while (linea != null) {
                cantNum++;
                suma += Double.parseDouble (linea);
                System.out.println ("Elemento: " + cantNum +
                        " | Número: " + linea);
                linea = entFich.readLine();
            }
            
            System.out.println ("La media aritmética es: " + suma/cantNum);
            entFich.close();
            fich.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el fichero. ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Error de E/S. ERROR: " + e.getMessage());
            e.printStackTrace();
        }


        /*OPCIÓN 3. con FileInputStream, InputStreamReader y BufferedReader*/
        try {
            
            System.out.println ("\n******\nOPCIÓN 3. Con FileInputStream, InputStreamReader y BufferedReader");

            FileInputStream fis = new FileInputStream (nombreFich);
            InputStreamReader isr = new InputStreamReader (fis);
            BufferedReader br = new BufferedReader (isr);

            int cantNum = 0;
            double suma = 0;

            String linea="";
            while (br.ready()) {
                linea = br.readLine();
                cantNum++;
                suma += Double.parseDouble (linea);
                System.out.println ("Elemento: " + cantNum +
                        " | Número: " + linea);
           }
            
            System.out.println ("La media aritmética es: " + suma/cantNum);
            br.close();  
            isr.close();
            fis.close();
                
        } catch (IOException e) {
            System.out.println ("No se puede leer el fichero: " + e.getMessage());
        }
    }

}
