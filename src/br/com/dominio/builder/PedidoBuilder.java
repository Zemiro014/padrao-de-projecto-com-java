package br.com.dominio.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.dominio.modelo.Cliente;
import br.com.dominio.modelo.Pedido;
import br.com.dominio.modelo.Produto;
import br.com.dominio.modelo.Vendedor;

public class PedidoBuilder {

	private Pedido instancia; // Criando uma instancia de pedido

	public PedidoBuilder() {
		this.instancia = new Pedido(); // Inicializamos a nossa instancia dentro do construtor padrão
	}

	
	// Em seguida criamos os métodos que compoem o nosso Pedido. Todos eles retornam o "PedidoBuilder"
	
	public PedidoBuilder setPedido(String numeroPedido) {
		instancia.setNumeroPedido(numeroPedido);
		return this; // retorna o PedidoBuilder
	}

	public PedidoBuilder setCliente(int codigo, String nome, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);

		instancia.setCliente(cliente);

		return this; // retorna o PedidoBuilder
	}

	public PedidoBuilder setVendedor(int codigo, String nome) {

		Vendedor vendedor = new Vendedor();
		vendedor.setCodigo(codigo);
		vendedor.setNome(nome);

		instancia.setVendedor(vendedor);

		return this; // retorna o PedidoBuilder
	}

	public PedidoBuilder setProduto(String nome, int quantidade, BigDecimal valor) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValor(valor);
		
		if(instancia.getProdutos() == null) {
			instancia.setProdutos(new ArrayList<>());
		}
		
		instancia.getProdutos().add(produto);
		
		return this; // retorna o PedidoBuilder
	}

	public Pedido builder() {
		return instancia;
	}
}
