package SuperMercado;

import java.util.ArrayList;
import java.util.List;

public class Mercadao {
	String nome;
	List<Produto> listaProdutos;
	List<Cliente> listaClientes;
	List<String> listaVendas;
	
	public Mercadao(String nome) {
		this.nome = nome;
		listaProdutos = new ArrayList<>();
		listaClientes = new ArrayList<>();
		listaVendas = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void addCliente(Cliente cliente) {
		listaClientes.add(cliente);
		System.out.println("\nCliente | "+ cliente.getNome()+
				" | adicionado ao SuperMercado!");
	}
	
	public void removerCliente(Cliente cliente) {
		listaClientes.remove(cliente);
		System.out.println("\nCliente | "+ cliente.getNome()+
				" | removido do SuperMercado!");
	}
	
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nProduto | "+ produto.getNome()+
				" | adicionado ao SuperMercado!");
	}
	
	public void removerProduto(Produto produto) {
		listaProdutos.remove(produto);
		System.out.println("Produto | "+ produto.getNome()+
				" | removido do SuperMercado!");
	}
	
	public void registrarCompra(Cliente c, double valorTotal) {
		String registro = "Cliente: |"+c.getNome()
		+" | Valor da compra: "+ valorTotal;
		listaVendas.add(registro);
		System.out.println("\nVenda registrada com sucesso!");
	}
	
	public void listarVendas() {
		for(String venda : listaVendas)
			System.out.println(venda);
	}
	
	public void listarProdutos() {
		System.out.println("\nProdutos da lista: ");
		for(Produto p : listaProdutos)
			p.exibirInfo();
	}
}
