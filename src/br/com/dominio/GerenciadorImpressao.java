package br.com.dominio;

/*
 * Essa classe deve ter apenas uma instancia em todo o projecto.  Pois devemos ter apenas um responável em gerenciar as impressões dos documentos.
 * 
 * Ou seja, as instancias desta classe devem ocupar apenas um endereço na memória
 * */
public class GerenciadorImpressao {

	// Para que as instancias desta classe ocupem um unico endereço na memória,
	// precisamos:
	/*
	 * 1- criar uma variável de class do tipo desta mesma class
	 * 
	 * 2- construtor privado: Para que não seja permitido instanciar essa class
	 * usando o jeito padrão (pelo construtor): new GerenciadorImpressao()
	 * 
	 * 3 - criar um método estático publico que retorna um gerenciador de impressão
	 * para o sistema, e em seguida instanciar a variável de class
	 * (gerenciadorImpressao)e depois verificar a commisão usando if
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
