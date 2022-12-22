package functions;

import org.junit.Assert;

import pages.BuscaPages;


public class BuscaFunctions {
	
	BuscaPages bp = new BuscaPages();

	public void escreverNaBusca(String string) throws Exception {
		bp.escreverNaBusca(string);
	}

	public void validarProduto(String string) {
		String produto = bp.tituloProduto();
		Assert.assertTrue(produto.equals(string));
	}

	public void validarPalavra(String string) {
		for(int i = 1; i < 3; i++) {
			String produto = bp.tituloTermo(i);
			Assert.assertTrue(produto.contains(string));
		}
	}

	public void clicarHistorico() {
		bp.clicarBusca();
		bp.clicarTermo();
	}

	public void validarHistorico() {
		String produto = bp.tituloProduto();
		Assert.assertTrue(produto.contains("Aero"));
	}

	public void validarErro() {
		String erro = bp.textoErro();
		Assert.assertTrue(erro.contains("Não foi possível encontrar"));
	}

	public void entrarNatura() {
		bp.acessarNatura();
	}

	public void voltarHomePage() {
		bp.voltarHomePage();
	}
	
}
