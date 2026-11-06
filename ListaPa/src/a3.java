import java.util.Scanner;

public class a3 {

    public static void main(String[] args) {

        int[] A = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            boolean primo = true;

            if (A[i] <= 1) {
                primo = false;
            } else {
                for (int x = 2; x < A[i]; x++) {
                    if (A[i] % x == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            System.out.println("Numero: " + A[i]);

            if (primo) {
                System.out.println("E primo");
            } else {
                System.out.println("Nao e primo");
            }
        }

        scanner.close();
    }
}