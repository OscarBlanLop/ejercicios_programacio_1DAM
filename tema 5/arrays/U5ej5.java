import java.util.Scanner;
public class U5ej5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
//variables del ejercicio
        int n, m;
        System.out.print("cantidad de n: ");
        n=entrada.nextInt();
        System.out.print("cantidad de m: ");
        m=entrada.nextInt();

        int array[] = new int [n];

        for(int i=0;i<array.length; i++)
            {
                array[i] = m;
                System.out.println(array[i]);
            }
            entrada.close();
    }
}