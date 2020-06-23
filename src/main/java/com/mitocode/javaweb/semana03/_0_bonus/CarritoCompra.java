package com.mitocode.javaweb.semana03._0_bonus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

	private List<ProductoCompra> productos;
	private Double montoTotal;
	private LocalDateTime fechaTiempoCreacion;
	// se utiliza para la impresion de prodcutos
	private int indice;

	public CarritoCompra() {
		this.productos = new ArrayList<ProductoCompra>();
		this.montoTotal = 0.0;
		this.fechaTiempoCreacion = LocalDateTime.now();
	}

	public List<ProductoCompra> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoCompra> productos) {
		this.productos = productos;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public LocalDateTime getFechaTiempoCreacion() {
		return fechaTiempoCreacion;
	}

	public void setFechaTiempoCreacion(LocalDateTime fechaTiempoCreacion) {
		this.fechaTiempoCreacion = fechaTiempoCreacion;
	}

	public void mostrarCarrito() {
		if (productos.isEmpty()) {
			System.out.println("Carrito vacío, agregue productos.");
		} else {
			indice = 1;
			productos.forEach(producto -> System.out
					.println(indice++ + ". (" + producto.getCantidad() + ") " + producto.getNombre()));
		}
	}

	public void agregarProducto(ProductoTienda productoTienda, Integer cantidad) {
		if (productoTienda.validarStock(cantidad)) {
			productoTienda.disminuirStock(cantidad);
			productos.add(new ProductoCompra(productoTienda.getIdProducto(), productoTienda.getNombre(),
					productoTienda.getPrecioVenta(), cantidad));

			System.out.println("Producto agrega con éxito. Tiene " + productos.size() + " producto(s) en el carrito");
		} else {
			System.out.println("Stock insuficiente, ingrese una cantidad válida.");
		}
	}

}
