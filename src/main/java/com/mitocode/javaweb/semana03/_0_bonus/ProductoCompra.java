package com.mitocode.javaweb.semana03._0_bonus;

public class ProductoCompra extends Producto {

	private Integer cantidad;

	public ProductoCompra(String idProducto, String nombre, Double precioVenta, Integer cantidad) {
		super(idProducto, nombre, null, 0.0, precioVenta);
		this.cantidad = cantidad;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
