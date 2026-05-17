package arquetype;

public class DetallePedido {
	private int idDetalle;
    private int idPedido;
    private String productoBase;
    private String descripcionFinal;
    private String extras;
    private double precioBase;
    private double precioFinal;
    private int cantidad;
    
    public DetallePedido(
            int idDetalle,
            int idPedido,
            String productoBase,
            String descripcionFinal,
            String extras,
            double precioBase,
            double precioFinal,
            int cantidad) {

        this.idDetalle = idDetalle;
        this.idPedido = idPedido;
        this.productoBase = productoBase;
        this.descripcionFinal = descripcionFinal;
        this.extras = extras;
        this.precioBase = precioBase;
        this.precioFinal = precioFinal;
        this.cantidad = cantidad;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getProductoBase() {
        return productoBase;
    }

    public String getDescripcionFinal() {
        return descripcionFinal;
    }

    public String getExtras() {
        return extras;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public int getCantidad() {
        return cantidad;
    }
}
