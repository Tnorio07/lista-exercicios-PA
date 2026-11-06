import java.util.Scanner;

public class a4 {

    public static void main(String[] args) {

        int[] A = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            System.out.println("\nNumero: " + A[i]);
            System.out.println("Numeros pares de 0 ate " + A[i] + ":");

            for (int x = 0; x <= A[i]; x += 2) {
                System.out.println(x);
            }
        }

        scanner.close();
    }
}