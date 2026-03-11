package projetoPratico;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CadastroProduto cadastro = new CadastroProduto();

        int opcao;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    cadastro.cadastrarProduto(scanner);
                    break;

                case 2:
                    cadastro.listarProdutos();
                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
