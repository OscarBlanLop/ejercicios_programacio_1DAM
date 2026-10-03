public class U5ej1 {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        int contador = 1;

        // Rellenar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna] = contador;
                contador++;
            }
        }

        // Mostrar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                
                // Dar forma a la hora de imprimir
                System.out.printf("%3d ", matriz[fila][columna]);
            }
            System.out.println();
        }
    }
}
