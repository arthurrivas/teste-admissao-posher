package br.com.posher.arthur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TesteDois {


	public static void main(String[] args) {
		
		
	List<String> listaValores = new ArrayList<String>(Arrays.asList("g", "g", "y", "c", "c", "c", "q", "c", "y", "y"));	
		
	listaValores = removeDuplicates(listaValores);

	
	System.out.println(listaValores);
	
	
	}
	
	public static List<String> removeDuplicates(List<String> lista){
		String ultimoValor = "";
		
		Iterator<String> iter = lista.iterator();
		
		while(iter.hasNext()){
			String valor = iter.next();
			if(valor.equals(ultimoValor)) {
				iter.remove();
			} else {
				ultimoValor = valor;
			}	
		}
		return lista;
	}	
	
	
}
