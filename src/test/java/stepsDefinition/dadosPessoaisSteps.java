package stepsDefinition;

import functions.dadosPessoaisFunctions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class dadosPessoaisSteps {

	dadosPessoaisFunctions ddf = new dadosPessoaisFunctions();

	// TROCAR NOME
	
	@Dado("que eu entre no site da natura e vou em dados pessoais logo após ter feito o login")
	public void que_eu_entre_no_site_da_natura_e_vou_em_dados_pessoais_logo_após_ter_feito_o_login() {
		ddf.abrirURL();
		ddf.loginConta();
		ddf.escreverEmail();
		ddf.escreverSenha();
		ddf.confirmarLogin();
		ddf.clicarUsuario();
		ddf.clicarDados();
	}
	
	@Quando("eu clicar em dados pessoais e abrir uma tela, e por fim eu definir\\/trocar meu nome")
	public void eu_clicar_em_dados_pessoais_e_abrir_uma_tela_e_por_fim_eu_definir_trocar_meu_nome() {
	   ddf.entrarDados();
	   ddf.limparNome();
	   ddf.escreverNome();
	   ddf.salvarAlteracao();
	}
	
	@Então("devo validar se aquele nome foi realmente alterado logo após eu ter clicado no botão de {string}")
	public void devo_validar_se_aquele_nome_foi_realmente_alterado_logo_após_eu_ter_clicado_no_botão_de(String string) {
	   ddf.entrarDados();
	   ddf.validarAlteracaoNome();
	}
	
	// TROCAR SOBRENOME
	
	@Quando("eu clicar em dados pessoais e abrir uma tela, e por fim eu definir\\/trocar meu sobrenome")
	public void eu_clicar_em_dados_pessoais_e_abrir_uma_tela_e_por_fim_eu_definir_trocar_meu_sobrenome() {
	    ddf.entrarDados();
	    ddf.limparSobrenome();
	    ddf.escreverSobrenome();
	    ddf.salvarAlteracao();
	}
	
	@Então("devo validar se aquele sobrenome foi realmente alterado logo após eu ter clicado no botão de {string}")
	public void devo_validar_se_aquele_sobrenome_foi_realmente_alterado_logo_após_eu_ter_clicado_no_botão_de(String string) {
		ddf.entrarDados();
		ddf.validarAlteracaoSobrenome();
	}
	
	// TROCAR NOME EM BRANCO
	
	@Quando("eu clicar em dados pessoais e abrir uma tela, e por fim eu definir\\/trocar meu nome para caracteres em branco")
	public void eu_clicar_em_dados_pessoais_e_abrir_uma_tela_e_por_fim_eu_definir_trocar_meu_nome_para_caracteres_em_branco() {
	    ddf.entrarDados();
	    ddf.limparNome();
	}
	
	@Então("devo validar se apareceu uma menssagem de erro do nome")
	public void devo_validar_se_apareceu_uma_menssagem_de_erro_do_nome() {
		ddf.validarErroNome();
	}
	
	// TROCAR/ADICIONAR UMA DATA DE ANIVERSÁRIO
	
	@Quando("eu clicar em dados pessoais e abrir uma tela, e por fim eu definir\\/trocar minha data de aniversário")
	public void eu_clicar_em_dados_pessoais_e_abrir_uma_tela_e_por_fim_eu_definir_trocar_minha_data_de_aniversário() {
		ddf.entrarDados();
		ddf.limparData();
		ddf.definirDataValida();
		ddf.salvarAlteracao();
	}
	
	@Então("devo validar se aquela data foi realmente alterada logo após eu ter clicado no botão de {string}")
	public void devo_validar_se_aquela_data_foi_realmente_alterada_logo_após_eu_ter_clicado_no_botão_de(String string) {
		ddf.entrarDados();
		ddf.validarData();
	}
	
	// TROCAR/ADICIONAR UMA DATA DE ANIVERSÁRIO INVÁLIDA
	
	@Quando("eu clicar em dados pessoais e abrir uma tela, e por fim eu definir\\/trocar minha data de aniversário para uma data inválida")
	public void eu_clicar_em_dados_pessoais_e_abrir_uma_tela_e_por_fim_eu_definir_trocar_minha_data_de_aniversário_para_uma_data_inválida() {
		ddf.entrarDados();
		ddf.limparData();
	    ddf.definirDataInvalida();
	    ddf.salvarAlteracao();
	}
	
	@Então("devo validar se apareceu uma menssagem de erro de data")
	public void devo_validar_se_apareceu_uma_mensagem_de_erro_de_data() {
		ddf.validarErroData();
	}
	
	// TROCAR/ADICIONAR NÚMERO DE WHATSAPP VÁLIDO
	
	@Quando("eu clicar em dados pessoais e abrir uma tela, e por fim eu definir\\/trocar meu número de whatsapp")
	public void eu_clicar_em_dados_pessoais_e_abrir_uma_tela_e_por_fim_eu_definir_trocar_meu_número_de_whatsapp() {
		ddf.entrarDados();
		ddf.limparTelefone();
		ddf.definirNumero();
		ddf.salvarAlteracao();
	}
	
	@Então("devo validar se o número foi salvo após eu ter clicado no botão {string}")
	public void devo_validar_se_o_número_foi_salvo_após_eu_ter_clicado_no_botão(String string) {
	    ddf.entrarDados();
	    ddf.validarNumero();
	}

	// TROCAR/ADICIONAR NÚMERO DE WHATSAPP INVÁLIDO
	
	@Quando("eu clicar em dados pessoais e abrir uma tela, e por fim eu definir\\/trocar meu número de whatsapp inválido")
	public void eu_clicar_em_dados_pessoais_e_abrir_uma_tela_e_por_fim_eu_definir_trocar_meu_número_de_whatsapp_inválido() {
	    ddf.entrarDados();
	    ddf.limparTelefone();
	    ddf.definirNumeroInvalido();
	    ddf.salvarAlteracao();
	}
	
	@Então("devo validar se apareceu uma menssagem de erro do número")
	public void devo_validar_se_apareceu_uma_mensagem_de_erro_do_numero() {
		ddf.validarErroNumero();
	}
}
