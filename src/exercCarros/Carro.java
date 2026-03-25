package exercCarros;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro {

	// Atributos
	String marca;
	String modelo;
	int ano;
	double preco;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Carro> carros = new ArrayList<>();
	
	public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
	
	public void mostraCarro() {
		String dados = "Marca: ";
		dados.concat(marca).concat("\n");
		dados.concat("Modelo: ").concat(modelo).concat("\n");
		dados.concat("Ano: ").concat(String.valueOf(ano)).concat("\n");
		dados.concat("Preço: ").concat(Double.toString(preco)).concat("\n");
		dados.concat("-----------------------").concat("\n");
	}
	
	public void registraCarro() {
		int ind = 1;
		
		while(ind == 1) {
			System.out.println("Digite a marca:");
			marca = scanner.next();
		
			System.out.println("Digite o modelo:");
			modelo = scanner.next();
		
			System.out.println("Digite o ano do carro:");
			ano = scanner.nextInt();
			
			scanner.nextLine(); // limpa o buffer
			
			System.out.println("Digite o preco:");
			preco = scanner.nextDouble();
		
			Carro carro = new Carro(marca, modelo, ano, preco);
			
			carros.add(carro);
			
			System.out.println("Adicionar outro carro? (1 = sim / 0 = não)");
            ind = scanner.nextInt();
            scanner.nextLine();
            
		}
	}
}
