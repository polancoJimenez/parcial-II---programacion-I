import java.util.Random;
import java.util.Scanner;

public class LaberintoUniversitario {

    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);



        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        // Instrucciones del reto
        System.out.println("""
        ¡Bienvenido al Laberinto Universitario!
        Este sistema representa los pasillos secretos de tu facultad.
        Cada número indica un nivel de energía en ese punto.
        Tu misión es explorar este laberinto cumpliendo los siguientes desafíos:

        1. Contar cuántos números pares hay mayores a 4. ⚡
        2. Calcular el promedio de los números impares. 🎯
        3. Calcular la suma de los valores de cada fila. 🧮
        4. BONUS: Encuentra la posición del mayor número del laberinto. 👑
        """);

        // Aquí puedes invocar los métodos para cada uno de los puntos anteriores
        // Por ejemplo:
        // contarParesMayoresA4(laberinto);
        // promedioImpares(laberinto);
        // etc...
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                contNumPares(laberinto);
                break;
            case 3:
                sumaFilas(laberinto);
                break;
            default:
                throw new AssertionError();
        }

        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    //🔢 **Contar** cuántos números pares son **mayores a 4**.
    public static void contNumPares(int[][] matriz){
        int contNumPar = 0;
        for(int[] fila: matriz){
            for(int columna: fila){
                if(columna > 4){
                    if(columna % 2 == 0){
                        contNumPar++;
                    }
                }
            }
        }
        System.out.println("cantidad de numeros pares mayor a 4 son => " + contNumPar);
    }

    public static void sumaFilas(int[][] matriz){
        for(int[] fila:matriz){
            int suma = 0;
            int contador = 1;
            for(int columna:fila){
                suma += columna;

            }
            System.out.println("La suma de la fila " + contador + " es: " + suma);
            if(contador <= 5){
                contador++;
            }
        }
    }

    // Aquí puedes agregar los métodos necesarios para resolver el laberinto
    // Ejemplo:
    // public static void contarParesMayoresA4(int[][] matriz) { ... }


}
