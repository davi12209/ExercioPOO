package projetoPratico1;

import java.util.Scanner;

public class ModuloProduto {
	
	Scanner scanner = new Scanner(System.in);
	
	private CadastroProduto cadastro;
	
	private int opcao;
	
	public ModuloProduto(CadastroProduto cadastro) {
		this.cadastro = cadastro;
	}
	
	public void ModuloProdMenu() {
		
		do {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");
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
                	cadastro.buscar();
                	break;
                	
                case 4:
                	System.out.println("Digite o codigo do produto");
                    cadastro.remover(scanner.nextInt());
                    break;
                    
                case 5:
                	System.out.println("Saindo do modulo");

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);
		
	}

}