import java.util.Scanner;
public class U6ej3 {
    public static int minimo(int a, int b){
        int menor;
        if(a>=b){
            menor=b;
        }
        else{menor=a;}
        return menor;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a, b, menor;
        System.out.print("introduce un numero: ");
        a=sc.nextInt();
        System.out.print("introduce el segundo numero: "); 
        b=sc.nextInt();
        
        menor = minimo(a, b);
        System.out.println(menor);

        sc.close();
    }
    
}
