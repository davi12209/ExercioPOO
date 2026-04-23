package projetoPratico1;

import java.util.ArrayList;
import java.util.Scanner;

import projetoPratico1.ItemEstoque;
import projetoPratico1.Produto;

public class ModuloEstoque {
	private CadastroProduto cadProduto =
			new CadastroProduto();
	private Scanner teclado = new Scanner(System.in);
	private ArrayList<ItemEstoque> lista =
			new ArrayList<ItemEstoque>();
	
	public ModuloEstoque(CadastroProduto cadProduto) {
		this.cadProduto = cadProduto;
	}
	
	public void cadastrar() {
		System.out.println("CADASTRO DE ESTOQUE");
		System.out.println("digite o codigo do produto; ");
		int codigo = teclado.nextInt();
		Produto produto = cadProduto.buscar(codigo);
		if(produto == null) {
			System.out.println("produto não encontrado");
			return;
		}
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Digite a quant. de itens para este produto:");
		int quant = teclado.nextInt();
		
		ItemEstoque item = new ItemEstoque();
		item.setProduto(produto);
		item.setQuantidade(quant);
		
		lista.add(item);
		System.out.println("Cadastrado item no estoque");
		
	}
	
	public void relatorio() {
		for(ItemEstoque item : lista) {
			System.out.println("Produto: " + item.getProduto().getNome());
			System.out.println("Quantidade:" + item.getQuantidade());
			System.out.println("------------------");
		}
	}
	
	
	
	
}

