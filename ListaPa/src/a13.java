
import java.util.Scanner;

public class a13 {
    public static void main(String[] args) {

        int[] A = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }

        boolean palindromo = true;

        for (int i = 0; i < A.length / 2; i++) {

            if (A[i] != A[A.length - 1 - i]) {
                palindromo = false;
                break;
            }

        }

        if (palindromo) {
            System.out.println("O vetor e palindromo!");
        } else {
            System.out.println("O vetor nao e palindromo!");
        }

        scanner.close();
    }
}
