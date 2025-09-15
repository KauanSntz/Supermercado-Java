package SuperMercado;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<itemCarrinho> carrinho;
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public Cliente(String nome) {
		this.nome = nome;
		this.carrinho = new ArrayList<>();
	}
	
	public void addAoCarrinho(Produto p, int qtd) {
		boolean encontrado = false;
		//verifica se o produto está no carrinho
		for(itemCarrinho item: carrinho) {
			if(item.getProduto().getNome().equalsIgnoreCase(p.getNome())) {
				item.incrementarQuantidade(qtd);
				encontrado = true;
				break;
			}
		}
		if(!encontrado){
			carrinho.add(new itemCarrinho(p, qtd));
			System.out.println("\n- "+qtd+" unidades de "+p.getNome()+
					" adicionada(s) ao carrinho.");
		}
	}
	
	public void removerDoCarrinho(Produto p) {
	    boolean removido = carrinho.removeIf(item -> 
	        p.getNome().equalsIgnoreCase(item.getProduto().getNome()));

	    if (removido) {
	        System.out.println("| Produto " + p.getNome() +
	        		" | removido do carrinho.");
	    } else {
	        System.out.println("| Produto " + p.getNome() +
	        		" | não encontrado no carrinho.");
	    }
	}

	
	public void listarCarrinho() {
		System.out.println("\n- Itens do Carrinho");
		for (itemCarrinho item : carrinho) {
            System.out.println("| " + item.getProduto().getNome() +
            		"  R$ " + item.getProduto().getPreco() +
            		" | Quantidade: " + item.getQuantidade());
        }
	}
	
	public void finalizarCompra() {
		double total = 0;
		for(itemCarrinho item: carrinho) {
			total += item.getSubTotal();
			item.getProduto().vender(item.getQuantidade());
			}
		carrinho.clear();
		System.out.println("\n- Compra finalizada!");
		System.out.println("- Valor total da compra: R$"+ df.format(total));
	}
	public String getNome() {
		return this.nome;
	}
}
