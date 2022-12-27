package stepsDefinition;

import functions.FiltrosFunctions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FiltrosSteps {

	FiltrosFunctions ff = new FiltrosFunctions();

	@Dado("o acesso ao site natura.com.br e que esteja dentro da categoria Corpo e Banho > Sabonete")
	public void o_acesso_ao_site_natura_com_br_e_que_esteja_dentro_da_categoria_corpo_e_banho_sabonete() {
		ff.acessarPagina("c/corpo-e-banho/sabonete");
	}
	
	@Quando("clicar na lista de Mostrar por página e selecionar a opção {string}")
	public void clicar_na_lista_de_mostrar_por_página_e_selecionar_a_opção(String string) {
		ff.clicarMostrar();
		ff.selecionarMostrar(string);
	}
	
	@Então("o sistema deve exibir trinta e seis itens na página")
	public void o_sistema_deve_exibir_trinta_e_seis_itens_na_página() {
		ff.validarQuantidadeProdutos(36);
	}

	@Dado("o acesso ao site natura.com.br, que esteja dentro da categoria Corpo e Banho > Sabonete e que o Mostrar página esteja como {string}")
	public void o_acesso_ao_site_natura_com_br_que_esteja_dentro_da_categoria_corpo_e_banho_sabonete_e_que_o_mostrar_página_esteja_como(String string) {
		ff.acessarPagina("c/corpo-e-banho/sabonete?pageSize=36");
	}
	
	@Então("o sistema deve exibir doze itens na página")
	public void o_sistema_deve_exibir_doze_itens_na_página() {
		ff.validarQuantidadeProdutos(12);
	}

	
	/*
	 * #####################
	 * #####################
	 * #####################
	 */
	
	@Dado("o acesso ao site natura.com.br, que esteja dentro da categoria Promoções")
	public void o_acesso_ao_site_natura_com_br_que_esteja_dentro_da_categoria_promoções() {
		ff.acessarPagina("c/tudo-em-promocoes");
	}
	
	@Quando("clicar na lista de Ordenar por: e selecionar a opção {string}")
	public void clicar_na_lista_de_ordenar_por_e_selecionar_a_opção(String string) {
		ff.clicarOrdernar();
		ff.selecionarOrdenar(string);
	}
	
	@Então("o sistema deve organizar os produtos em ordem alfabética")
	public void o_sistema_deve_organizar_os_produtos_em_ordem_alfabética() {
		ff.validarTitulo("A-Z");
	}

	@Então("o sistema deve organizar os produtos em ordem alfabética inversa")
	public void o_sistema_deve_organizar_os_produtos_em_ordem_alfabética_inversa() {
		ff.validarTitulo("Z-A");
	}

	@Então("o sistema deve organizar os produtos em ordem crescente de preço")
	public void o_sistema_deve_organizar_os_produtos_em_ordem_crescente_de_preço() {
		ff.validarPreco("Menor");
	}
	
	@Então("o sistema deve organizar os produtos em ordem decrescente de preço")
	public void o_sistema_deve_organizar_os_produtos_em_ordem_decrescente_de_preço() {
		ff.validarPreco("Maior");
	}







}
