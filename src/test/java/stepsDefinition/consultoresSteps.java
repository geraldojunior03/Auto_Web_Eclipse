package stepsDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import functions.consultoresFunctions;

public class consultoresSteps {

	consultoresFunctions cf = new consultoresFunctions();
	
	// BUSCAR POR NOME
	
	@Dado("que eu entre no site da natura e vou em buscar consultora")
	public void que_eu_entre_no_site_da_natura_e_vou_em_buscar_consultora() {
		cf.abrirUrl();
		cf.mouseOverNatura();
		cf.clicarConsultor();
		cf.validarPagina();
	}
	
	@Quando("eu inserir o nome de uma consultora existente e clicar em pesquisar")
	public void eu_inserir_o_nome_de_uma_consultora_existente_e_clicar_em_pesquisar() {
		cf.escreverConsultor();
		cf.clicarPesquisar();
	}
	
	@Entao("deverá aparecer um card com sua foto, seu nome e seu estado \\/ cidade")
	public void deverá_aparecer_um_card_com_sua_foto_seu_nome_e_seu_estado_cidade() {
	    cf.validarConsultor();
	}
	
	// BUSCAR POR CEP
	
	@Quando("eu inserir o CEP de uma consultora existente e clicar em pesquisar")
	public void eu_inserir_o_cep_de_uma_consultora_existente_e_clicar_em_pesquisar() {
	    cf.escreverCEP();
	    cf.clicarPesquisar();
	}
}
