package functions;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
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

	public void validarPreco(String string) {	
		List<Double> lista = new ArrayList<Double>();
		
		for(int i = 1; i <= 12; i++) {
			String card = fp.obterPreco(i);
			int count = StringUtils.countMatches(card, "R$");
			
			if (count == 1 || (count == 2 && card.contains("%") == false)) {
				int pos = card.indexOf("R$");
				String preco = card.substring(pos, (pos + 8) ).replace(",", ".");
				String precoRed = preco.substring(3);
				int pos2 = precoRed.indexOf(".");
				String precoReal = precoRed.substring(0, (pos2 + 2));
				double corretorPreco = Double.parseDouble(precoReal);
				lista.add(corretorPreco);
			}else if(count == 2 || count == 3 && card.contains("%") == true) {
				int pos = card.indexOf("$");
				StringBuilder sb = new StringBuilder(card);
				StringBuilder retiraPrimeiro = sb.deleteCharAt(pos);
				int pos1 = retiraPrimeiro.indexOf("R$");
				String preco = retiraPrimeiro.substring(pos1, (pos1 + 8) ).replace(",", ".");;
				String precoRed = preco.substring(3);
				int pos2 = precoRed.indexOf(".");
				String precoReal = precoRed.substring(0, (pos2 + 2));
				double corretorPreco = Double.parseDouble(precoReal);
				lista.add(corretorPreco);
			}
		}	
		
		List<Double> listaReversa = new ArrayList<Double>();
		for (int i = 0; i < lista.size(); i++) {
			listaReversa.add(lista.get(i));
		}
		
		System.out.print(lista);
		if(string == "Menor" ) {	
			List<Double> listaOrdenada = lista.stream().sorted().collect(Collectors.toList());
//			Collections.sort(listaReversa, Collections.reverseOrder());
			System.out.print("\n" + listaOrdenada);
			Assert.assertTrue(lista.equals(listaOrdenada));
		}else if (string == "Maior") {
			Collections.sort(listaReversa, Collections.reverseOrder());
			System.out.print("\n" + listaReversa);
			Assert.assertTrue(lista.equals(listaReversa));
		}
	}	
}