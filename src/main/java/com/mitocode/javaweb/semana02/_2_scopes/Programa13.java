package com.mitocode.javaweb.semana02._2_scopes;

public class Programa13 {

	int entero = 5;
	float flotante;
	double decimal;
	String cadena;
	boolean estado;
	
	public void variablesLocales() {
		final int entero2 = 10;
		System.out.println(entero2);
		
		IOperacion o1 = (x, y) -> {
//			entero2 = 3;
			return x + y + entero2;
		};
		
		System.out.println("Suma " + o1.operacion(3, 5));
		
		
		IOperacion o2 = (x, y) -> {
			entero = 3;
			return x + y + entero;
		};
		System.out.println("antes entero global " + entero);
		System.out.println("Suma " + o2.operacion(3, 5));
		System.out.println("despues entero global " + entero);
	}

	public static void main(String[] args) {
		Programa13 programa = new Programa13();
		programa.variablesLocales();
	}
}
