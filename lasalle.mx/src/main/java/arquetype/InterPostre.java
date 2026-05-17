package arquetype;

import java.util.ArrayList;

public interface InterPostre {
	public int getId();

	public String getNombre();

	public double getPrecio();

	public ArrayList<String> getIngredientes();

	public ArrayList<String> getAlergenos();

	public int getCalorias();

	public void mostrarInfo();
	
	public double getPrecioInicial();
	
	public String nombreBase();
	
	public ArrayList<String> getExtras();
}
