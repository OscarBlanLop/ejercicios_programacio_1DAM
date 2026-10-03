import java.util.Scanner;
public class U5chat1 {
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);

        int num;
        int vector[]= new int[10];
        for (int i=0; i<vector.length;i++)
        {
            System.out.print("introduce un numero: ");
            num = sc.nextInt();
            vector[i]=num;
        }
        for (int i=0; i<vector.length;i++)
        {
            System.out.println("la posicion: "+i+", contiene el numero: "+vector[i]);
        }
    }
    
}
