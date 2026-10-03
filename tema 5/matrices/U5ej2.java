public class U5ej2 {
    public static void main(String[]args){
        int matriz[][]=new int[10][10];
        int contador=0;
        //nos movemos por una fila de matriz cada iteracion
        for(int fila=0;fila<matriz.length;fila++)
        {   contador++; 
            //llenamos la fila de la iteracion del primer for
            for(int columna = 0; columna<matriz[fila].length; columna++)
            {    
                int variable=(columna+1)*contador;
                System.out.println(variable);
            }
        }
    }
    
}
