import java.util.Scanner;
public class U5ej1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       
        System.out.print("escribe un texto: ");
        String texto = sc.nextLine();

        String palabras = texto.replace(" ","\n");
        
        System.out.println( palabras ); 
        sc.close();   
    }
    
}
