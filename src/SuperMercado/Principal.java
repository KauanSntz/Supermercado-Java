package SuperMercado;

public class Principal {
	public static void main(String[] args) {
		Produto palha;
		Produto trufa;
		Cliente mari;
		Mercadao atack;
		atack = new Mercadao("Atack");
		
		palha = new Produto("Palha", 4.00, 100);
		atack.addProduto(palha);
		
		trufa = new Produto("Trufa", 3.50, 20);
		atack.addProduto(trufa);
		
		mari = new Cliente("Mariana Banana");
		atack.addCliente(mari);
		
		mari.addAoCarrinho(palha, 10);
		mari.listarCarrinho();
		mari.addAoCarrinho(trufa, 10);
		mari.listarCarrinho();

		palha.exibirInfo();
		
		mari.finalizarCompra();
		
		atack.listarProdutos();
		atack.listarVendas();
	}
}
