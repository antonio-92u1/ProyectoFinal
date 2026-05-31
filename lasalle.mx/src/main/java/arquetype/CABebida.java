package arquetype;

import java.util.ArrayList;

public class CABebida extends Alimento implements InterBebida {
	private boolean extra;

	public CABebida(int id, String nombre, double precio, ArrayList<String> sellos, ArrayList<String> alergenos, boolean extra) {
		super(id, nombre, precio, sellos, alergenos);
		this.extra=extra;
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
	
	@Override
	public boolean isExtra() {
		return this.extra;
	}
	
	@Override
	public ArrayList<String> getIngredientes() {
		// TODO Auto-generated method stub
		return super.getIngredientes();
	}
	
	@Override
	public ArrayList<String> getAlergenos() {
		// TODO Auto-generated method stub
		return super.getAlergenos();
	}
	
	

}
