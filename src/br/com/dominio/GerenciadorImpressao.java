package br.com.dominio;

/*
 * Essa classe deve ter apenas uma instancia em todo o projecto.  Pois devemos ter apenas um respon�vel em gerenciar as impress�es dos documentos.
 * 
 * Ou seja, as instancias desta classe devem ocupar apenas um endere�o na mem�ria
 * */
public class GerenciadorImpressao {

	// Para que as instancias desta classe ocupem um unico endere�o na mem�ria,
	// precisamos:
	/*
	 * 1- criar uma vari�vel de class do tipo desta mesma class
	 * 
	 * 2- construtor privado: Para que n�o seja permitido instanciar essa class
	 * usando o jeito padr�o (pelo construtor): new GerenciadorImpressao()
	 * 
	 * 3 - criar um m�todo est�tico publico que retorna um gerenciador de impress�o
	 * para o sistema, e em seguida instanciar a vari�vel de class
	 * (gerenciadorImpressao)e depois verificar a commis�o usando if
	 * 
	 */
	private static GerenciadorImpressao gerenciadorImpressao;

	private GerenciadorImpressao() {

	}

	public static GerenciadorImpressao getInstance() {
		if (gerenciadorImpressao == null) {
			gerenciadorImpressao = new GerenciadorImpressao();
		}
		return gerenciadorImpressao;
	}
}
