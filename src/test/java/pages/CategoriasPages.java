package pages;

import core.DSL;

public class CategoriasPages {

	DSL dsl = new DSL();
	
	public void acessarSiteNatura() {
		dsl.abrirUrl("https://www.natura.com.br/");
	}

	public void clicarCategoria(String string) throws Exception {
		System.out.print(string);
		dsl.clicarPorXpath("//p[contains(text(),'" + string + "')]");
		Thread.sleep(5000);
	}

	public String obterUrlPagina() {
		System.out.print(dsl.obterUrl());
		return dsl.obterUrl();
	}

	public void mouseOverCategoria(String string) {
		dsl.mouseOver("//p[contains(text(),'" + string + "')]");
	}

	public void clicarTodosOsProdutos() {
		dsl.clicarPorXpath("//p[contains(text(),'Ver todos os produtos')]");
	}

	public void aceitarCookies() {
		dsl.clicarPorId("onetrust-accept-btn-handler");
	}

	public String obterArvoreCategorias() {
		System.out.print(dsl.obterTextoPorXpath("//ol"));
		return dsl.obterTextoPorXpath("//ol");
	}

	public void clicarSubcategoria(String sub) {
		dsl.clicarPorXpath("//a[contains(text(),'"+ sub +"')]");
	}

	public void clicarFiltroFaixa() {
		dsl.clicarPorId("productPriceRange-header");
	}

	public String obterValor() {
		System.out.print(dsl.obterAtributoElementoPorXpath("//input[@name='until']","placeholder"));
		return dsl.obterAtributoElementoPorXpath("//input[@name='until']","placeholder");
	}
}
