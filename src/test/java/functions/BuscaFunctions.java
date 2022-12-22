package functions;

import org.junit.Assert;

import pages.BuscaPages;


public class BuscaFunctions {
	
	BuscaPages bp = new BuscaPages();

	public void escreverNaBusca(String string) throws Exception {
		bp.escreverNaBusca(string);
		bp.confirmarBusca();
		Thread.sleep(2000);
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

	public void limparHistorico() {
		voltarHomePage();		bp.clicarBusca();
		bp.limparHistorico();
	}

	public void validarHistoricoLimpo() {
		try {
			String item = bp.obterHistorico();
			Assert.assertFalse(item.equals("Buscados recentemente"));
		}catch (Exception e) {
			System.out.print("Validado com Sucesso");
		}
	}

	public void buscarMaisResultados(String string) {		bp.escreverNaBusca(string);
		bp.clicarMaisResultados();
	}

	public void validarBuscaPerfume() {		String pag = bp.obterBusca();
		Assert.assertTrue(pag.contains("Perfume"));
	}

	public void buscarSecaoProdutos(String string) {		bp.escreverNaBusca(string);
		bp.clicarEssencialElixir();
	}

	public void validarPaginaEssencial() {		String pag = bp.obterTituloProduto();
		Assert.assertTrue(pag.contains("Elixir"));
	}

	public void buscarSugestao(String string) {		bp.escreverNaBusca(string);
		bp.clicarSugestao();
	}

	public void validarPaginaKaiak() {
		String pag = bp.obterTituloProduto();
		Assert.assertTrue(pag.contains("Kaiak"));
	}

	public void aceitarCookies() {
		bp.aceitarCookies();
		
	}
	
}
