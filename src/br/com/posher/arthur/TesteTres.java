package br.com.posher.arthur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteTres {

	public static void main(String[] args) {
		
		
		List<String> listaPalavras = new ArrayList<>(Arrays.asList("arara", "jabuticaba", "asa", "caminhao"));
		
		List<Boolean> listaBooleanos = verifyPalindromes(listaPalavras);
		
		Integer i = 0;
		while(i < listaPalavras.size()){
			System.out.print(listaPalavras.get(i)  + ": " + listaBooleanos.get(i));
			System.out.println();
			i++;
		}
		
		
		
	}
		
	public static List<Boolean> verifyPalindromes(List<String> lista){
		
		List<Boolean> listaBooleanos  = new ArrayList<>();
		
		lista.forEach(palavra ->{
			StringBuilder strb = new StringBuilder(palavra);
			String palavraReversa = strb.reverse().toString();
			
			
			if(palavraReversa.equals(palavra) ) {
				listaBooleanos.add(true);
			}
			else {
				listaBooleanos.add(false);
			}
		});
		return listaBooleanos;
	}
}
