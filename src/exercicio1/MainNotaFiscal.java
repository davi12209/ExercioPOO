package exercicio1;

import java.util.Scanner;

public class MainNotaFiscal {

	public static void main(String[] args) {
		
		String nome;
		double valor;
		byte opcao;

		Scanner scanner = new Scanner(System.in);
		NotaFiscal nota = new NotaFiscal();
		

		for(double a : nota.precos) {
			
			System.out.println("Digite o nome: ");
			nome = scanner.next();
			System.out.println("Digite o preco: ");
			valor = scanner.nextDouble();
			nota.adicionarItem(nome, valor);
			
			System.out.println("Deseja parar Dgite 1");
			opcao = scanner.nextByte();
			if(opcao == 1) {
				break;
			}
		}
		
		nota.listarItens();

        System.out.println("Total: R$ " + nota.calcularTotal());
	}

}
