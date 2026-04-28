package projetoPratico1;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroCliente {

	private ArrayList<Cliente> clientes = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void cadastrarCliente() {
		
		//Validação nome
			
		System.out.println("Digite seu Nome: ");
		String nome = scanner.next();
			
		if(nome.isEmpty() || nome.length() < 3 || nome.length() > 50) {
			System.out.println("Nome invalido!");
			return;
		}
		
		
		// Validação cpf/cnpj
		
			
		System.out.println("Digite seu Cpf/Cnpj: ");
		String cpfCnpj = scanner.next();
			
		if(cpfCnpj.isEmpty() || cpfCnpj.length() < 8) {
			System.out.println("Cpf/Cnpj invalido!");
			return;
		}
		
		
		System.out.println("Digite seu email: ");
		String email = scanner.next();
		
		//Validação do endereço
		Endereco endereco = new Endereco();
		
		System.out.println("Digite seu bairro: ");
		endereco.setBairro(scanner.next());
		System.out.println("Digite sua rua");
		endereco.setRua(scanner.next());
		System.out.println("Digite seu numero");
		endereco.setNumero(scanner.nextInt());
		
			
		if(endereco.getRua().isEmpty() || endereco.getRua().length() > 30) {
			System.out.println("Endereco invalido!");
			return;
		}
		
		Cliente cliente = new Cliente(nome, cpfCnpj, email, endereco);
		System.out.println(cliente.getEndereco().getRua());
		
		clientes.add(cliente);
		
		System.out.println("cliente cadastrado com sucesso");
	}
	
	//Relatorio de cliente
	
	public void listaCliente() {
		if(clientes.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado");
			return;
		}
		
		for(Cliente cliente : clientes) {
			System.out.println("--------------------");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Cpf/Cnpj: " + cliente.getCpfCnpj());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Endereco: " + cliente.getEndereco());
		}
	}
	
	//buscar cliente
	
	public void buscaCliente() {
		
		System.out.println("Digite o Cpf/Cnpj: ");
		String cpfcnpj = scanner.next();
		boolean achou = false;
		
		for(Cliente cliente : clientes) {
			
			if(cliente.getCpfCnpj().equals(cpfcnpj)) {
				System.out.println("Cliente encontrado");
	            System.out.println("Nome: " + cliente.getNome());
	            System.out.println("Cpf/Cnpj: " + cliente.getCpfCnpj());
	            System.out.println("Email: " + cliente.getEmail());
	            System.out.println("Endereco: " + cliente.getEndereco());
	            achou = true;
			}
			if(achou == false) {
				System.out.println("Cliente não encontrado");
			}
		}
	}
	
	//remove cliente
	
	public void removeCliente() {
		
		System.out.println("Digite o Cpf/Cnpj: ");
		String cpfcnpj = scanner.next();
		
		boolean resultado = clientes.removeIf(obj -> obj.getCpfCnpj().equals(cpfcnpj));
		
		if(resultado) {
			System.out.println("cliente removido com sucesso");
		}else {
			System.out.println("Erro: cliente não localizado");
		}
	}
}
