import java.util.Scanner;

public class a15 {

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
            System.out.println("Digite um numero para B");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            }

            else {
                C[i] = -1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}