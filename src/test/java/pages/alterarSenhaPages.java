package pages;

import core.DSL;

public class alterarSenhaPages {

	DSL dsl = new DSL();
	
	// DEFINIR NOVA SENHA VÁLIDA
	
	public void entrarSenha() {
		dsl.clicarPorXpath("//p[contains(text(), 'Alterar senha')]");
	}
	
	public void novaSenha(String novaSenha) {
		dsl.escrevePorId("updateNewPassword", novaSenha);
	}
	
	public void confirmarSenha(String novaSenha) {
		dsl.escrevePorId("updateConfirmPassword", novaSenha);
	}
	
	public void aceitarCookies() {
		dsl.clicarPorId("onetrust-accept-btn-handler");
	}
	
	public void finalizarSenha() {
		dsl.clicarPorXpath("//span[contains(text(), 'Salvar Alterações')]");
	}
	
	public void validarSenha() {
		dsl.verificarSeElementoEstaPresenteXpath("//h6[contains(text(), 'Dados alterados com sucesso')]");
	}
	
	// DEFINIR SENHA INVÁLIDA
	
	public void validarErroInvalido() {
		dsl.verificarSeElementoEstaPresenteXpath("//p[contains(text(), 'A senha deve seguir as regras acima')]");
	}	
	
	// DEFINIR SENHA EM BRANCO
	
	public void validarErroBranco() {
		dsl.verificarSeElementoEstaPresenteXpath("//p[contains(text(), 'Este campo é obrigatório')]");
	}
}
