package arquetype;

import java.util.ArrayList;

public abstract class EDPostre implements InterPostre {
	protected InterPostre postre;

	public EDPostre(InterPostre postre) {
		super();
		this.postre = postre;
	}

	@Override
	public int getId() {
		return postre.getId();
	}

	@Override
	public String getNombre() {
		return postre.getNombre();
	}

	@Override
	public double getPrecio() {
		return postre.getPrecio();
	}

	@Override
	public ArrayList<String> getIngredientes() {
		return postre.getIngredientes();
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return postre.getAlergenos();
	}

	@Override
	public int getCalorias() {
		return postre.getCalorias();
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
