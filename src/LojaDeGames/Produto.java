package LojaDeGames;

public class Produto {

	private String nome;
	private String plataforma;
	private String midia;
	private double preco;
	private int estoque;
	private int id;
	
	public Produto() {}

	public Produto(String nome, String plataforma, String midia, double preco, int estoque, int id) {
		this.nome = nome;
		this.plataforma = plataforma;
		this.midia = midia;
		this.preco = preco;
		this.estoque = estoque;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("Plataforma: " + this.plataforma);
		System.out.println("Mídia: " + this.midia);
		System.out.println("Preço: R$ " + this.preco);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("ID: " + this.id);
	}
}
