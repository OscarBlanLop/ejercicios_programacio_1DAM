import java.util.Scanner;
public class U5ej8 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int n;
        int array[]=new int[100];

        System.out.print("valor de n: ");
        n = entrada.nextInt();

        for(int i= 0; i< array.length;i++)
            {    //math.random genera un numero entre 0.0 y 0.9, se multiplica por 10 para hacer un numero de 0 a 9 y se le suma 1 para llegar a 1 a 10
                array[i] = 1+(int)(Math.random()*10);
                if (n == array [i])
                    {
                        System.out.println("el numero "+n+" se encuentra en la posicion del array "+ i+ "º es: "+ array[i]);   
                    }
            }entrada.close();
    }
}
