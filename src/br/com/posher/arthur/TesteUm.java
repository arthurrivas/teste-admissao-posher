package br.com.posher.arthur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteUm {

	public static void main(String[] args) {

		List<Integer> valores = new ArrayList<>(Arrays.asList(2, 4, 6, 7 , 8, 9, 5, 10, 5, 5 , 5, 10));
		List<Integer> sequencia = new ArrayList<>(Arrays.asList(2, 6, 8, 10, 5));

		boolean subsequente = isSubsequent(valores, sequencia);

		System.out.println(subsequente);

	}
	// retornara um booleano determinando se a lista de sequencia consta na lista de valores seguindo a mesma ordem;
	public static Boolean isSubsequent(List<Integer> listaValores, List<Integer> listaSequencia) {

		List<Integer> listaFiltrada = filtraValoresIguais(listaValores, listaSequencia);

		Boolean listaComMesmaSequencia = false;
		
		if (listasMesmoTamanho(listaFiltrada, listaSequencia)) {
			
			
			listaComMesmaSequencia = true;
			
			return listaComMesmaSequencia;
		}
		return listaComMesmaSequencia;

	}
	
	// Filtra os dados que contem na lista de valores e na lista de sequencia;
	// retorna uma nova lista com os dados obedecendo a regra de sequencia;
	public static List<Integer> filtraValoresIguais(List<Integer> listaValores, List<Integer> listaSequencia) {
		List<Integer> novaListaFiltrada = new ArrayList<Integer>();

		Integer v = 0;
		Integer s = 0;

		while (v < listaValores.size() && s < listaSequencia.size()) {

			Integer valor = listaValores.get(v);
			Integer nSequencia = listaSequencia.get(s);

			if (valor == nSequencia) {
				novaListaFiltrada.add(nSequencia);
				v++;
				s++;
			} else {
				v++;
			}
		}
		return novaListaFiltrada;
	}
	
	// Verificação simples se duas listas tem o tamanho igual
	public static Boolean listasMesmoTamanho(List<Integer> listaUm, List<Integer> listaDois) {
		
		if(listaUm.size() == listaDois.size()) {
			return true;
		}
		
		return false;

	}

}
