import java.util.Scanner;

public class GeneradorDeSismos {

    public static void main(String[] args) {

        int N;
        double[][] matriz;
        double valorMaximo;

        N = Entrada();
        matriz = Matriz(N);
        valorMaximo = IndiceDeLaMatriz(matriz, N);

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
    public static double IndiceDeLaMatriz(double[][] matriz, int N){

           double valorMaximo = matriz[0][0];
            for (int i = 0; i < N; i++){
                for (int j = 0; j < 24; j++){
                    if (valorMaximo < matriz[i][j]){
                        valorMaximo = matriz[i][j];
                    }
                }
                System.out.println(valorMaximo);
                }
            return valorMaximo;
    }
}








