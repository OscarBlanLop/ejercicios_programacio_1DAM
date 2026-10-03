import java.util.Scanner;
public class U5ej10 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String mostrarvalores="a", introducirvalor="b", salir="c";
        String eleccion;
        int V, P;
        int array[]=new int[10];

        for(int i=0;i<array.length;i++)
            {
                array[i]=1+(int)(Math.random()*10);
            }
        
        do 
            {
                System.out.println("== a. mostrar valores | b. introducir valores | c. salir ==");
                eleccion=entrada.next();
                if (eleccion.equals("a")) 
                    {
                        for(int i = 0; i<array.length;i++)
                            {System.out.println(""+array[i]);}
                    }
                else if(eleccion.equals("b"))
                    {
                        System.out.print("dame un valor que quieras añadir: ");
                        V =entrada.nextInt();
                        System.out.print("¿en qué posicion lo quieres poner? ");
                        P =entrada.nextInt();
                        array[P] =V;
                    }
            } 
        while (!eleccion.equals("c"));
        entrada.close();
    }
    
}
