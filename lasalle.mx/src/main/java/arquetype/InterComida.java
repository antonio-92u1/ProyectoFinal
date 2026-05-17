package arquetype;

import java.util.ArrayList;

public interface InterComida {
	public int getId();

	public String getNombre();

	public double getPrecio();

	public ArrayList<String> getIngredientes();

	public ArrayList<String> getAlergenos();

	public void mostrarInfo();

	public double getPrecioInicial();
	
	public String nombreBase();
	
	public ArrayList<String> getExtras();
}
