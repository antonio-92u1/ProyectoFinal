package arquetype;

import java.util.ArrayList;

public interface InterBebida {
	public int getId();

	public String getNombre();

	public double getPrecio();

	public ArrayList<String> getIngredientes();

	public ArrayList<String> getAlergenos();

	public void mostrarInfo();

	public double getPrecioInicial();
	
	public String nombreBase();
	
	public ArrayList<String> getExtras();
	
	public boolean isExtra();
}
