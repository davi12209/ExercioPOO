package exercicio1;

public class NotaFiscal {

	public String[] nomes = new String[5];
    public double[] precos = new double[5];  //vetores para armazenar os nomes e precos
    public int quantidade = 0;

    public void adicionarItem(String nome, double preco) { //Método para adicionar itens

        if (quantidade < 5) {
            nomes[quantidade] = nome;
            precos[quantidade] = preco;
            quantidade++;
        } else {
            System.out.println("A nota já tem 5 itens");
        }
    }

    public void listarItens() { //Método para mostrar os itens

        for (int i = 0; i < quantidade; i++) {
            System.out.println(nomes[i] + " - R$ " + precos[i]);
        }
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < quantidade; i++) {
            total += precos[i];
        }

        return total;
    }
    
    public static void main(String[] args) {

        NotaFiscal nota = new NotaFiscal();

        nota.adicionarItem("Arroz", 20);
        nota.adicionarItem("Feijao", 10);
        nota.adicionarItem("Carne", 35);

        nota.listarItens();

        System.out.println("Total: R$ " + nota.calcularTotal());
    }
}