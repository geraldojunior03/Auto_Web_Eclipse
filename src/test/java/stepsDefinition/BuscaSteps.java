package stepsDefinition;

import functions.BuscaFunctions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BuscaSteps {
	
	BuscaFunctions bf = new BuscaFunctions();

	@Quando("escrever {string} na barra de busca e pressionar o botão enter no teclado")
	public void escrever_na_barra_de_busca_e_pressionar_o_botão_enter_no_teclado(String string) throws Exception {
		bf.escreverNaBusca(string);
	}
	
	@Então("o produto pesquisado deve aparecer na lista de produtos")
	public void o_produto_pesquisado_deve_aparecer_na_lista_de_produtos() {
		bf.validarProduto("Kaiak Aero Desodorante Colônia Masculino");
	}

	@Então("os produtos com esta palavra-chave devem aparecer na lista de produtos")
	public void os_produtos_com_esta_palavra_chave_devem_aparecer_na_lista_de_produtos() {
		bf.validarPalavra("Aero");
	}

	@Quando("clicar na barra de busca e clicar em um termo já pesquisado")
	public void clicar_na_barra_de_busca_e_clicar_em_um_termo_já_pesquisado() {
		bf.clicarHistorico();
	}
	
	@Então("o sistema deve levar para a página de busca deste termo")
	public void o_sistema_deve_levar_para_a_página_de_busca_deste_termo() {
		bf.validarHistorico();
	}

	@Então("o sistema deve redirecionar para uma página com erro de busca")
	public void o_sistema_deve_redirecionar_para_uma_página_com_erro_de_busca() {
		bf.validarErro();
	}

	@Dado("o acesso ao site natura.com.br e que já exista um termo pesquisado")
	public void o_acesso_ao_site_natura_com_br_e_que_já_exista_um_termo_pesquisado() throws Exception {
		bf.entrarNatura();
		bf.escreverNaBusca("Aero");
		bf.voltarHomePage();
	}

}
