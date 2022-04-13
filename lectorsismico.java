import java.util.Scanner;

public class lectorsismico {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        int menu = ns.nextInt();
        switch (menu) {
            case 1:
                System.out.println("El número mayor de la matriz es ");
                break;
            case 2:
                System.out.println("sismos mayores e igual a  4");
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + menu);
        }


    }

}
