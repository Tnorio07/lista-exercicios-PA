
import java.util.Scanner;

public class a11 {

    public static void main(String[] args) {

        int[] A = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }

        System.out.println("Qual numero deseja procurar?");
        int X = scanner.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < 10; i++) {

            if (A[i] == X) {
                encontrou = true;
                break;
            }

        }

        if (encontrou) {
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero não encontrado");
        }

        scanner.close();
    }
}
