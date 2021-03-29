package br.com.dominio;

/*
 * Demonstrando o funcionamento do padr�o de projecto Singleton: ele resolve o seguinte problema: n�o permite que haja duas ou mais instancias de uma determinada Class soltas no projecto
 * 
 * Exemplo: uma conex�o com banco de dados. � aconselh�vel te apenas uma conex�o com BD em toda nossa aplica��o. O Sigleton surge para tornar isso poss�vel.
 * 
 * Vamos demosntrar neste exemplo o funcionamento de um Singleton usando um gerenciador de impress�o
 * */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* J� n�o � poss�vel instanciar o GerenciadorImpress�o do jeito padr�o (usando new GerenciadorImpress�o())
		GerenciadorImpressao g1 = new GerenciadorImpressao();
		GerenciadorImpressao g2 = new GerenciadorImpressao();
		GerenciadorImpressao g3 = new GerenciadorImpressao();
		GerenciadorImpressao g4 = new GerenciadorImpressao();
		*/
		
		GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
		GerenciadorImpressao g4 = GerenciadorImpressao.getInstance();
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
	}

}
