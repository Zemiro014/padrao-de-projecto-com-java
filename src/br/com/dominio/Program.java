package br.com.dominio;

import javax.swing.JOptionPane;

import br.com.dominio.mensagem.Mensagem;
import br.com.dominio.mensagem.MensagemEmail;
import br.com.dominio.mensagem.MensagemFactory;

/*
 * Demonstrando o funcionamento do padrão de projecto Factory Method: ele lida com problemas de crião de objectos
 * 
 * Usamos ele quando queremos criar um objecto sem especificar qual class será utilizada na criação deste objecto.
 * 
 * Para isto cria-se uma "Interface" ou uma class "Obstract" responsável em criar objectos. Mas quem delega a forma como esses objectos serão criados serão as "sub classes" desta mesma "Interface" ou class Obstract
 * 
 * Vamos demonstrar o funcionamento deste padrão através de um sistema de envio de mensagem (Email ou por SMS)
 * 
 * Este padrão possui um poder de desacoplamento muito forte
 * */
public class Program {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog(null);
		
		Mensagem mensagem = new MensagemEmail();
		
		mensagem.enviar(texto);
		
		/*
		 *  Percebe-se que o nosso programa envia mensagem tanto por SMS quanto por Email.
		 *  Mas para funcionar, a gente precisa constantemente entrar na class Program.java, ir até á linha 25 realizar a troca manual de "new MensagemEmail" pelo "new MensagemSMS"
		 *  
		 *  Não é muito elegante. Ainda mais se o nosso codigo for gigante. Teriamos que catar linha por linha e achar aonde devemos realizar a troca.
		 *  
		 *  A solução para isso é usar o padrão "Factory Method". Para isso vamos criar uma class chamada "MensagemFactory" que é uma fábrica de objectos do tipo"Mensagem"
		 * */
		
		// Apos criar o MensagemFactory, basta chamar ele deste jeito:
		Mensagem mensagem2 = MensagemFactory.getMensagem(2);
		mensagem2.enviar(texto);
	}

}
