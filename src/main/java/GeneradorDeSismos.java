import java.io.*;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class GeneradorDeSismos {

    public static void main(String[] args) {

        int N;
        double[][] matriz;

        N = Entrada();
        matriz = Matriz(N);

    }

    public static int Entrada() {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        if (N > 2 || N < 32) {

        }
        return N;
    }

    public static double[][] Matriz(int N) {

        double[][] matriz = new double[N][24];
        double max = 9.5;
        double min = 1.0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 24; j++) {
                matriz[i][j] = (double) (Math.random() * (max - min) + min);
                System.out.println(matriz[i][j]);
            }
        }
        return matriz;
        
    }
}








