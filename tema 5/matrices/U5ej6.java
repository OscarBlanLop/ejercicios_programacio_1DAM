import java.util.Scanner;
public class U5ej6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i, j;
        System.out.print("introduce el valor de la matriz cuadrada: ");
        int n = sc.nextInt();
        int matriz[][]=new int[n][n];
        for( i=0; i<matriz.length;i++)
        {
            System.out.println();
            for( j= 0; j<matriz[i].length;j++)
            {
                matriz[i][n-1]=1;
                //fila de abajo
                matriz[n-1][j]=1;

                matriz[0][j]=1;
                matriz[i][0]=1;
        
                //diagolan principal
                if(i==j)
                {matriz[i][j]=-1;}
                //diagonal inversa
                if((i+j)==n-1)
                {matriz[i][j]=-1;}
                System.out.printf("%3d",matriz[i][j]);
                
            }
            sc.close();
        }
    }
    
}
