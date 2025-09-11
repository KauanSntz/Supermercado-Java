package SuperMercado;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Cliente {
	String nome;
	List<Produto> carrinho;
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public Cliente(String nome) {
		this.nome = nome;
		this.carrinho = new ArrayList<>();
	}
	
	public void addAoCarrinho(Produto p, int qtd) {
		carrinho.add(p);
		System.out.println("\nProduto: | "+p.getNome()+
				" | adicionado ao carrinho.");
	}
	
	public void removerDoCarrinho(Produto p) {
		if(carrinho.contains(p)) {
			carrinho.remove(p);
			System.out.println("\nProduto: | "+p.getNome()+
				" | removido do carrinho.");
		}else {
			System.out.println("\nEsse produto não está no carrinho.");
		}
	}
	
	public void listarCarrinho() {
		System.out.println("Seu carrinho: ");
		for(Produto p: carrinho)
			System.out.println("Produto: | "+ p.getNome()+" | Preço: | "
		+p.getPreco()+" | Quantidade: | "); //ARRUMAR ISSO AQUI
	}
	
	public void finalizarCompra() {
		double total = 0;
		for(Produto p: carrinho)
			total = p.getPreco() * p.getPreco();
		carrinho.clear();
		System.out.println("\nCompra finalizada!");
		System.out.println("Valor total da compra: R$"+ df.format(total));
	}
	public String getNome() {
		return this.nome;
	}
}
