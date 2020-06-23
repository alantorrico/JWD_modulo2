package com.mitocode.javaweb.semana02._3_default;

@FunctionalInterface
public interface IOperacion3 {
	
	int operacion(int x, int y);

	default int resta(int x, int y) {
		return x - y;
	}
	
	default void metodoDefault() {
		System.out.println("Desde metodo default");
	}
}
