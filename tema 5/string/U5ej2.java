import java.util.Scanner;
public class U5ej2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.print("introduzca un texto: ");
        String texto1 = sc.nextLine();

        System.out.println("\n");

        System.out.print("introduzca otro texto mas: ");
        String texto2 = sc.nextLine();

        if(texto1.equalsIgnoreCase(texto2))
        {
            if(texto1.equals(texto2))
            {
                System.out.println("los textos son identicos.");
            }
            else
            {
                System.out.println("los textos son iguales pero hay letras en mayusculas y otras en minusculas.");
            }
        }
        else
        {
            System.out.println("los textos no so iguales.");
        }
        

        sc.close();
    }
}
