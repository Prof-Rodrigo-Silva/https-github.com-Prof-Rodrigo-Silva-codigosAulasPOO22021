package classe.modelo;

public class Pessoa {
	
	public String nome;
	public int idade;
	public long celular;
	public String email;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, long celular, String email) {
		this.nome = nome;
		this.idade = idade;
		this.celular = celular;
		this.email = email;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
