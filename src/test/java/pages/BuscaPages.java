package pages;

import core.DSL;

public class BuscaPages {
	
	DSL dsl = new DSL();

	public void escreverNaBusca(String string) throws Exception {
		dsl.escrevePorName("search", string);
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

	
}
