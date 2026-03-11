package projetoPratico;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProduto {

    public ArrayList<Produto> produtos = new ArrayList<>();

    // Método para verificar se o código já existe
    private boolean codigoExiste(int codigo) {
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarProduto(Scanner scanner) {

        int codigo;
        String nome;
        double preco;
        int quantidade;

        // Validação do código único
        while (true) {
            System.out.print("Digite o código do produto: ");
            codigo = scanner.nextInt();
            scanner.nextLine();

            if (codigoExiste(codigo)) {
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

        // Validação da quantidade
        while (true) {
            System.out.print("Digite a quantidade em estoque: ");
            quantidade = scanner.nextInt();

            if (quantidade < 0) {
                System.out.println("Erro: Quantidade não pode ser negativa.");
            } else {
                break;
            }
        }

        Produto produto = new Produto(codigo, nome, preco, quantidade);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto p : produtos) {
            System.out.println("--------------------");
            System.out.println("Código: " + p.codigo);
            System.out.println("Nome: " + p.nome);
            System.out.println("Preço: " + p.preco);
            System.out.println("Quantidade: " + p.quantidade);
        }
    }
}