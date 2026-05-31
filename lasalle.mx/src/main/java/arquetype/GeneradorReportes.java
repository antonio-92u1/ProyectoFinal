package arquetype;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeneradorReportes {
	private BaseDatos bd;

	public GeneradorReportes() {
		bd = BaseDatos.getInstancia();
	}

	public void generarReporteGeneral() {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter("reporte_pedidos.txt"));
			writer.println("> > Reporte General < <");
			writer.println();
			writer.println("Total de ventas: $" + bd.obtenerTotalVentas());
			writer.println("Pedidos pendientes: " + bd.contarPedidosPorEstado("Pendiente"));
			writer.println("Pedidos en preparación: " + bd.contarPedidosPorEstado("En preparación"));
			writer.println("Pedidos entregados: " + bd.contarPedidosPorEstado("Entregado"));
			writer.println();
			writer.println("> > Pedidos Registrados < <");
			writer.println();
			ArrayList<Pedido> pedidos = bd.obtenerTodosLosPedidos();
			if (pedidos.isEmpty()) {
				writer.println("No hay pedidos registrados.");
			}
			for (Pedido pedido : pedidos) {
				writer.println("___________");
				writer.println("Pedido #" + pedido.getIdPedido());
				writer.println("Cliente ID: " + pedido.getIdCliente());
				writer.println("Fecha: " + pedido.getFecha());
				writer.println("Estado: " + pedido.getEstado());
				writer.println("Total: $" + pedido.getTotal());
				writer.println();
				ArrayList<DetallePedido> detalles = bd.obtenerDetallesPedido(pedido.getIdPedido());
				writer.println("> Detalle del Pedido:");
				if (detalles.isEmpty()) {
					writer.println("Sin detalles registrados.");
				}
				for (DetallePedido detalle : detalles) {
					writer.println(":::: " + detalle.getDescripcionFinal());
					writer.println("  Producto base: " + detalle.getProductoBase());
					writer.println("  Extras: " + detalle.getExtras());
					writer.println("  Cantidad: " + detalle.getCantidad());
					writer.println("  Precio final: $" + detalle.getPrecioFinal());
				}

				writer.println();
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Error al generar el reporte.");
			e.printStackTrace();
		}
	}
}
