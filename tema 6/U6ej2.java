import java.util.Scanner;
public class U6ej2 {
    public static boolean esMayorEdad(int a){
        boolean mayor = false;
        if ( a>=18) { 
            mayor =true;
        }
        return mayor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a;
        boolean mayor;


        System.out.print("introduce tu edad: ");
        a=sc.nextInt();


        if (esMayorEdad(a)){
            System.out.println("eres mayor de edad.");
        }
        else{
            System.out.println("no eres mayor de edad.");
        }
        sc.close();
    }
}
