import java.util.Scanner;
public class U5ej4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int matriz[][]=new int[4][5];
        System.out.println("notas: ");
        for(int i=0; i<4;i++)
        {
            System.out.println("notas del alumno"+(i+1)+": ");
            for(int j=0;j<5;j++)
            {
                System.out.println("asignatura"+(j+1)+": ");
                matriz[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<4;i++)
        {
            int min=matriz[i][0];
            int max=matriz[i][0];
            int suma =0;
            for(int j=0; j<5;j++)
            {
                if(matriz[i][j]<min)
                {
                    min=matriz[i][j];
                }
                if (matriz[i][j]>max) 
                {
                    max=matriz[i][j];    
                }
                suma +=matriz[i][j];
            }
            int madia = suma/5;
            System.out.print("alumno"+(i+1)+": nota max: "+max+", nota min: "+min+", media: "+ madia);
        }
    }
}
