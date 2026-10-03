import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[4][5];  // 4 alumnos, 5 asignaturas

        // PASO 1: Pedir las notas al usuario
        for (int i = 0; i < 4; i++) {  // Recorrer alumnos
            System.out.println("Introduce las notas del Alumno " + (i + 1));
            for (int j = 0; j < 5; j++) {  // Recorrer asignaturas
                System.out.print("Asignatura " + (j + 1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println(); // Salto de línea para separar la entrada de los resultados

        // PASO 2: Calcular min, max y media por alumno
        for (int i = 0; i < 4; i++) {
            int min = matriz[i][0];   // Inicializamos min con la primera nota
            int max = matriz[i][0];   // Inicializamos max con la primera nota
            int suma = 0;

            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                suma += matriz[i][j];
            }

            double media = (double) suma / 5;  // Convertimos a double para no perder decimales

            System.out.println("Alumno " + (i + 1) + ": Min = " + min + ", Max = " + max + ", Media = " + media);
        }

        sc.close();
    }
}
