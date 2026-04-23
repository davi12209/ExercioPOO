package projetoPratico1;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroProduto {
	
	private int codigo;
	private String nome;
	private double preco;
	
	

    public ArrayList<Produto> produtos = new ArrayList<>();

    // Método para verificar se o código já existe
    public boolean codigoExiste(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarProduto(Scanner scanner) {


        // Validação do código único
        while (true) {
            System.out.print("Digite o código do produto: ");
            codigo = scanner.nextInt();
            scanner.nextLine();

            //if (codigoExiste(codigo)){
            Produto p = new Produto (codigo,"",0f);
            if(produtos.contains(p)){
                System.out.println("Erro: Já existe um produto com esse código.");
            } else {
                break;
            }
        }

        // Validação do nome
        while (true) {
            System.out.print("Digite o nome do produto: ");
            nome = scanner.nextLine();

            if (nome.isEmpty()) {
                System.out.println("Erro: Nome não pode ser vazio.");
            } else if (nome.length() < 3) {
                System.out.println("Erro: Nome deve ter no mínimo 3 caracteres.");
            } else if (nome.length() > 30) {
                System.out.println("Erro: Nome deve ter no máximo 30 caracteres.");
            } else {
                break;
            }
        }

        // Validação do preço
        while (true) {
            System.out.print("Digite o preço do produto: ");
            preco = scanner.nextDouble();

            if (preco < 1) {
                System.out.println("Erro: Preço não pode ser menor que 1.");
            } else if (preco > 10000) {
                System.out.println("Erro: Preço não pode ser maior que 10000.");
            } else {
                break;
            }
        }
        }
        //bucas produto
    	public void buscar() {
    		System.out.println("BUSCA DE PRODUTO");		
  
    		boolean achou = false;
    		for(Produto produto : produtos) {
    			if(codigo == produto.getCodigo()) {
    				System.out.println("Produto localizado...");
    				System.out.println("Nome: " + produto.getNome());
    				System.out.println("Codigo: " + produto.getCodigo());
    				System.out.println("Preço r$ : " + produto.getPreco());
    				achou = true;
    			}
    		}
    		if(achou == false) {
    			System.out.println("Produto não localizado");			
    		}

        Produto produto = new Produto(codigo, nome, preco);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }
    	
    	public Produto buscar(int codigo) {
    		
    		for(Produto produto : produtos) {
    			if(codigo == produto.getCodigo()) {
    				return produto;
    			}
    		}
    		return null;
    	}

    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto p : produtos) {
            System.out.println("--------------------");
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
        }
    }
    
    public void remover(Integer codigo) {
    	Produto p = new Produto(codigo, "", 0l);
    	
    	produtos.remove(p);
    }
}

