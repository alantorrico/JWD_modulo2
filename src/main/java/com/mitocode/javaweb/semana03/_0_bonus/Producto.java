package com.mitocode.javaweb.semana03._0_bonus;

public abstract class Producto {

	protected String idProducto;
	protected String nombre;
	protected Categoria categoria;
	protected Double precioCompra;
	protected Double precioVenta;

	public Producto(String idProducto, String nombre, Categoria categoria, Double precioCompra, Double precioVenta) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

}
