package com.mitocode.javaweb.semana03._0_bonus;

import java.time.LocalDateTime;
import java.util.List;

public class Operacion {

	private List<ProductoCompra> productos;
	private LocalDateTime fechaTiempoOperacion;

	public Operacion(List<ProductoCompra> productos) {
		this.productos = productos;
		this.fechaTiempoOperacion = LocalDateTime.now();
	}

	public List<ProductoCompra> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoCompra> productos) {
		this.productos = productos;
	}

	public LocalDateTime getFechaTiempoOperacion() {
		return fechaTiempoOperacion;
	}

	public void setFechaTiempoOperacion(LocalDateTime fechaTiempoOperacion) {
		this.fechaTiempoOperacion = fechaTiempoOperacion;
	}

}
