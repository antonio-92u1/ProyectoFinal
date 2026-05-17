package arquetype;

import java.util.ArrayList;

public abstract class EDSushiEnsalada implements InterSushiEnsalda {

	protected InterSushiEnsalda sushi;

	public EDSushiEnsalada(InterSushiEnsalda sushi) {
		this.sushi = sushi;
	}

	@Override
	public int getId() {
		return sushi.getId();
	}

	@Override
	public String getNombre() {
		return sushi.getNombre();
	}

	@Override
	public double getPrecio() {
		return sushi.getPrecio();
	}

	@Override
	public ArrayList<String> getIngredientes() {
		return sushi.getIngredientes();
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return sushi.getAlergenos();
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