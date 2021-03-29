package br.com.dominio;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.dominio.modelo.Cliente;
import br.com.dominio.modelo.Pedido;
import br.com.dominio.modelo.Produto;
import br.com.dominio.modelo.Vendedor;

/*
 * Demonstrando o funcionamento do padrão de projecto Builder: é um padrão que ajuda a gente a criar objectos complexos
 * 

 * */
public class Program {

	public static void main(String[] args) {

		/*
		 * Normalmente a gente construiria os objectos desta forma. Mas desta forma não é trivial
		 * 
		 * Imagina por exemplo que tivessemos que lidar com 20 produtos? teriamos que criar os 20 produtos um a um.
		 * 
		 * 
		 * */
		Cliente cliente = new Cliente();
		cliente.setCodigo(100);
		cliente.setNome("Carlos");
		cliente.setTelefone("9254-6733");
		
		Vendedor vendedor = new Vendedor();
		vendedor.setCodigo(1);
		vendedor.setNome("Joao");
		
		Produto produto1 = new Produto();
		produto1.setQuantidade(1);
		produto1.setNome("caderno");
		produto1.setValor(new BigDecimal(10.00));
		
		Produto produto2 = new Produto();
		produto2.setQuantidade(2);
		produto2.setNome("caneta");
		produto2.setValor(new BigDecimal(1.50));
		
		Pedido pedido = new Pedido();
		pedido.setNumeroPedido("00001");
		pedido.setCliente(cliente);
		pedido.setVendedor(vendedor);
		pedido.setProdutos(new ArrayList<>());
		pedido.getProdutos().add(produto1);
		pedido.getProdutos().add(produto2);
		
		pedido.informacoes();
		
		/*
		 * Para melhorar essa forma de construir os objectos, vamos recorrer ao padrão de projecto "Builder"
		 * 
		 * Para isso vamos criar o pacote builder que conterá a class PedidoBuilder. Nela conterá os métodos que representam as instancias de cada class que compoem pacote "modelo",
		 *  ou seja, cada relacionamento que o Pedido tiver com uma class, será representado como um método no PedidoBuilder ( Exemplo: setCliente(parametros); setProdutos(parametros) etc )
		 * 
		 * Apos isso vamos construir um novo método principal que mostrará como trabalhar com o Builder. 
		 * */
	}

}
