package SuperMercado;

public class Principal {
	public static void main(String[] args) {
		Produto produto1;
		produto1 = new Produto("Palha", 4.00, 100);
		
		produto1.exibirInfo();
		
		produto1.vender(10);
		
		produto1.exibirInfo();
		produto1.reporEstoque(5);
		
		produto1.exibirInfo();
	}
}
