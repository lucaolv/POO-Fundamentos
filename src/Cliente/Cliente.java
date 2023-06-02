package Cliente;

public class Cliente {

	private String nome;
	private String endereco;
	private int idade;
	private int telefone;
	private int rg;

	public Cliente() {
	}

	public Cliente(String nome, String endereco, int idade, int telefone, int rg) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getrg() {
		return rg;
	}

	public void setrg(int rg) {
		this.rg = rg;
	}

	public void visualizar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Idade: " + this.idade);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("RG: " + this.rg);
	}
}
