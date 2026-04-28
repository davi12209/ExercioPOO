package projetoPratico1;

import java.util.ArrayList;
import java.util.Scanner;


public class ModuloEstoque {
	
	
	private Scanner teclado = new Scanner(System.in);
	private ArrayList<ItemEstoque> lista =
			new ArrayList<ItemEstoque>();
	private CadastroProduto cad;
	
	public ModuloEstoque(CadastroProduto cad) {
		this.cad = cad;
	}
	
	public void cadastrar() {
		System.out.println("CADASTRO DE ESTOQUE");
		System.out.println("digite o codigo do produto; ");
		int codigo = teclado.nextInt();
		Produto produto = cad.buscar(codigo);
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
	
	public void buscar() {
		 System.out.println("BUSCA NO ESTOQUE");
		    System.out.print("Digite o código do produto: ");
		    int codigo = teclado.nextInt();
		    
		    boolean achou = false;
		    
		    for(ItemEstoque item : lista) {
		    	if(item.getProduto().getCodigo() == codigo) {
		    		System.out.println("Produto encontrado!");
		            System.out.println("Nome: " + item.getProduto().getNome());
		            System.out.println("Quantidade: " + item.getQuantidade());
		            achou = true;
		            break;
		    	}
		    	if(achou == false) {
		    		System.out.println("Produto não encontrado no estoque.");
		    	}
		    }
		
	}
	
	public void atualizar() {
	    System.out.println("ATUALIZAÇÃO DE ESTOQUE");
	    System.out.print("Digite o código do produto: ");
	    int codigo = teclado.nextInt();

	    for (ItemEstoque item : lista) {
	        if (item.getProduto().getCodigo() == codigo) {

	            System.out.println("Produto: " + item.getProduto().getNome());
	            System.out.println("Quantidade atual: " + item.getQuantidade());

	            System.out.print("Digite a nova quantidade: ");
	            int novaQtd = teclado.nextInt();

	            item.setQuantidade(novaQtd);

	            System.out.println("Estoque atualizado com sucesso!");
	            return;
	        }
	    }

	    System.out.println("Produto não encontrado no estoque.");
	}
}

