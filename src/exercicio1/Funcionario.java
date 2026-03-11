package exercicio1;
import java.util.Scanner;
import java.util.ArrayList;

public class Funcionario {

    public String nome;
    public String departamento;
    public double salario;
    public String dataEntrada;
    public String rg;
    
    ArrayList<Funcionario> funcionarios = new ArrayList<>(); 
    Scanner scanner = new Scanner(System.in);
    
    public Funcionario(String nome,String departamento,double salario,String dataEntrada,String rg ) {
    	this.nome = nome;
    	this.departamento = departamento;
    	this.salario = salario;
    	this.dataEntrada = dataEntrada;
    	this.rg = rg;
    }
    

    // Método para receber aumento
    public void recebeAumento(double valor) {
        salario = salario + valor;
    }

    // Método para calcular ganho anual
    public double calculaGanhoAnual() {
        return salario * 12;
    }
    
    //Método para cadastrar os dados
    public void castraFuncionario() {
    	int ind = 1;
		
		while(ind == 1) {
			System.out.println("Digite o nome do funcionario:");
			nome = scanner.nextLine();
		
			System.out.println("Digite o departamento do funcionario:");
			departamento = scanner.nextLine();
		
			System.out.println("Digite o salario:");
			salario = scanner.nextDouble();
			
			scanner.nextLine(); // limpar buffer
			
			System.out.println("Digite a Data de Entrada:");
			dataEntrada = scanner.nextLine();
			
			System.out.println("Digite o rg do funcionario:");
			rg = scanner.nextLine();
		
			Funcionario funcionario = new Funcionario(nome, departamento, salario, dataEntrada, rg);
			
			funcionarios.add(funcionario);
			
			System.out.println("Adicionar outro funcionario? (1 = sim / 0 = não)");
            ind = scanner.nextInt();
            scanner.nextLine();
            
		}
    	
    }

    // Método para mostrar dados
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
    }
    
    public void mostraRegistros() {
    	
    	for (Funcionario a : funcionarios) {
		    a.mostrarDados();
		}
    }
    
    public static void main(String[] args) {

        Funcionario sistema = new Funcionario("", "", 0, "", "");

        sistema.castraFuncionario();
        sistema.mostraRegistros();
    }
}
