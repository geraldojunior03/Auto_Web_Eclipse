package pages;

import core.DSL;

public class BuscaPages {
	
	DSL dsl = new DSL();

	public void escreverNaBusca(String string) {
		dsl.escrevePorName("search", string);
	}
	
	public void confirmarBusca() throws Exception {
		dsl.botPressionarEnter();
	}

	public String tituloProduto() {
		return dsl.obterTextoPorXpath("//h5");
	}

	public void clicarBusca() {
		dsl.clicarPorName("search");
	}

	public void clicarTermo() {
		dsl.clicarPorXpath("//p[@class='MuiTypography-root MuiTypography-body2']");
		
	}

	public String textoErro() {
		return dsl.obterTextoPorXpath("//p[@class='MuiTypography-root MuiTypography-body2 MuiTypography-colorTextSecondary MuiTypography-alignCenter']");
	}

	public void acessarNatura() {
		dsl.abrirUrl("https://www.natura.com.br/");
	}

	public void voltarHomePage() {
		dsl.clicarPorXpath("//div[@aria-label='logo']");
	}

	public String tituloTermo(int i) {
		String num = Integer.toString(i);
		return dsl.obterTextoPorXpath("(//h5)[" + num + "]");
	}

	public void limparHistorico() {
		dsl.clicarPorXpath("//p[contains(text(),'Limpar')]");
		
	}

	public String obterHistorico() {
		return dsl.obterTextoPorXpath("//p[contains(text(),'Buscados recentemente')]");
	}

	public void clicarMaisResultados() {
		dsl.clicarPorXpath("//h6[contains(text(),'Ver mais')]");
		
	}

	public String obterBusca() {
		return dsl.obterTextoPorXpath("//h6[contains(text(),'Você buscou por')]");
	}

	public void clicarEssencialElixir() {
		dsl.clicarPorXpath("(//div[@class='MuiPaper-root MuiPaper-elevation2 MuiPaper-rounded'])[1]");
		
	}

	public String obterTituloProduto() {
		return dsl.obterTextoPorXpath("(//h1)[1]");
	}

	public void clicarSugestao() {
		dsl.clicarPorXpath("(//h6[@class='MuiTypography-root MuiTypography-subtitle2'])[2]");
	}

	public void aceitarCookies() {
		dsl.clicarPorId("onetrust-accept-btn-handler");
		
	}



	
}
