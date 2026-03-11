package projetoPratico;
import java.util.Scanner;
import java.util.ArrayList;

public class Produto {

	public int codigo;
	public String nome;
	public double preco;
	public int quantidade;
	ArrayList<Produto> produtos = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);
	
	public Produto(int codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
}
