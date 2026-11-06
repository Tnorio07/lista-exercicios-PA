import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[20];
        int[] B = new int[20];
        
        System.out.println("Digite 20 elementos para o vetor A:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        
        int indiceB = 0;
        
        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[indiceB] = A[i];
                indiceB++;
            }
        }
        
        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[indiceB] = A[i];
                indiceB++;
            }
        }
        
        System.out.print("\nVetor A: ");
        exibirVetor(A);

        System.out.print("Vetor B (Pares no início, ímpares no restante): ");
        exibirVetor(B);
        
        scanner.close();
    }
    
    public static void exibirVetor(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + (i == vetor.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}