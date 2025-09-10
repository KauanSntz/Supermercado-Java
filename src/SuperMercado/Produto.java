package SuperMercado;

public class Produto {
	String nome;
	double preco;
	int qtEstoque;
	
	public Produto(String nome, double preco, int qtEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtEstoque = qtEstoque;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getQtEstoque() {
		return this.qtEstoque;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void exibirInfo(){
		System.out.println("\nProduto: "+getNome());
		System.out.println("Preco: "+getPreco());
		System.out.println("Unidades: "+getQtEstoque());
	}
	
	public void reporEstoque(int quantidade) {
		if(quantidade > 0) {
			this.qtEstoque += quantidade;
			System.out.println("\nForam adicionados "+
					quantidade+" unidades de "+getNome()+" ao estoque ");
		}else {
			System.out.println("\nA quantidade informada é inválida!");
			System.out.println(" -- Informações --");
			exibirInfo();
		}
	}
	
	public boolean vender(int quantidade) {
		if(getQtEstoque() >= quantidade && quantidade > 0) {
			this.qtEstoque -= quantidade;
			System.out.println("\nVenda concluída!");
			System.out.println("Foram vendidas "+quantidade+
					" unidades de "+getNome());
			return true;
		}else {
			System.out.println("\nA quantidade informada é inválida!");
			System.out.println(" -- Informações --");
			exibirInfo();
			return false;
		}
	}
}
