package arquetype;

public class Pedido {
	private int idPedido;
    private int idCliente;
    private double total;
    private String estado;
    private String fecha;
    
    public Pedido(int idPedido, int idCliente, double total, String estado, String fecha) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.total = total;
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }
}
