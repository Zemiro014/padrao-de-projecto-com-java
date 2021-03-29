package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.builder.PedidoBuilder;
import br.com.dominio.modelo.Pedido;

public class ProgramBuilder {

	public static void main(String[] args) {
		
		Pedido pedido = new PedidoBuilder()
							.setPedido("9999")
							.setCliente(100, "Luiz", "9342-9900")
							.setVendedor(2, "João")
							.setProduto("Caderno", 1, new BigDecimal(10.50))
							.setProduto("Lapis", 1, new BigDecimal(1.50))
							.setProduto("Borracha", 1, new BigDecimal(4.50))
							.setProduto("Régua", 1, new BigDecimal(5.50))
							.setProduto("Lapis de cor", 1, new BigDecimal(15.50))
							.setProduto("Calculadora", 1, new BigDecimal(100.50))
							.builder();
		
		pedido.informacoes();
	}
}
