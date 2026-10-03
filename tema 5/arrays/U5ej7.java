import java.util.Scanner;
public class U5ej7 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double r;

        System.out.print("valor de r: ");
        r = entrada.nextDouble();

        double array[] = new double[100];
        for (int i = 0; i<array.length; i++)
            {
                array[i] = Math.random();
               
                if (r<= array[i]) 
                    {
                        System.out.println(array[i]);
                    }
            }
    }    
}