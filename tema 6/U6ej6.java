import java.util.Scanner;
public class U6ej6 {
    public static int numeroMayor(int a, int b){
        int mayor;
        if (a>b){
            mayor=a;
        }
        else{
            mayor=b;
        }

        return mayor;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int a,b,c;

        System.out.println("introduce 1: ");
        a=sc.nextInt();

        System.out.println("introduce 2: ");
        b=sc.nextInt();

        System.out.println("introduce 3: ");
        c=sc.nextInt();
    }
}
