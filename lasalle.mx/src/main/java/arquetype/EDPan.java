package arquetype;

import java.util.ArrayList;

public abstract class EDPan implements InterPan {

	protected InterPan pan;

	public EDPan(InterPan pan) {
		this.pan = pan;
	}

	@Override
	public int getId() {
		return pan.getId();
	}

	@Override
	public String getNombre() {
		return pan.getNombre();
	}

	@Override
	public double getPrecio() {
		return pan.getPrecio();
	}

	@Override
	public ArrayList<String> getIngredientes() {
		return pan.getIngredientes();
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return pan.getAlergenos();
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