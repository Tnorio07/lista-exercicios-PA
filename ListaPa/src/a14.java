import java.util.Scanner;

public class a14 {

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero para A:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        scanner.close();
    }
}
