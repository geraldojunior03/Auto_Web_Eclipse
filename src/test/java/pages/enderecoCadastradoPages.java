package pages;

import core.DSL;

public class enderecoCadastradoPages {

	DSL dsl = new DSL();
	
	public void abrirURL(String url) {
		dsl.abrirUrl(url);
	}
	
	public void loginConta() {
		dsl.clicarPorXpath("//h6[contains(text(), 'Minha conta')]");
	}
	
	public void escreverEmail(String email) {
		dsl.escrevePorXpath("//input[@id='login-field']", email);
	}
	
	public void escreverSenha(String senha) {
		dsl.escrevePorXpath("//input[@id='login-password']", senha);
	}
	
	public void confirmarLogin() {
		dsl.clicarPorXpath("//button[@data-testid='login-button']");
	}
	
	public void clicarUsuario() {
		dsl.clicarPorXpath("//span[contains(text(), 'Meus acessos')]");
	}
	
	public void entrarEndereco() {
		dsl.clicarPorXpath("//span[contains(text(), 'Endereços Cadastrados')]");
	}
	
	public void adicionarEndereco() {
		dsl.clicarPorXpath("//span[contains(text(), 'adicionar novo endereço')]");
	}
	
	public void escreverCEP(String CEP) {
		dsl.escrevePorName("postalCode", CEP);
	}
	
	public void escreverNumero(String Numero) {
		dsl.escrevePorName("houseNumber", Numero);
	}
	
	public void finalizarEndereco() {
		dsl.pressionaTeclaENTER();
	}
	
	public void validarEndereco() {
		dsl.verificarSeElementoEstaPresenteXpath("//div[contains(text(), 'Endereço armazenado com sucesso!')]");
	}
}
