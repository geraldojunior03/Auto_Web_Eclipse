package functions;

import org.junit.Assert;

import pages.CategoriasPages;

public class CategoriasFunctions {
	
	CategoriasPages cp = new CategoriasPages();

	public void entrarNatura() {
		cp.acessarSiteNatura();
		cp.aceitarCookies();
	}

	public void selecionarCategoria(String string) throws Exception {
		cp.clicarCategoria(string);
	}

	public void validarPagina(String string) {
		String url = cp.obterUrlPagina();
		Assert.assertTrue(url.contains(string));
	}

	public void clicarVerTodosOsProdutosRosto(String string) {
		cp.aceitarCookies();
		cp.mouseOverCategoria(string);
		cp.clicarTodosOsProdutos();
	}

	public void selecionarPagina(String categoria, String subcategoria) {
		cp.mouseOverCategoria(categoria);
		cp.clicarSubcategoria(subcategoria);
	}
	
	public void validarSubcategoria(String string) {
		String arvore = cp.obterArvoreCategorias();
		Assert.assertTrue(arvore.contains(string));
		
	}
	
	public void validarFaixaDePreco() {
		cp.clicarFiltroFaixa();
		String valor = cp.obterValor();
		Assert.assertTrue(valor.contains("49.9"));
	}

}
