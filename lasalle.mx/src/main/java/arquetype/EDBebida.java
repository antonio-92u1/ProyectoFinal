package arquetype;

import java.util.ArrayList;

public abstract class EDBebida implements InterBebida {
	protected InterBebida bebida;

	public EDBebida(InterBebida bebida) {
		super();
		this.bebida = bebida;
	}

	@Override
	public int getId() {
		return bebida.getId();
	}

	@Override
	public String getNombre() {
		return bebida.getNombre();
	}

	@Override
	public double getPrecio() {
		return bebida.getPrecio();
	}

	@Override
	public ArrayList<String> getIngredientes() {
		return bebida.getIngredientes();
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return bebida.getAlergenos();
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Producto: " + getNombre());
		System.out.println("Precio: $" + getPrecio());
		System.out.println("Sellos: " + getIngredientes());
		System.out.println("Alérgenos: " + getAlergenos());
		System.out.println("Extras: "+ getExtras());
	}
}
