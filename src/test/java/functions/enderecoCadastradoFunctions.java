package functions;

import pages.enderecoCadastradoPages;

public class enderecoCadastradoFunctions {

	enderecoCadastradoPages ecp = new enderecoCadastradoPages();
	
	// STRINGS
	
	String email = "gjunior@svlabs.com.br";
	String senha = "Junior@2003";
	
	String CEP = "06622350";
	String Numero = "183";
	
	public void abrirURL() {
		ecp.abrirURL("https://www.natura.com.br/");
	}
	
	public void loginConta() {
		ecp.loginConta();
	}
	
	public void escreverEmail() {
		ecp.escreverEmail(email);
	}
	
	public void escreverSenha() {
		ecp.escreverSenha(senha);
	}
	
	public void confirmarLogin() {
		ecp.confirmarLogin();
	}
	
	public void clicarUsuario() {
		ecp.clicarUsuario();
	}
	
	public void entrarEndereco() {
		ecp.entrarEndereco();
	}
	
	public void adicionarEndereco() {
		ecp.adicionarEndereco();
	}
	
	public void escreverCEP() {
		ecp.escreverCEP(CEP);
	}
	
	public void escreverNumero() {
		ecp.escreverNumero(Numero);
	}
	
	public void finalizarEndereco() {
		ecp.finalizarEndereco();
	}
	
	public void validarEndereco() {
		ecp.validarEndereco();
	}
}
