import java.util.Scanner;
public class U5ej6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int p, q;
        System.out.print("introduce p: ");
        p=entrada.nextInt();
        System.out.print("introduce q: ");
        q=entrada.nextInt();
// asi ponemos cuantos huecos tiene el vector, siempre va a ser p<q
        int j = q-p;

        int array[] = new int[j];

        for (int i =0; i<array.length; i++)
            {
                array[i] = p+i;
                System.out.println(array[i]);
            }
        }    
}
