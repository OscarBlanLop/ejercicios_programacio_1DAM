import java.util.Scanner;
public class U5ej3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("crear la matriz");
        int mayores=0, iguales=0, menores=0;
        System.out.print("introduce el valor de N: ");
        int N=entrada.nextInt();
        System.out.print("introduce el valor de M: ");
        int M=entrada.nextInt();
        int matriz[][]= new int[N][M];
        for(int i = 0; i<N;i++)
        {
            for(int j=0;j<M;j++)
            {System.out.println(i+" "+j);}

        }    
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                
            }
        }
        System.out.println(mayores+" "+iguales+" "+menores);
    }
}
