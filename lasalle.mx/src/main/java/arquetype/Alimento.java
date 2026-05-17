package arquetype;

import java.util.ArrayList;

public abstract class Alimento {
	protected String nombre;
	protected double precio;
	protected ArrayList<String> ingredientes;
	protected ArrayList<String> alergenos;
	protected int id;

	public Alimento(int id, String nombre, double precio, ArrayList<String> ingredientes, ArrayList<String> alergenos) {
		this.nombre = nombre;
		this.precio = precio;
		this.ingredientes = ingredientes;
		this.alergenos = alergenos;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public ArrayList<String> getAlergenos() {
		return alergenos;
	}

	public void mostrarInfo() {
		System.out.println("Producto: " + nombre);
		System.out.println("Precio: $" + precio);
		System.out.println("Ingredientes: " + ingredientes);
		System.out.println("Alérgenos: " + alergenos);
	}
}
