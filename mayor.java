public class mayor {
    public static void main(String[] args) {
        int[][] matriz = {{45, 66, 75}, {41, 99, 69}, {17, 28, 39}};
        int numeroMayor = matriz[0][0];

        String mayorPosicion = "0,0";
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] > numeroMayor) {
                    numeroMayor = matriz[x][y];
                    mayorPosicion = x + "," + y;
                    System.out.println("la posision: "+"("+ mayorPosicion +")"+ " y la intensidad fue " +numeroMayor);
                }
            }
        }
    }
}
