package arquetype;

import java.util.ArrayList;

public abstract class EDComida implements InterComida {

	protected InterComida comida;

	public EDComida(InterComida comida) {
		this.comida = comida;
	}

	@Override
	public int getId() {
		return comida.getId();
	}

	@Override
	public String getNombre() {
		return comida.getNombre();
	}

	@Override
	public double getPrecio() {
		return comida.getPrecio();
	}

	@Override
	public ArrayList<String> getIngredientes() {
		return comida.getIngredientes();
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return comida.getAlergenos();
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Producto: " + getNombre());
		System.out.println("Precio: $" + getPrecio());
		System.out.println("Ingredientes: " + getIngredientes());
		System.out.println("Alérgenos: " + getAlergenos());
		System.out.println("Extras: "+ getExtras());
	}
}