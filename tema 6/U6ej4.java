import java.util.Scanner;
public class U6ej4 {
    public static int dimeSigno(int a){
        int signo;
        if(a==0){
            signo=0;
        }
        else if (a>0){
            signo=1;
        }
        else  {
            signo=-1;
        }
        return signo;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, signo;

        System.out.print("introduce un numero: ");
        a=sc.nextInt();

        signo= dimeSigno(a);
        System.out.println(signo);
    }
    
}
