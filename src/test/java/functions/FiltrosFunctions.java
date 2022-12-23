package functions;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;


import pages.FiltrosPages;

public class FiltrosFunctions {

	FiltrosPages fp = new FiltrosPages();

	public void acessarPagina(String string) {
		fp.entrarPagina(string);
	}

	public void clicarMostrar() {
		fp.abrirMostrar();
	}

	public void selecionarMostrar(String string) {
		fp.selecionarLista(string);
	}

	public void validarQuantidadeProdutos(int i) {
		int contar = fp.contarElementos();
		System.out.print(contar);
		Assert.assertEquals(contar, i);
	}

	public void clicarOrdernar() {	
		fp.abrirOrdenar();
	}

	public void selecionarOrdenar(String string) {
		fp.selecionarLista(string);
	}

	public void validarTitulo(String string) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i = 1; i <= 12; i++) {
			String prod = fp.obterProduto(i);
			String corretorProd = Normalizer.normalize(prod, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
			lista.add(corretorProd);
			}
		
		if(string == "A-Z" ) {
			System.out.print(lista);
			List<String> listaOrdenada = lista.stream().sorted().collect(Collectors.toList());
			System.out.print("\n" + listaOrdenada);
			Assert.assertTrue(lista.equals(listaOrdenada));
		}else if (string == "Z-A") {
			ArrayList<String> listaReversa = lista;
			System.out.print(lista);
			Collections.sort(listaReversa, Collections.reverseOrder());
			System.out.print("\n" + listaReversa);
			Assert.assertTrue(lista.equals(listaReversa));
		}
		
	}
	
}
	
