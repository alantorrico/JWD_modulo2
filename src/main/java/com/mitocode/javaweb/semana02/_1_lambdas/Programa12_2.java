package com.mitocode.javaweb.semana02._1_lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa12_2 {

	public static void main(String[] args) {
		List<Empleado> lista = new ArrayList<Empleado>();
		lista.add(new Empleado("Diego", 1000.0, 29));
		lista.add(new Empleado("Jahiro", 2000.0, 25));
		lista.add(new Empleado("Carlos", 1500.0, 20));
		
		Comparator<Empleado> comparator = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombres().compareTo(o2.getNombres());
			}
		};
		
		System.out.println("Lista Ordenada por nombre");
		lista.sort(comparator);
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		System.out.println("======================");
		lista.sort(new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return -o1.getSueldo().compareTo(o2.getSueldo());
			}
		});
		System.out.println("Lista Ordenada por sueldo");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		System.out.println("======================");
		lista.sort((Empleado o1, Empleado o2) -> { return o1.getEdad().compareTo(o2.getEdad()); });
		System.out.println("Lista Ordenada por edad");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		System.out.println("======================");
		lista.sort((o1, o2) -> { return o1.getNombres().compareTo(o2.getNombres()); });
		System.out.println("Lista Ordenada por nombre con lambda");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
	}
}
