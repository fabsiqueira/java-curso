package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Momo");
		
		
		//adicionando por posição
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		//removendo por comparação
		//list.remove("Anna");
		//index 
		//list.remove(1);
		
		for(String elementoLista : list) {
			System.out.println(elementoLista);
		}
		System.out.println("-------------");
		//removendo por predicado
		list.removeIf(elementoLista -> elementoLista.charAt(0) == 'M'); //função lambda
		for(String elementoLista : list) {
			System.out.println(elementoLista);
		}
		System.out.println("-------------");
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		System.out.println("index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("-------------");
		
		List<String> result = list.stream().filter(elementoLista -> elementoLista.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String elementoLista : result) {
			System.out.println(elementoLista);
		}
		System.out.println("-------------");
		String name = list.stream().filter(elementoLista -> elementoLista.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
