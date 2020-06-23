package com.mitocode.javaweb.semana03._0_bonus;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramaBonus {

	private Tienda tienda;
	private Optional<CarritoCompra> carrito;

	public ProgramaBonus() {
		this.tienda = new Tienda("1", "MitoCode");
		this.carrito = Optional.empty();

		cargarProductos();
	}

	public static void main(String[] args) {
		ProgramaBonus programa = new ProgramaBonus();

		System.out
				.println("====== Bienvenido a tu Tienda Virtual " + programa.getTienda().getNombreTienda() + " ======");
		programa.iniciarTienda();
	}

	public void iniciarTienda() {
		Scanner scanner = new Scanner(System.in);
		int opcion = -1;
		boolean salir = Boolean.FALSE;

		do {
			imprimirMenu();
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1: // agregar producto
				System.out.println("Seleccione el producto que desea: ");
				tienda.imprimirProductos();
				opcion = scanner.nextInt(); // es el indice de la lista productos

				if (opcion < 1 || opcion > tienda.getProductos().size()) {
					System.out.println("Producto ingresado inválido");
				} else {
					System.out.print("Ingrese cantidad a comprar: ");
					int cantidad = scanner.nextInt();

					if (!carrito.isPresent()) {
						carrito = Optional.of(new CarritoCompra());
					}
					// se disminuye en 1 la opción, dado que el indice en una lista inicia en 0
					// hasta (length() - 1)
					carrito.get().agregarProducto(tienda.getProductos().get(opcion - 1), cantidad);
				}
				break;
			case 2: // ver carrito
				if (carrito.isPresent()) {
					carrito.ifPresent(c -> c.mostrarCarrito());
				} else {
					System.out.println("Debe agregar productos al carrito");
				}
				break;
			case 3: // finalizar compra
				if (carrito.isPresent()) {
					carrito.ifPresent(c -> tienda.agregarOperacion(c));
					carrito = Optional.empty();
				} else {
					System.out.println("Debe agregar productos al carrito");
				}
				break;
			case 4: // reporte 3 productos de menor precio
				int cantidadProductosMenorPrecio = 3;
				tienda.mostrarProductosMenorPrecio(cantidadProductosMenorPrecio);
				break;
			case 5: // reporte 3 productos mas vendidos
				int cantidadProductosMasVendidos = 3;
				tienda.mostrarProductosMasVendidos(cantidadProductosMasVendidos);
				break;
			case 6: // salir
				System.out.println(
						"====== Gracias por visitar tu Tienda Virtual " + tienda.getNombreTienda() + " ======");
				tienda = null;
				carrito = null;

				salir = Boolean.TRUE;
				break;
			default:
				System.out.println("Ingrese una opción válida");
			}
		} while (!salir);

		scanner.close();
	}

	public void cargarProductos() {
		Stream<String> fileLines = null;

		try {
			fileLines = Files.lines(Paths.get("src/main/resources/bonus_productos.txt"));
			List<ProductoTienda> productosTienda = fileLines.map(linea -> linea.split(",")) // Stream<String[]>
					.filter(array -> array.length == 6) // Stream<String[]>
					.map(ProductoTienda::new) // String<ProductoTienda>
					.collect(Collectors.toList());

			tienda.setProductos(productosTienda);
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
	}

	public void imprimirMenu() {
		System.out.println("===================================");
		System.out.println("1. Añadir producto a Carrito");
		System.out.println("2. Ver Detalle de Carrito");
		System.out.println("3. Finalizar compra");
		System.out.println("4. Reporte: Los 3 productos de menor precio");
		System.out.println("5. Reporte: Los 3 productos más vendidos");
		System.out.println("6. Salir");
	}

	public Tienda getTienda() {
		return tienda;
	}

	public Optional<CarritoCompra> getCarrito() {
		return carrito;
	}

	public void setCarrito(Optional<CarritoCompra> carrito) {
		this.carrito = carrito;
	}

}
