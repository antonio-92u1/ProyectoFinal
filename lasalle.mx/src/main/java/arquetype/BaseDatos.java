package arquetype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

public class BaseDatos {
	private Connection connect = null;

	private static BaseDatos instancia;

	private BaseDatos() {
		try {
			connect = DriverManager.getConnection("jdbc:sqlite:BaseDatosPF.db");
			System.out.println("BD en: " + new java.io.File("BaseDatosPF.db").getAbsolutePath());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static BaseDatos getInstancia() {
		if (instancia == null) {
			instancia = new BaseDatos();
		}
		return instancia;
	}

	public Connection getConexion() {
		return connect;
	}
	
	public int obtenerIdAlergeno(String nombre) {
	    try {
	        PreparedStatement ps = connect.prepareStatement(
	            "SELECT idAlergeno FROM alergeno WHERE LOWER(nombre) = LOWER(?)");
	        ps.setString(1, nombre);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            int id = rs.getInt("idAlergeno");
	            rs.close(); ps.close();
	            return id;
	        }
	        rs.close(); ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return -1;
	}

	public int obtenerIdAlergiaComida(String nombre) {
	    try {
	        PreparedStatement ps = connect.prepareStatement(
	            "SELECT idAlergia FROM alergiaComida WHERE LOWER(nombre) = LOWER(?)");
	        ps.setString(1, nombre);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            int id = rs.getInt("idAlergia");
	            rs.close(); ps.close();
	            return id;
	        }
	        rs.close(); ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return -1;
	}

	public boolean clienteEsAlergicoAIngrediente(int idCliente, String alergeno) {
		try {
			String sql = "SELECT COUNT(*) FROM clienteAlergenos ca JOIN alergeno a ON ca.idAlergeno = a.idAlergeno WHERE ca.idCliente = ? AND LOWER(a.nombre) = LOWER(?)";
			PreparedStatement consulta = connect.prepareStatement(sql);
			consulta.setInt(1, idCliente);
			consulta.setString(2, alergeno);
			ResultSet resultSet = consulta.executeQuery();
			resultSet.next();
			boolean resultado;
			if (resultSet.getInt(1) > 0) {
				resultado = true;
			} else {
				resultado = false;
			}
			resultSet.close();
			consulta.close();
			return resultado;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	//Cambio
	public ArrayList<String> detectarAlergiasProducto(int idCliente, InterSushiEnsalda producto) {
	    return compararAlergenos(idCliente, producto.getAlergenos());
	}

	public ArrayList<String> detectarAlergiasProducto(int idCliente, InterComida producto) {
	    return compararAlergenos(idCliente, producto.getAlergenos());
	}
	
	public ArrayList<String> detectarAlergiasProducto(int idCliente, InterPan producto) {
	    return compararAlergenos(idCliente, producto.getAlergenos());
	}
	
	public ArrayList<String> detectarAlergiasProducto(int idCliente, InterPostre producto) {
	    return compararAlergenos(idCliente, producto.getAlergenos());
	}
	
	public ArrayList<String> detectarAlergiasProducto(int idCliente, InterBebida producto) {
	    return compararAlergenos(idCliente, producto.getAlergenos());
	}

	private ArrayList<String> compararAlergenos(int idCliente, ArrayList<String> alergiasProducto) {
	    ArrayList<String> alertas = new ArrayList<>();
	    ArrayList<String> alergiasCliente = obtenerAlergenosCliente(idCliente);

	    for (String alergiaProducto : alergiasProducto) {
	        for (String alergiaCliente : alergiasCliente) {
	            if (alergiaProducto.equalsIgnoreCase(alergiaCliente)) {
	                alertas.add(alergiaProducto);
	            }
	        }
	    }

	    return alertas;
	}

	public int crearPedido(int idCliente, double total, String estado) {
		int idPedido = -1;
		try {
			String sql = "INSERT INTO pedido (idCliente, total, estado, fecha) VALUES (?, ?, ?, datetime('now'))";
			PreparedStatement consulta = connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			consulta.setInt(1, idCliente);
			consulta.setDouble(2, total);
			consulta.setString(3, estado);
			consulta.executeUpdate();
			ResultSet keys = consulta.getGeneratedKeys();
			if (keys.next()) {
				idPedido = keys.getInt(1);
			}
			keys.close();
			consulta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idPedido;
	}

	public void agregarDetallePedido(int idPedido, String productoBase, String descripcionFinal, String extras,
			double precioBase, double precioFinal, int cantidad) {
		try {
			String sql = "INSERT INTO detallePedido (idPedido, productoBase, descripcionFinal, extras, precioBase, precioFinal, cantidad) VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement consulta = connect.prepareStatement(sql);
			consulta.setInt(1, idPedido);
			consulta.setString(2, productoBase);
			consulta.setString(3, descripcionFinal);
			consulta.setString(4, extras);
			consulta.setDouble(5, precioBase);
			consulta.setDouble(6, precioFinal);
			consulta.setInt(7, cantidad);
			consulta.executeUpdate();
			consulta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Clientes
	public void registrarCliente(String nombre) {
		try {
			String sql = "INSERT INTO clientes(nombre) VALUES (?)";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, nombre);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int obtenerIdCliente(String nombre) {
		try {
			String sql = "SELECT idCliente FROM clientes WHERE nombre = ?";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, nombre);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("idCliente");
				rs.close();
				ps.close();
				return id;
			}

			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}

	public ArrayList<String> obtenerAlergenosCliente(int idCliente) {
		ArrayList<String> lista = new ArrayList<>();

		try {
			String sql = """
					    SELECT a.nombre
					    FROM clienteAlergenos ca
					    INNER JOIN alergeno a ON ca.idAlergeno = a.idAlergeno
					    WHERE ca.idCliente = ?
					""";

			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setInt(1, idCliente);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				lista.add(rs.getString("nombre"));
			}

			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	public ArrayList<String> obtenerAlergiasComidaCliente(int idCliente) {
		ArrayList<String> lista = new ArrayList<>();

		try {
			String sql = "SELECT ac.nombre FROM clienteAlergiaComida cac INNER JOIN alergiaComida ac ON cac.idAlergia = ac.idAlergia WHERE cac.idCliente = ? ";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setInt(1, idCliente);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				lista.add(rs.getString("nombre"));
			}

			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	// Alergias
	public void agregarAlergenoCliente(int idCliente, int idAlergeno) {
		try {
			String sql = "INSERT INTO clienteAlergenos(idCliente,idAlergeno) VALUES (?, ?)";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setInt(1, idCliente);
			ps.setInt(2, idAlergeno);

			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void agregarAlergiaComidaCliente(int idCliente, int idAlergia) {
		try {
			String sql = "INSERT INTO clienteAlergiaComida(idCliente, idAlergia) VALUES (?, ?)";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setInt(1, idCliente);
			ps.setInt(2, idAlergia);

			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarAlergenosCliente(int idCliente) {
		try {
			String sql = "DELETE FROM clienteAlergenos WHERE idCliente = ?";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setInt(1, idCliente);

			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// Consultas
	
	public ArrayList<Pedido> obtenerPedidosCliente(int idCliente){
		ArrayList<Pedido> lista = new ArrayList<>();
		try {
			String sql = "SELECT * FROM pedido WHERE idCliente = ?";
			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setInt(1, idCliente);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
	            Pedido pedido = new Pedido(rs.getInt("idPedido"),rs.getInt("idCliente"),rs.getDouble("total"),rs.getString("estado"),rs.getString("fecha"));
	            lista.add(pedido);
	        }
	        rs.close();
	        ps.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public ArrayList<DetallePedido> obtenerDetallesPedido(int idPedido) {
	    ArrayList<DetallePedido> lista = new ArrayList<>();
	    try {
	        String sql = "SELECT * FROM detallePedido WHERE idPedido = ?";
	        PreparedStatement ps = connect.prepareStatement(sql);
	        ps.setInt(1, idPedido);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            DetallePedido detalle = new DetallePedido(
	                rs.getInt("idDetalle"),
	                rs.getInt("idPedido"),
	                rs.getString("productoBase"),
	                rs.getString("descripcionFinal"),
	                rs.getString("extras"),
	                rs.getDouble("precioBase"),
	                rs.getDouble("precioFinal"),
	                rs.getInt("cantidad"));
	            lista.add(detalle);
	        }
	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return lista;
	}


	public void actualizarEstadoPedido(int idPedido, String nuevoEstado) {
	    try {
	        String sql = "UPDATE pedido SET estado = ? WHERE idPedido = ?";
	        PreparedStatement ps = connect.prepareStatement(sql);
	        ps.setString(1, nuevoEstado);
	        ps.setInt(2, idPedido);
	        ps.executeUpdate();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	// Reportes
	
	public double obtenerTotalVentas() {
	    double totalVentas = 0;

	    try {
	        String sql = "SELECT SUM(total) AS totalVentas FROM pedido";
	        PreparedStatement ps = connect.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            totalVentas = rs.getDouble("totalVentas");
	        }
	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return totalVentas;
	}


	public int contarPedidosPorEstado(String estado) {
	    int cantidad = 0;
	    try {
	        String sql = "SELECT COUNT(*) AS total FROM pedido WHERE estado = ?";
	        PreparedStatement ps = connect.prepareStatement(sql);
	        ps.setString(1, estado);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            cantidad = rs.getInt("total");
	        }
	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return cantidad;
	}


	public ArrayList<Pedido> obtenerTodosLosPedidos() {
	    ArrayList<Pedido> lista = new ArrayList<>();

	    try {
	        String sql = "SELECT * FROM pedido ORDER BY fecha DESC";
	        PreparedStatement ps = connect.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            Pedido pedido = new Pedido(
	                rs.getInt("idPedido"),
	                rs.getInt("idCliente"),
	                rs.getDouble("total"),
	                rs.getString("estado"),
	                rs.getString("fecha"));
	            lista.add(pedido);
	        }
	        rs.close();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return lista;
	}
}
