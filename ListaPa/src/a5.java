import java.util.Scanner;

public class a5 {

    public static void main(String[] args) {

        int[] A = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            System.out.println("\nNumero: " + A[i]);
            System.out.println("Divisores:");

            for (int x = 1; x <= A[i]; x++) {

                if (A[i] % x == 0) {
                    System.out.println(x);
                }
            }
        }

        scanner.close();
    }
}