package com.mitocode.javaweb.semana02._3_default;

public interface IOperacion2 {
	
	int operacion(int x, int y);
	
	default int resta(int x, int y) {
		return x - y;
	}
	
	default void metodoDefault() {
		System.out.println("Desde metodo default");
	}
}
