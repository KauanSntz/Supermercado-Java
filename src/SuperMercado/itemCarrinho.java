package SuperMercado;

public class itemCarrinho {
	Produto produto;
	int quantidade;
	
	public itemCarrinho(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public double getSubTotal() {
		return produto.getPreco() * quantidade;
	}
	
	//public void decrementarQuantidade(int qtd) {
	//	this.quantidade -= qtd;
	//}
	
	public void incrementarQuantidade(int qtd) {
		this.quantidade += qtd;
	}
}
