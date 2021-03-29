package br.com.dominio;

/*
 * Demonstrando o funcionamento do padrão de projecto Singleton: ele resolve o seguinte problema: não permite que haja duas ou mais instancias de uma determinada Class soltas no projecto
 * 
 * Exemplo: uma conexão com banco de dados. É aconselhável te apenas uma conexão com BD em toda nossa aplicação. O Sigleton surge para tornar isso possível.
 * 
 * Vamos demosntrar neste exemplo o funcionamento de um Singleton usando um gerenciador de impressão
 * */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Já não é possível instanciar o GerenciadorImpressão do jeito padrão (usando new GerenciadorImpressão())
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
