package com.mitocode.javaweb.semana02._1_lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa12_1 {

	public static void main(String[] args) {
		
		String[] colores = { "negro", "amarillo", "vere", "azul", "violeta" };
		List<String> lista = Arrays.asList(colores);
		
		Collections.sort(lista);
		System.out.println("Lista ascendente");
		System.out.println(lista);
		
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println("Lista descendente");
		System.out.println(lista);
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		
		Collections.sort(lista, comparator);
		System.out.println("Ordenamiento con comparator");
		System.out.println(lista);
		
	}
}
