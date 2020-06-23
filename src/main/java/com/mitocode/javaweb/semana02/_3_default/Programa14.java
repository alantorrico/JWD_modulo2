package com.mitocode.javaweb.semana02._3_default;

public class Programa14 {

	public static void main(String[] args) {
	
		IOperacion o1 = (x,y) -> x * y;
		System.out.println("Multiplicacion " + o1.operacion(5, 4));
		
		System.out.println("Rest " + o1.resta(5, 4));
		o1.metodoDefault();
		
	}
}
