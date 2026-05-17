package arquetype;

import java.util.ArrayList;

public class Carrito {
	 private ArrayList<Object> productos;
	    private BaseDatos bd;
	    public Carrito(BaseDatos bd) {
	        this.productos = new ArrayList<>();
	        this.bd = bd;
	    }

	    public void agregarProducto(Object producto) {
	        productos.add(producto);
	        System.out.println("Producto agregado : "+Name(producto));
	    }
	    public void eliminarProducto(int i) {
	        if (i <= 0 || i > productos.size()) {
	        	System.out.println("Número de alimento inexistente");
	        } else {
	        	Object fuera = productos.remove(i);
	            System.out.println("El producto " + Name(fuera)+" se ha quitado de tu carro ");
	        }
	    }
	    public double calcularTotal() {
	        double total = 0;
	        for (int i = 0; i < productos.size(); i++) {
	            total += precio(productos.get(i));
	        }
	        return total;
	    }
	    
	    public int confirmarPedido(int idCliente, String estado) {
	        if (productos.isEmpty()) {
	            System.out.println("Carrito sin productos");
	            return -1;
	        }
	        double total = calcularTotal();
	        int idPedido = bd.crearPedido(idCliente, total, estado);
	        if (idPedido == -1) {
	            System.out.println("Error de guardado en base de datos");
	            return -1;
	        }
	        for (int i = 0; i < productos.size(); i++) {
	            Object prod = productos.get(i);
	            String nombreBase = Name(prod);
	            String extrasStr = extruss(prod);
	            String descripcionFinal = nombreBase;
	            if (!extrasStr.equals("[]") && !extrasStr.equals("Ninguno")) {
	                descripcionFinal = nombreBase + " con " + extrasStr.replace("[", "").replace("]", "");
	            }
	            double precioSinextras = precio0(prod); 
	            double precioFinal = precio(prod);   
	            bd.agregarDetallePedido(idPedido,nombreBase,descripcionFinal,extrasStr,precioSinextras,precioFinal,1);
	        }
	        productos.clear();
	        System.out.println("Tu pedido es: " + idPedido + " confirmado. Total: $" + total);
	        return idPedido;
	    }
	    private String Name(Object o) {
	        if (o instanceof Alimento)
	        	return ((Alimento) o).getNombre();
	        if (o instanceof InterBebida) 
	        	return ((InterBebida) o).getNombre();
	        if (o instanceof InterPan)
	        	return ((InterPan) o).getNombre();
	        if (o instanceof InterComida) 
	        	return ((InterComida) o).getNombre();
	        if (o instanceof InterPostre) 
	        	return ((InterPostre) o).getNombre();
	        if (o instanceof InterSushiEnsalda) 
	        	return ((InterSushiEnsalda) o).getNombre();
	        else
	        	return "Desconocido";
	    }
	    private double precio(Object o) {
	        if (o instanceof Alimento) 
	        	return ((Alimento) o).getPrecio();
	        if (o instanceof InterBebida) 
	        	return ((InterBebida) o).getPrecio();
	        if (o instanceof InterPan) 
	        	return ((InterPan) o).getPrecio();
	        if (o instanceof InterComida) 
	        	return ((InterComida) o).getPrecio();
	        if (o instanceof InterPostre) 
	        	return ((InterPostre) o).getPrecio();
	        if (o instanceof InterSushiEnsalda) 
	        	return ((InterSushiEnsalda) o).getPrecio();
	        else
	        	return 0.0;
	    }
	    private double precio0(Object o) {
	        if (o instanceof Alimento) 
	        	return ((Alimento) o).getPrecio();
	        if (o instanceof InterBebida) 
	        	return ((InterBebida) o).getPrecioInicial();
	        if (o instanceof InterPan) 
	        	return ((InterPan) o).getPrecioInicial();
	        if (o instanceof InterComida) 
	        	return ((InterComida) o).getPrecioInicial();
	        if (o instanceof InterPostre) 
	        	return ((InterPostre) o).getPrecioInicial();
	        if (o instanceof InterSushiEnsalda) 
	        	return ((InterSushiEnsalda) o).getPrecioInicial();
	        else
	        	return 0.0;
	    }
	    private String extruss(Object o) {
	        if (o instanceof InterBebida) 
	        	return ((InterBebida) o).getExtras().toString();
	        if (o instanceof InterPan) 
	        	return ((InterPan) o).getExtras().toString();
	        if (o instanceof InterComida) 
	        	return ((InterComida) o).getExtras().toString();
	        if (o instanceof InterPostre) 
	        	return ((InterPostre) o).getExtras().toString();
	        if (o instanceof InterSushiEnsalda) 
	        	return ((InterSushiEnsalda) o).getExtras().toString();
	        else
	        	return "Ninguno";
	    }
	    public void verCarrito() {
	        if (productos.isEmpty()) {
	            System.out.println("Carrito vacío");
	            return;
	        }
	        System.out.println("Carrito:");
	        for (int i = 0; i < productos.size(); i++) {
	            System.out.println(i + ". " + Name(productos.get(i)) + " - $" + precio(productos.get(i)));
	        }
	        System.out.println(" Total: $" + calcularTotal());
	    }
}
