package entities;

public class Produto {

	public  String nome;
	public  double preco;
	public  int quantidade;
	
	public Produto() {
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco= preco;
		this.quantidade =quantidade;
	}
	
	public double totalValorStock() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	

	public String toString() {
		return "Nome Completo Produto: "+ nome + ", Preço: " + String.format("%.2f", preco) + ", Quantidade: " +quantidade+ ", totalValor:" +String.format("%.2f", totalValorStock());
	}
}
