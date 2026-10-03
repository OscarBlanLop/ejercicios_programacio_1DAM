import java.util.Scanner;
public class U6ej5 {
    public static double precioConIVA(double precio){
        precio *=1.21;
        return precio;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        double vector[]=new double[5];
        System.out.println("introduce los 5 precios para aplicarles el iva: ");

        for(int i=0; i<vector.length;i++){
            System.out.print("introduce "+(i+1)+" producto: ");
            vector[i]=sc.nextInt();
        }
        for(int i=0; i<vector.length;i++){
            System.out.println(precioConIVA(vector[i]));
        }
    }

}