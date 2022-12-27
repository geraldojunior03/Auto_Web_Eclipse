package pages;

import core.DSL;

public class FiltrosPages {

	DSL dsl = new DSL();

	public void entrarPagina(String string) {
		dsl.abrirUrl("https://www.natura.com.br/"+ string);
		dsl.clicarPorId("onetrust-accept-btn-handler");
	}

	public void abrirMostrar() {
		dsl.esperarElementoPorXpath("(//div[@aria-haspopup='listbox'])[1]", 3);
		dsl.clicarPorXpath("(//div[@aria-haspopup='listbox'])[1]");
	}

	public void selecionarLista(String string) {
		dsl.esperarElementoClicavelPorXpath("//li[contains(text(),'" + string + "')]", 10);
		dsl.clicarPorXpath("//li[contains(text(),'" + string + "')]");
	}

	public int contarElementos() {
		return dsl.qtdeElementosRetornadosXpath("//h5");
	}

	public void abrirOrdenar() {
		dsl.clicarPorXpath("(//div[@aria-haspopup='listbox'])[2]");
	}

	public String obterProduto(int i){
		String pos = Integer.toString(i);
		return dsl.obterTextoPorXpath("(//h5)["+ pos +"]");
	}

	public String obterPreco(int i) {
		String pos = Integer.toString(i);
		return dsl.obterTextoPorXpath("(//div[@data-testid='card'])["+ pos +"]");
	}

	public String obterDesconto(int i) {
		String pos = Integer.toString(i);
		return dsl.obterTextoPorXpath("(//span[contains(text(),'%')])["+ pos +"]");
	}

	public void clicarMaisProdutos() {
		dsl.clicarPorXpath("//span[contains(text(),'Carregar mais resultados')]");
	}

	public boolean checarBotaoCarregar() {
		try {
			dsl.verificarSeElementoEstaPresenteXpath("//span[contains(text(),'Carregar mais resultados')]");
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public void subirTela() {
		dsl.pressionaTeclaHOME();
		dsl.scrollToElementByXpath("//div[@options='12,24,36,48']");
	}

	public void descerTela() {
		dsl.pressionaTeclaPAGE_DOWN();
		
	}
	
}
