package arquetype;

import java.util.ArrayList;

public class CAPostre extends Alimento implements InterPostre {

	private int calorias;

	public CAPostre(int id, String nombre, int cal, double precio, ArrayList<String> ingredientes,
			ArrayList<String> alergenos) {
		super(id, nombre, precio, ingredientes, alergenos);
		this.calorias = cal;
	}

	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return calorias;
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
