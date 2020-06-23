package com.mitocode.javaweb.semana02._4_referencia_intro;

import java.util.Arrays;
import java.util.List;

public class Programa15 {

	public static void main(String[] args) {
		
		// metodos estaticos
		List<String> colores = Arrays.asList("rojo", "amarillo", "azul", "verde");
		
		System.out.println("impresion con for");
		for (String color : colores) {
			System.out.println(color);
		}
		
		System.out.println("impresion con lambda");
		colores.forEach(c -> System.out.println(c));
		
		System.out.println("impresion con referencia");
		colores.forEach(System.out::println);
		
		System.out.println("impresion con referencia propia");
		colores.forEach(Programa15::impresionPropia);
		
		Empleado empleado = new Empleado("Diego", 100.0, 25);
		System.out.println("Empleado 1" + empleado);
		
		IEmpleado iEmpleado1 = new IEmpleado() {
			@Override
			public Empleado crear(String nombres, Double sueldo, Integer edad) {
				return new Empleado(nombres, sueldo, edad);
			}
		};
		IEmpleado iEmpleado2 = (nombres, sueldo, edad) -> new Empleado(nombres, sueldo, edad);
		IEmpleado iEmpleado3 = Empleado::new;
		Empleado empleado02 = iEmpleado3.crear("Christian", 2000.00, 30);
		System.out.println(empleado02);
	}
	
	public static void impresionPropia(String color) {
		System.out.println("color: " + color);
	}
}
