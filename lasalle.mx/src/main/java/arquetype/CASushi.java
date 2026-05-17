package arquetype;

import java.util.ArrayList;

public class CASushi extends Alimento implements InterSushiEnsalda {

	public CASushi(int id, String nombre, double precio, ArrayList<String> ingredientes, ArrayList<String> alergenos) {
		super(id, nombre, precio, ingredientes, alergenos);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getPrecioInicial() {
		// TODO Auto-generated method stub
		return this.getPrecio();
	}
	
    @Override
    public String nombreBase() {
    	// TODO Auto-generated method stub
        return this.getNombre();
    }
    
    @Override
	public ArrayList<String> getExtras() {
		return new ArrayList<>();
	}
}
