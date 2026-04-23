package projetoPratico1;

import java.util.Scanner;


public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static CadastroProduto cad = new CadastroProduto();
	static ModuloProduto modulo1 = new ModuloProduto(cad);
	static ModuloCliente modulo2 = new ModuloCliente();
	static ModuloEstoque modulo3 = new ModuloEstoque(cad);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		do {
			
			System.out.println("selecione uma opcao");
			System.out.println("1: Modulo Produto");
			System.out.println("2: Modulo Cliente");
			System.out.println("3: Modulo Estoque");
			System.out.println("4: Modulo Vendas");
			System.out.println("5: Sair");
			
			String op = scanner.next();
			
			if (op.equals("1")) {
				modulo1.ModuloProdMenu();
				
			} else if (op.equals("2")) {
				modulo2.menuClientes();
				
			} else if (op.equals("3")) {
				moduloEstoque();
				
			} else if (op.equals("4")) {
				System.out.println("EM DESENVOLVIMENTO");
			} else if (op.equals("5")) {
				break;
			} else {
				System.out.println("opção invalida");
			}
			
		}while(true);
		
		 scanner.close();
	}
	
	private static void moduloEstoque() {
		while (true) {
			System.out.println("MODULO ESTOQUE");
			System.out.println("1. Cadastro estoque");
			System.out.println("2. Relatorio estoque");
			System.out.println("3. Busca no estoque ");
			System.out.println("4. Atualizacao no estoque");
			System.out.println("5. Voltar");
			String op = scanner.next();
			if (op.equals("1")) {
				modulo3.cadastrar();
			} else if (op.equals("2")) {
				modulo3.relatorio();
			} else if (op.equals("3")) {
				
			} else if (op.equals("4")) {
				
			} else if (op.equals("5")) {
				break;
			} else {
				System.out.println("opção invalida");
			}
		}
		
	}

}
