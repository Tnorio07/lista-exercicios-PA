import java.util.Scanner;

public class a8 {

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            B[i] = 0;

            for (int j = 0; j <= i; j++) {
                B[i] = B[i] + A[j];
            }

            System.out.println("A: " + A[i]);
            System.out.println("B: " + B[i]);
        }

        scanner.close();
    }
}