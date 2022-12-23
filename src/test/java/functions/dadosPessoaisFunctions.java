package functions;

import junit.framework.Assert;
import pages.dadosPessoaisPages;

public class dadosPessoaisFunctions {

	dadosPessoaisPages dpp = new dadosPessoaisPages();
	
	// STRINGS
	
	String email = "gjunior@svlabs.com.br";
	String senha = "Junior@2003";
	
	String nome = "Ge";
	String sobrenome = "Ju";
	
	String dataValida = "01122000";
	String dataInvalida = "32132023";
	
	String numero = "11 912345678";
	String numeroInvalido = "4002 8922";
	
	// TROCAR NOME
	
	public void abrirURL() {
		dpp.abrirURL("https://www.natura.com.br/");
	}
	
	public void loginConta() {
		dpp.loginConta();
	}
	
	public void escreverEmail() {
		dpp.escreverEmail(email);
	}
	
	public void escreverSenha() {
		dpp.escreverSenha(senha);
	}
	
	public void confirmarLogin() {
		dpp.confirmarLogin();
	}
	
	public void clicarUsuario() {
		dpp.clicarUsuario();
	}
	
	public void clicarDados() {
		dpp.clicarDados();
	}	
	
	public void entrarDados() {
		dpp.entrarDados();
	}
	
	public void limparNome() {
		dpp.limparNome();
	}
	
	public void escreverNome() {
		dpp.escreverNome(nome);
	}
	
	public void salvarAlteracao() {
		dpp.salvarAlteracao();
	}
	
	public void validarAlteracaoNome() {
		dpp.validarAlteracaoNome(nome);
	}
	
	// TROCAR SOBRENOME
	
	public void limparSobrenome() {
		dpp.limparSobrenome();
	}
	
	public void escreverSobrenome() {
		dpp.escreverSobrenome(sobrenome);
	}
	
	public void validarAlteracaoSobrenome() {
		dpp.validarAlteracaoSobrenome(sobrenome);
	}
	
	// TROCAR NOME EM BRANCO
	
	public void validarErroNome() {
		dpp.validarErro();
	}
	
	// TROCAR/ADICIONAR UMA DATA DE ANIVERSÁRIO
	
	public void limparData() {
		dpp.limparData();
	}
	
	public void definirDataValida() {
		dpp.definirData(dataValida);
	}
	
	public void validarData() {
		String menssagem = dpp.validarData();
		Assert.assertEquals(menssagem, "01/12/2000");
	}
	
	// TROCAR/ADICIONAR UMA DATA DE ANIVERSÁRIO INVÁLIDA
	
	public void definirDataInvalida() {
		dpp.definirData(dataInvalida);
	}
	
	public void validarErroData() {
		dpp.validarErroData();
	}
	
	// TROCAR/ADICIONAR NÚMERO DE WHATSAPP VÁLIDO

	public void definirNumero() {
		dpp.definirNumero(numero);
	}
	
	public void validarNumero() {	
		String menssagem = dpp.validarNumero();
		Assert.assertEquals(menssagem, "11912345678");
	}
	
	// TROCAR/ADICIONAR NÚMERO DE WHATSAPP INVÁLIDO
	
	public void limparTelefone() {
		dpp.limparTelefone();
	}
	
	public void definirNumeroInvalido() {
		dpp.definirNumeroInvalido(numeroInvalido);
	}
	
	public void validarErroNumero() {
		dpp.validarErroNumero();
	}
}
