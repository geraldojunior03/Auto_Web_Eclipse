package functions;

import pages.alterarSenhaPages;

public class alterarSenhaFunctions {

	alterarSenhaPages asp = new alterarSenhaPages();
	
	// STRING
	
	String novaSenha = "Svlabs@2022";
	String senhaInvalida = "123";
	
	// DEFINIR NOVA SENHA VÁLIDA
	
	public void entrarSenha() {
		asp.entrarSenha();
	}
	
	public void novaSenha() {
		asp.novaSenha(novaSenha);
	}
	
	public void confirmarSenha() {
		asp.confirmarSenha(novaSenha);
	}
	
	public void aceitarCookies() {
		asp.aceitarCookies();
	}
	
	public void finalizarSenha() {
		asp.finalizarSenha();
	}
	
	public void validarSenha() {
		asp.validarSenha();
	}
	
	// DEFINIR SENHA INVÁLIDA
	
	public void senhaInvalida() {
		asp.novaSenha(senhaInvalida);
	}
	
	public void confirmarSenhaInvalida() {
		asp.confirmarSenha(senhaInvalida);
	}
	
	public void validarErroInvalido() {
		asp.validarErroInvalido();
	}
	
	public void validarErroBranco() {
		asp.validarErroBranco();
	}
}
