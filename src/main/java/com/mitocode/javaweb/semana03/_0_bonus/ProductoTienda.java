package com.mitocode.javaweb.semana03._0_bonus;

public class ProductoTienda extends Producto {

	private Integer stock;
	private Integer stockMinimo;

	// id,nombre,categoria,stock,precio compra,precio veta
	// 1,Televisor 32" Smart TV,TELEVISOR,10,1500.00,2299.99
	public ProductoTienda(String... campos) {
		super(campos[0], campos[1], Categoria.valueOf(campos[2]), Double.valueOf(campos[4]), Double.valueOf(campos[5]));
		this.stock = Integer.valueOf(campos[3]);
		this.stockMinimo = 0;
	}

	public ProductoTienda(String idProducto, String nombre, Categoria categoria, Double precioCompra,
			Double precioVenta, Integer stock) {
		super(idProducto, nombre, categoria, precioCompra, precioVenta);
		this.stock = stock;
		this.stockMinimo = 0;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@Override
	public String toString() {
		return "ProductoTienda [idProducto=" + idProducto + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", stock=" + stock
				+ ", stockMinimo=" + stockMinimo + "]";
	}

	public void disminuirStock(Integer cantidad) {
		this.stock -= cantidad;
	}

	public boolean validarStock(Integer cantidad) {
		return this.stock.compareTo(cantidad) > -1;
	}

}
