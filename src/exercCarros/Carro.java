package exercCarros;

import java.util.ArrayList;
import java.util.Scanner;

import exercicio1.NotaAluno;

public class Carro {

	// Atributos
	public String marca;
	public String modelo;
	public int ano;
	public double preco;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Carro> carros = new ArrayList<>();
	
	public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
	
	public void mostraCarro() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Preço: " + preco);
		System.out.println("------------------------");
	}
	
	public void mostraRegistros() {
		
		for (Carro a :  carros) {
			a.mostraCarro();
		}
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
