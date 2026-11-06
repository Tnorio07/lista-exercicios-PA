import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {

        int[] A = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero:");
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {

            for (int x = 1; x <= 10; x++) {
                System.out.println(A[i] + " x " + x + " = " + (A[i] * x));
            }
        }

        scanner.close();
    }
}