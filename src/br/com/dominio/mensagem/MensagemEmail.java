package br.com.dominio.mensagem;

import javax.swing.JOptionPane;

/*
 * Declarando a "sub class" da "Interface Mensagem" ela fornece uma implementa��o concreta do m�toso "enviar()" para enviar mensagem por email
 * */
public class MensagemEmail implements Mensagem {

	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "Email: "+mensagem);
	}
}
