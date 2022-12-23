package stepsDefinition;

import functions.alterarSenhaFunctions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class alterarSenhaSteps {

	alterarSenhaFunctions asf = new alterarSenhaFunctions();
	
	// DEFINIR NOVA SENHA VÁLIDA
	
	@Quando("eu clicar em alterar senha e abrir uma tela, e por fim, eu definir uma senha válida")
	public void eu_clicar_em_alterar_senha_e_abrir_uma_tela_e_por_fim_eu_definir_uma_senha_válida() {
	    asf.entrarSenha();
	    asf.novaSenha();
	    asf.confirmarSenha();
	    asf.aceitarCookies();
	}
	
	@Então("devo validar se aquela senha foi salva logo após eu ter clicado no botão de {string}")
	public void devo_validar_se_aquela_senha_foi_salva_logo_após_eu_ter_clicado_no_botão_de(String string) {
	    asf.finalizarSenha();
		asf.validarSenha();
	}
	
	// DEFINIR NOVA SENHA INVÁLIDA
	
	@Quando("eu clicar em alterar senha e abrir uma tela, e por fim, eu definir uma senha inválida")
	public void eu_clicar_em_alterar_senha_e_abrir_uma_tela_e_por_fim_eu_definir_uma_senha_inválida() {
		asf.entrarSenha();
		asf.senhaInvalida();
	    asf.confirmarSenhaInvalida();
	}
	
	@Então("devo validar se apareceu uma menssagem de erro")
	public void devo_validar_se_apareceu_uma_menssagem_de_erro() {
	    asf.validarErroInvalido();
	}
	
	// DEFINIR NOVA SENHA EM BRANCO
	
	@Quando("eu clicar em alterar senha e abrir uma tela, e por fim, eu definir uma senha em branco")
	public void eu_clicar_em_alterar_senha_e_abrir_uma_tela_e_por_fim_eu_definir_uma_senha_em_branco() {
	    asf.entrarSenha();
	    asf.aceitarCookies();
	    asf.finalizarSenha();
	}
	
	@Então("devo validar se apareceu uma menssagem de campo obrigatório")
	public void devo_validar_se_apareceu_uma_menssagem_de_campo_obrigatório() {
	    asf.validarErroBranco();
	}
	
	// DEFINIR A MESMA SENHA VÁLIDA
	
	@Quando("eu clicar em alterar senha e abrir uma tela, e por fim, eu definir a mesma senha válida")
	public void eu_clicar_em_alterar_senha_e_abrir_uma_tela_e_por_fim_eu_definir_a_mesma_senha_válida() {
	    asf.entrarSenha();
	    asf.novaSenha();
	    asf.confirmarSenha();
	}	
}
