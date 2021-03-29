package br.com.dominio.mensagem;

import javax.swing.JOptionPane;

/*
 * Declarando a "sub class" da "Interface Mensagem" ela fornece uma implementa��o concreta do m�toso "enviar()" para enviar mensagem por SMS
 * */
public class MensagemSMS implements Mensagem {

	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null, "SMS: "+mensagem);
	}

}
