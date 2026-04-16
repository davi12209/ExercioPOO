package projetoPratico1;

import java.util.Objects;

public class Cliente {
	
	private String nome;
	private String cpfCnpj;
	private String email;
	private Endereco endereco;
	
	public Cliente(String nome, String cpfCnpj, String email, Endereco endereco) {
		
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.endereco = endereco;
		
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfCnpj, email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpfCnpj, other.cpfCnpj) && Objects.equals(email, other.email);
	}
	
	
}
