package stepsDefinition;

import functions.CategoriasFunctions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CategoriasSteps {
	
	CategoriasFunctions cf = new CategoriasFunctions();

	@Dado("o acesso ao site natura.com.br")
	public void o_acesso_ao_site_natura_com_br() {
		cf.entrarNatura();
	}
	@Quando("clicar na categoria {string}")
	public void clicar_na_categoria(String string) throws Exception {
		cf.selecionarCategoria(string);
	}
	@Então("o sistema deve redirecionar para a página de promoções do natal")
	public void o_sistema_deve_redirecionar_para_a_página_de_promoções_do_natal() {
		cf.validarPagina("/c/natal");
	}

	@Então("o sistema deve redirecionar para a página com kits de presentes")
	public void o_sistema_deve_redirecionar_para_a_página_com_kits_de_presentes() {
		cf.validarPagina("/c/tudo-em-presentes");
	}

	@Então("o sistema deve redirecionar para a lista de produtos de perfumaria")
	public void o_sistema_deve_redirecionar_para_a_lista_de_produtos_de_perfumaria() {
		cf.validarPagina("/c/tudo-em-perfumaria");
	}

	@Então("o sistema deve redirecionar para a lista de produtos para corpo e banho")
	public void o_sistema_deve_redirecionar_para_a_lista_de_produtos_para_corpo_e_banho() {
		cf.validarPagina("/c/tudo-em-corpo-e-banho");
	}

	@Então("o sistema deve redirecionar para a lista de produtos para cabelos")
	public void o_sistema_deve_redirecionar_para_a_lista_de_produtos_para_cabelos() {
		cf.validarPagina("/c/tudo-em-cabelos");
	}

	@Então("o sistema deve redirecionar para a lista de produtos para rosto")
	public void o_sistema_deve_redirecionar_para_a_lista_de_produtos_para_rosto() {
		cf.validarPagina("/c/tudo-em-rosto");
	}

	@Então("o sistema deve redirecionar para a lista de produtos de maquiagem")
	public void o_sistema_deve_redirecionar_para_a_lista_de_produtos_de_maquiagem() {
		cf.validarPagina("/c/tudo-em-maquiagem");
	}

	@Então("o sistema deve redirecionar para a lista de produtos para crianças")
	public void o_sistema_deve_redirecionar_para_a_lista_de_produtos_para_crianças() {
		cf.validarPagina("/c/tudo-em-infantil");
	}

	@Então("o sistema deve redirecionar para a página com todas as promoções")
	public void o_sistema_deve_redirecionar_para_a_página_com_todas_as_promoções() {
		cf.validarPagina("/c/tudo-em-promocoes");
	}

	@Então("o sistema deve redirecionar para a página com as opções de marcas")
	public void o_sistema_deve_redirecionar_para_a_página_com_as_opções_de_marcas() {
		cf.validarPagina("/nossas-marcas");
	}

	@Quando("o cursor estiver por cima da categoria Rosto e clicar em Ver todos os produtos")
	public void o_cursor_estiver_por_cima_da_categoria_rosto_e_clicar_em_ver_todos_os_produtos() {
		cf.clicarVerTodosOsProdutosRosto("Rosto");
	}
	
	@Então("o sistema deve redirecionar para a lista de produtos da categoria Rosto")
	public void o_sistema_deve_redirecionar_para_a_lista_de_produtos_da_categoria_rosto() {
		cf.validarPagina("/c/tudo-em-rosto");
	}

	/*
	########################
	########################
	########################
	*/

	@Quando("abrir as subcategorias da categoria {string} e clicar em {string}")
	public void abrir_as_subcategorias_da_categoria_e_clicar_em(String categoria, String subcategoria) {
		cf.selecionarPagina(categoria, subcategoria);
	}
	
	@Então("o sistema deve redirecionar para a página de perfumes masculinos")
	public void o_sistema_deve_redirecionar_para_a_página_de_perfumes_masculinos() {
		cf.validarSubcategoria("MASCULINA");
	}

	@Então("o sistema deve redirecionar para a página de sabonetes")
	public void o_sistema_deve_redirecionar_para_a_página_de_sabonetes() {
		cf.validarSubcategoria("SABONETE");
	}

	@Então("o sistema deve redirecionar para a página de shampoos")
	public void o_sistema_deve_redirecionar_para_a_página_de_shampoos() {
		cf.validarSubcategoria("SHAMPOO");
	}

	@Então("o sistema deve redirecionar para a página de hidratantes de rosto")
	public void o_sistema_deve_redirecionar_para_a_página_de_hidratantes_de_rosto() {
		cf.validarSubcategoria("HIDRATAÇÃO");
	}

	@Então("o sistema deve redirecionar para a página de maquiagens para a boca")
	public void o_sistema_deve_redirecionar_para_a_página_de_maquiagens_para_a_boca() {
		cf.validarSubcategoria("BOCA");
	}

	@Então("o sistema deve redirecionar para a página de presentes para crianças")
	public void o_sistema_deve_redirecionar_para_a_página_de_presentes_para_crianças() {
		cf.validarSubcategoria("PRESENTES");
	}

	@Então("o sistema deve redirecionar para a página de promoções até cinquenta%")
	public void o_sistema_deve_redirecionar_para_a_página_de_promoções_até() {
		cf.validarSubcategoria("DESCONTO");
	}

	@Então("o sistema deve redirecionar para a página marcas veganas.")
	public void o_sistema_deve_redirecionar_para_a_página_marcas_veganas() {
		cf.validarSubcategoria("VEGANOS");
	}

	@Então("o sistema deve redirecionar para a lista de presentes com a faixa de preço até cinquenta reais")
	public void o_sistema_deve_redirecionar_para_a_lista_de_presentes_com_a_faixa_de_preço_até_cinquenta_reais() {
		cf.validarFaixaDePreco();
	}

}
