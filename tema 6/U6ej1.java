import java.util.Scanner;
public class U6ej1{

    public static double multiplica(double a, double b){
        double uno = a*b;
        return uno;

    } 



    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);

        //hay que declarar la varieble de la funcion
        double a, b, uno;
        System.out.println("introduce dos numeros enteros.");
        System.out.print("introduce el primer numero: ");
        a = sc.nextDouble();
        System.out.print("introduce el segundo numero: ");
        b = sc.nextDouble();

        // para llamar a la funcion 
        uno = multiplica(a, b);
        System.out.println( "el resultado es:" + uno);

sc.close();
    }
    

}
