package com.mitocode.javaweb.semana03._0_bonus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tienda {

	private String idTienda;
	private String nombreTienda;
	private List<ProductoTienda> productos;
	private List<Operacion> operaciones;
	// se utiliza para la impresion de prodcutos
	private int indice;

	public Tienda(String idTienda, String nombreTienda) {
		this.idTienda = idTienda;
		this.nombreTienda = nombreTienda;
		productos = new ArrayList<ProductoTienda>();
		operaciones = new ArrayList<Operacion>();
	}

	public String getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(String idTienda) {
		this.idTienda = idTienda;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public List<ProductoTienda> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoTienda> productos) {
		this.productos = productos;
	}

	public List<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public void imprimirProductos() {
		indice = 1;
		productos.forEach(producto -> System.out.println(indice++ + ". (" + producto.getStock() + ") "
				+ producto.getNombre() + " - " + producto.getPrecioVenta()));
	}

	public void agregarOperacion(CarritoCompra carrito) {
		if (carrito.getProductos().isEmpty()) {
			System.out.println("Carrito vacío, debe agregar productos primero.");
		} else {
			Operacion operacion = new Operacion(carrito.getProductos());
			operaciones.add(operacion);
			System.out.println("Compra realizada con éxito.");
		}
	}

	public void mostrarProductosMenorPrecio(int cantidadProductosAMostrar) {
		productos.stream().sorted((p1, p2) -> p1.getPrecioVenta().compareTo(p2.getPrecioVenta()))
				.limit(cantidadProductosAMostrar)
				.forEach(producto -> System.out.println("(" + producto.getPrecioVenta() + ") " + producto.getNombre()));
	}

	public void mostrarProductosMasVendidos(int cantidadProductosAMostrar) {
		// Un map key = Nombre producto / value = Suma de cantidades compradas
		Map<String, Integer> resultado = operaciones.stream() // Stream<Operacion>
				.flatMap(operacion -> operacion.getProductos().stream()) // Stream<List<ProductoCompra>>
				.collect(Collectors.groupingBy(ProductoCompra::getNombre, // nombre de prodcuto
						Collectors.summingInt(ProductoCompra::getCantidad) // suma de cantidad
				));
		resultado.entrySet().stream() // Stream<EntrySet<String,Integer>>
				.sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())) // ordenamiento inverso
				.limit(cantidadProductosAMostrar) // solo los 3 primeros
				.forEach(entry -> System.out.println("(" + entry.getValue() + ") " + entry.getKey())); // (cantidad)
																										// nombre
	}
}
