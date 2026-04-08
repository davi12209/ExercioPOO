package projetoPratico1;

import java.util.Scanner;


public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		ModuloProduto modulo1 = new ModuloProduto();
		
		
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
				System.out.println("EM DESENVOLVIMENTO");
			} else if (op.equals("3")) {
				System.out.println("EM DESENVOLVIMENTO");
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

}
