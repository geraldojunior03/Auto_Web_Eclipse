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
		bf.aceitarCookies();
		bf.escreverNaBusca("Aero");
	}

	/*
	 * ##################
	 * ##################
	 * ##################
	 */

	@Quando("clicar na barra de busca e clicar em Limpar")
	public void clicar_na_barra_de_busca_e_clicar_em_limpar() {
		bf.limparHistorico();
	}
	
	@Então("o sistema apagar toda a lista do histórico")
	public void o_sistema_apagar_toda_a_lista_do_histórico() {
		bf.validarHistoricoLimpo();
	}

	@Quando("buscar o termo Perfume e clicar em Ver mais resultados")
	public void buscar_o_termo_perfume_e_clicar_em_ver_mais_resultados() {
		bf.buscarMaisResultados("Perfume");
	}
	
	@Então("o sistema deve exibir uma página apenas com perfumes")
	public void o_sistema_deve_exibir_uma_página_apenas_com_perfumes() {
		bf.validarBuscaPerfume();
	}

	@Quando("buscar o termo Essencial e clicar no produto Essencial Elixir na seção Produtos do menu de busca")
	public void buscar_o_termo_essencial_e_clicar_no_produto_essencial_elixir_na_seção_produtos_do_menu_de_busca() {
		bf.buscarSecaoProdutos("Essencial");
	}
	
	@Então("o sistema redirecionar para a página do produto")
	public void o_sistema_redirecionar_para_a_página_do_produto() {
		bf.validarPaginaEssencial();
	}

	@Quando("buscar o termo Kaiak e clicar no produto Kaiak Aero nas sugestões de busca do Menu de busca")
	public void buscar_o_termo_kaiak_e_clicar_no_produto_kaiak_aero_nas_sugestões_de_busca_do_menu_de_busca() {
		bf.buscarSugestao("Kaiak");
	}
	
	@Então("o sistema redirecionar para a página deste produto")
	public void o_sistema_redirecionar_para_a_página_deste_produto() {
		bf.validarPaginaKaiak();
	}

}
