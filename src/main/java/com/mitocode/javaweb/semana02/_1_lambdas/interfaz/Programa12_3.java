package com.mitocode.javaweb.semana02._1_lambdas.interfaz;

public class Programa12_3 {

	public static void main(String[] args) {
		
		IOperacion operacion1 = new IOperacion() {
			@Override
			public int operacion(int x, int y) {
				return x + y;
			}

//			@Override
//			public int resta(int x, int y) {
//				// TODO Auto-generated method stub
//				return x -y;
//			}
		};
		System.out.println("Suma con interfaz " + operacion1.operacion(5, 3));
//		System.out.println("Suma con interfaz " + operacion1.resta(5, 3));
		
		IOperacion operacion2 = (x,y) -> x + y;
		IOperacion operacion3 = (x,y) -> x - y;
		System.out.println("Suma con lambda " + operacion2.operacion(5, 3));
		System.out.println("Resta con lambda " + operacion3.operacion(5, 10));
	}
}
