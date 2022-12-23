package pages;

import core.DSL;

public class dadosPessoaisPages {

	DSL dsl = new DSL();
	
	// TROCAR NOME
	
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
	
	public void clicarDados() {
		dsl.clicarPorXpath("//span[contains(text(), 'Dados Pessoais')]");
	}
	
	public void entrarDados() {
		dsl.clicarPorXpath("//span[contains(text(), 'Nome, data de nascimento, celular, gênero…')]");
	}
	
	public void limparNome() {
		dsl.limparPorXpath("//input[@name='firstName']");
	}
	
	public void escreverNome(String nome) {
		dsl.escrevePorXpath("//input[@name='firstName']", nome);
	}
	
	public void salvarAlteracao() {
		dsl.pressionaTeclaENTER();
	}
	
	public void validarAlteracaoNome(String nome) {
		dsl.verificarSeElementoEstaPresenteXpath("//input[@value='" + nome + "']");
	}
	
	// TROCAR SOBRENOME
	
	public void limparSobrenome() {
		dsl.limparPorXpath("//input[@name='lastName']");
	}
	
	public void escreverSobrenome(String sobrenome) {
		dsl.escrevePorXpath("//input[@name='lastName']", sobrenome);
	}

	public void validarAlteracaoSobrenome(String sobrenome) {
		dsl.verificarSeElementoEstaPresenteXpath("//input[@value='" + sobrenome + "']");
	}
	
	// TROCAR NOME EM BRANCO
	
	public void validarErro() {
		dsl.verificarSeElementoEstaPresenteXpath("//span[contains(text(), 'Este campo é obrigatório')]");
	}
	
	// TROCAR/ADICIONAR UMA DATA DE ANIVERSÁRIO
	
	public void limparData() {
		dsl.clicarPorName("dateOfBirth");
		dsl.pressionaCtrlA();
		dsl.pressionaCtrlX();
	}
	
	public void definirData(String data) {
		dsl.escrevePorXpath("//input[@name='dateOfBirth']", data);
	}
	
	public String validarData() {
		return dsl.obterValorCampoPorXpath("//input[@name='dateOfBirth']");
	}
	
	// TROCAR/ADICIONAR UMA DATA DE ANIVERSÁRIO INVÁLIDA
	
	public void validarErroData() {
		dsl.verificarSeElementoEstaPresenteXpath("//span[contains(text(), 'Data inválida')]");
	}
	
	// TROCAR/ADICIONAR NÚMERO DE WHATSAPP VÁLIDO
	
	public void definirNumero(String numero) {
		dsl.clicarPorName("whatsappPhone");
		dsl.pressionaCtrlA();
		dsl.pressionaCtrlX();
		dsl.escrevePorName("whatsappPhone", numero);
	}
	
	public void limparTelefone() {
		dsl.clicarPorName("whatsappPhone");
		dsl.pressionaCtrlA();
		dsl.pressionaCtrlX();
	}
	
	public String validarNumero() {
		return dsl.obterValorCampoPorXpath("//input[@name='whatsappPhone']");		
	}
	
	// TROCAR/ADICIONAR NÚMERO DE WHATSAPP INVÁLIDO
	
	public void definirNumeroInvalido(String numeroInvalido) {
		dsl.escrevePorXpath("//input[@name='whatsappPhone']", numeroInvalido);
	}
	
	public void validarErroNumero() {
		dsl.verificarSeElementoEstaPresenteXpath("//span[contains(text(), 'Telefone inválido')]");
	}
}
