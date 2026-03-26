package exercicio1;
import java.util.ArrayList;
import java.util.Scanner;

public class NotaAluno {
	
	public String nome;// 2
	public float n1;
	public float n2;
	
	Scanner scanner = new Scanner(System.in);
	Calculadora calc = new Calculadora();
	ArrayList<NotaAluno> alunos = new ArrayList<>();   // Array list para quardar as notas e nomes dos alunos
							// 1
	public NotaAluno(String nome, float n1, float n2) {
		this.nome = nome; // this aponta para este nome 2. enquanto o nome aponta para esse 1
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public float calcMedia() {
		return calc.soma(n1, n2) / 2;
	}
	
	public String verificarMedia() {
		if(calcMedia() >= 6) {
			return "aprovado";
		}else {
			return "reprovado";
		}
	}
	
	public void mostraAlunos() {
		System.out.println("Aluno: " + nome);
        System.out.println("Média: " + calcMedia());
        System.out.println("Situação: " + verificarMedia());
        System.out.println("----------------------");
	}
	
	public void registraAlunos() {
		int ind = 1;
		
		while(ind == 1) {
			System.out.println("Digite o nome do aluno:");
			nome = scanner.nextLine();
		
			System.out.println("Digite a nota 1 do aluno:");
			n1 = scanner.nextFloat();
		
			System.out.println("Digite a nota 2 do aluno:");
			n2 = scanner.nextFloat();
		
			NotaAluno aluno = new NotaAluno(nome, n1, n2);
			
			alunos.add(aluno);
			
			System.out.println("Adicionar outro aluno? (1 = sim / 0 = não)");
            ind = scanner.nextInt();
            scanner.nextLine();
            
		}
	}
	
	public void mostraRegistros() {
									// forEach
		for (NotaAluno a : alunos) {// variavel nota aluno, a = indice, alunos a lista que via ser percorida
		    a.mostraAlunos();
		}
	}
	
	//Main para teste
	public static void main(String[] args) {

		NotaAluno sistema = new NotaAluno("",0,0);

		sistema.registraAlunos();
		sistema.mostraRegistros();
	}

}

