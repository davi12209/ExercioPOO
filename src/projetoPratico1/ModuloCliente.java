package projetoPratico1;

import java.util.Scanner;

public class ModuloCliente {

	Scanner scanner = new Scanner(System.in);
	CadastroCliente cadastro = new CadastroCliente();
			
	
	public void menuClientes() {
		
		int op;
		
		do {
			System.out.println("==============");
			System.out.println("1: Cadastrar cliente");
			System.out.println("2: Listar Clientes");
			System.out.println("3: Buscar Clientes");
			System.out.println("4: Remover Clientes");
			System.out.println("5: Sair");
			
			op = scanner.nextInt();
			
			switch (op) {
			
			case 1:
				cadastro.cadastrarCliente();
				break;
				
			case 2:
				cadastro.listaCliente();
				break;
				
			case 3:
				cadastro.buscaCliente();
				break;
				
			case 4:
				cadastro.removeCliente();
				break;
				
			}
		}while(op != 5);
	}
}
