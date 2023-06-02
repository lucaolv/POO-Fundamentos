package funcionario;

public class Funcionario {

	private String nome;
	private String endereco;
	private String cargo;
	private int idade;
	private int telefone;
	private int id;

	public Funcionario() {}

	public Funcionario(String nome, String endereco, String cargo, int idade, int telefone, int id) {
		this.nome = nome;
		this.endereco = endereco;
		this.cargo = cargo;
		this.idade = idade;
		this.telefone = telefone;
		this.id = id;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void visualizar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Idade: " + this.idade);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("ID: " + this.id);
	}

}
