import java.util.Scanner;

public class a7 {

    public static void main(String[] args) {

        int[] A = new int[15];
        int[] B = new int[15];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 15; i++) {

            B[i] = 1;

            for (int x = 1; x <= A[i]; x++) {
                B[i] = B[i] * x;
            }

            System.out.println("A: " + A[i]);
            System.out.println("Fatorial: " + B[i]);
        }

        scanner.close();
    }
}