package stepsDefinition;

import functions.enderecoCadastradoFunctions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class enderecoCadastradoSteps {

	enderecoCadastradoFunctions ecf = new enderecoCadastradoFunctions();
	
	@Dado("que eu entre no site da natura e vou em endereços cadastrados logo após ter feito o login")
	public void que_eu_entre_no_site_da_natura_e_vou_em_endereços_cadastrados_logo_após_ter_feito_o_login() {
	    ecf.abrirURL();
	    ecf.loginConta();
	    ecf.escreverEmail();
	    ecf.escreverSenha();
	    ecf.confirmarLogin();
	    ecf.clicarUsuario();
	}
	
	@Quando("eu clicar em endereços cadastrados e abrir uma tela, e por fim, eu definir meu endereço pelo CEP, definindo também o número junto com o nome de quem vai receber a entrega")
	public void eu_clicar_em_endereços_cadastrados_e_abrir_uma_tela_e_por_fim_eu_definir_meu_endereço_pelo_cep_definindo_também_o_número_junto_com_o_nome_de_quem_vai_receber_a_entrega() {
	    ecf.entrarEndereco();
	    ecf.adicionarEndereco();
	    ecf.escreverCEP();
	    ecf.escreverNumero();
	}
	
	@Então("devo validar se aquele endereço foi salva logo após eu ter clicado no botão de {string}")
	public void devo_validar_se_aquele_endereço_foi_salva_logo_após_eu_ter_clicado_no_botão_de(String string) {
	    ecf.finalizarEndereco();
	    ecf.validarEndereco();
	}
	
}
