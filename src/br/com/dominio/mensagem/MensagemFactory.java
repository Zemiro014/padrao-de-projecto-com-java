package br.com.dominio.mensagem;

public class MensagemFactory {

	public static Mensagem getMensagem(int i) {
		if(i == 1) {
			return new MensagemSMS();
		}
		
		else if(i == 2) {
			return new MensagemEmail();
		}
		
		return new MensagemSMS();
	}
}
