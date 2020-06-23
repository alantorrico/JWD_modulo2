package com.mitocode.javaweb.semana02._3_default;

public class OperacionAvanzada implements IOperacion {

	@Override
	public int operacion(int x, int y) {
		return (int) Math.pow(x * 1.0, y * 1.0);
	}

	@Override
	public void metodoDefault() {
		IOperacion.super.metodoDefault();
	}
}
