
import java.util.Scanner;

public class a10 {

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero para A:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero para B:");
            B[i] = scanner.nextInt();
        }

        int quantidade = 0;

        for (int i = 0; i < 10; i++) {

            boolean encontrou = false;

            for (int j = 0; j < 10; j++) {

                if (A[i] == B[j]) {
                    encontrou = true;
                    break;
                }

            }

            if (!encontrou) {
                C[quantidade] = A[i];
                quantidade++;
            }
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        scanner.close();
    }
}
