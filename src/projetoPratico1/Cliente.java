package projetoPratico1;

public class Cliente {
	
	private String nome;
	private String cpfCnpj;
	private String email;
	private String endereco;
	
	public Cliente(String nome, String cpfCnpj, String email, String endereco) {
		
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.endereco = endereco;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
