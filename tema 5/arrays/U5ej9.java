public class U5ej9 {
    public static void main(String[]args){
        int array []=new int[100];
        int array2[]=new int[100];
        // 1-100
        for(int i=0; i<array.length;i++)
            {
                array[i]=i+1;
                System.out.println("primer array la celda "+i+"contiene un: "+ array[i]);
            }
        // 100-1
        for (int i=0; i < array.length; i++) 
            {
                array2[i]=array[array.length-1-i];
                System.out.println("primer array "+"celda "+i+" contenido: "+(array2[i]));
            }
    }    
}
