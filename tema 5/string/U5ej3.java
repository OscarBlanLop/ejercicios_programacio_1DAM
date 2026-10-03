import java.util.Scanner;
public class U5ej3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String nombre, apell1, apell2;
        System.out.println("introduce tu nombre y tus apellidos.");

        System.out.print("nombre: ");
        nombre =sc.nextLine();
        System.out.print("primer apellido: ");
        apell1 =sc.nextLine();
        System.out.print("segundo apellido: ");
        apell2 =sc.nextLine();

        String usuario= nombre.substring(0,3)+apell1.substring(0,3)+apell2.substring(0,3);
        System.out.print(usuario.toUpperCase());
        System.out.print("\n");
        sc.close();
    }
}
