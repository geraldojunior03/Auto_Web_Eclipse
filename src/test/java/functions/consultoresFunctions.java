package functions;

import pages.consultoresPages;

public class consultoresFunctions {

	consultoresPages cp = new consultoresPages();
	
	// STRINGS
	
	String Consultor = "Lenice Neves de Oliveira";
	String CEP = "06622-350";
	
	// BUSCAR POR NOME
	
	public void abrirUrl() {
		cp.abrirUrl("https://www.natura.com.br/");
	}
	
	public void mouseOverNatura() {
		cp.mouseOverNatura();
	}
	
	public void clicarConsultor() {
		cp.clicarConsultor();
	}
	
	public void validarPagina() {
		cp.validarPagina();
	}
	
	public void escreverConsultor() {
		cp.escreverConsultor(Consultor);
	}
	
	public void clicarPesquisar() {
		cp.clicarPesquisar();
	}
	
	public void validarConsultor() {
		cp.validarConsultor(Consultor);
	}
	
	// BUSCAR POR CEP
	
	public void escreverCEP() {
		cp.escreverCEP(CEP);
	}
}
