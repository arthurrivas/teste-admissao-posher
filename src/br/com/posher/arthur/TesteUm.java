package br.com.posher.arthur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteUm {

	public static void main(String[] args) {
		
		
		List<Integer> valores = new ArrayList<>(Arrays.asList(2, 4, 6, 7, 8, 9, 5, 10, 5));
		List<Integer> sequencia = new ArrayList<>(Arrays.asList(2, 6, 8, 10, 5));
		

		boolean subsequente = isSubsequent(valores, sequencia);

		System.out.println(subsequente);

	}

	public static boolean isSubsequent(List<Integer> listaValores, List<Integer> listaSequencia) {

		List<Integer> listaComparativa = new ArrayList<Integer>();

		Integer v = 0;
		Integer s = 0;

		while (v < listaValores.size()) {

			Integer valor = listaValores.get(v);
			Integer nSequencia = listaSequencia.get(s);

			if (valor == nSequencia) {

				listaComparativa.add(nSequencia);
				v ++;
				s ++;
			} else {
				v ++;
			}
		}

		if (listaComparativa.size() == listaSequencia.size()) {
			Integer i = 0;
			while (i < listaSequencia.size()) {
				if (listaSequencia.get(i) != listaComparativa.get(i)) {
					return false;
				}
				i += 1;
			}
			return true;
		}
		return false;

	}

}
