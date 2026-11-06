
import java.util.Scanner;

public class a12 {

    public static void main(String[] args) {

        int[] fila = new int[10];

        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        int proximaSenha = 1;
        int opcao;

        do {

            System.out.println("\n--- FILA DA MERENDA ---");
            System.out.println("1 - Entrar na fila");
            System.out.println("2 - Chamar proxima senha");
            System.out.println("3 - Mostrar fila");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opcao:");
            opcao = scanner.nextInt();

            if (opcao == 1) {

                if (quantidade < 10) {

                    fila[quantidade] = proximaSenha;

                    System.out.println("Sua senha e: " + proximaSenha);

                    proximaSenha++;
                    quantidade++;

                } else {
                    System.out.println("Fila cheia!");
                }

            } else if (opcao == 2) {

                if (quantidade > 0) {

                    System.out.println("Senha atendida: " + fila[0]);

                    for (int i = 0; i < quantidade - 1; i++) {
                        fila[i] = fila[i + 1];
                    }

                    quantidade--;

                } else {
                    System.out.println("Fila vazia!");
                }

            } else if (opcao == 3) {

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Posicao " + i + ": " + fila[i]);
                }

            }

        } while (opcao != 0);

        scanner.close();
    }
}
