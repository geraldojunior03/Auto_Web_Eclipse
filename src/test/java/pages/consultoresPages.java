package pages;

import core.DSL;

public class consultoresPages {

	DSL dsl = new DSL();
	
	// BUSCAR POR NOME
	
	public void abrirUrl(String url) {
		dsl.abrirUrl(url);
	}
	
	public void mouseOverNatura() {
		dsl.mouseOver("//span[contains(text(), 'Encontre a Natura')]");
	}
	
	public void clicarConsultor() {
		dsl.clicarPorXpath("//span[contains(text(), 'Buscar consultora')]");
	}
	
	public void validarPagina() {
		dsl.verificarSeElementoEstaPresenteXpath("//h5[contains(text(), 'Buscar consultor(a)')]");
	}
	
	public void escreverConsultor(String nome) {
		dsl.escrevePorXpath("//input[@placeholder='Digite o nome ou CEP do seu consultor']", nome);
	}
	
	public void clicarPesquisar() {
		dsl.clicarPorXpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/form/div/div/div/div/button");
	}
	
	public void validarConsultor(String nome) {
		dsl.verificarSeElementoEstaPresenteXpath("//img[@class='MuiAvatar-img']");
	}
	
	// BUSCAR POR CEP
	
	public void escreverCEP(String CEP) {
		dsl.escrevePorXpath("//input[@placeholder='Digite o nome ou CEP do seu consultor']", CEP);
	}
}
