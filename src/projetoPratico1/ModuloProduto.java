package projetoPratico1;

import java.util.Scanner;

public class ModuloProduto {
	
	Scanner scanner = new Scanner(System.in);
	CadastroProduto cadastro = new CadastroProduto();
	private CadastroProduto cadProduto =
			new CadastroProduto();
	
	private int opcao;
	
	public ModuloProduto(CadastroProduto cadProduto) {
		this.cadProduto = cadProduto;
	}
	
	public void ModuloProdMenu() {
		
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
		
	}

}