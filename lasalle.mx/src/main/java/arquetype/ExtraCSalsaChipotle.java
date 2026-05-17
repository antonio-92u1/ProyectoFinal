package arquetype;

import java.util.ArrayList;

public class ExtraCSalsaChipotle extends EDComida {

	public ExtraCSalsaChipotle(InterComida comida) {
		super(comida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		return comida.getId();
	}

	@Override
	public String getNombre() {
		return comida.getNombre() + " + salsa chipotle";
	}

	@Override
	public double getPrecio() {
		return comida.getPrecio() + 7;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(comida.getIngredientes());
		if (!ingredientes.contains("salsa chipotle")) {
			ingredientes.add("salsa chipotle");
		}
		return ingredientes;
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return new ArrayList<>(comida.getAlergenos());
	}
	@Override
	public double getPrecioInicial() {
		// TODO Auto-generated method stub
		return comida.getPrecioInicial();
	}
	
    @Override
    public String nombreBase() {
    	// TODO Auto-generated method stub
        return comida.nombreBase();
    }
    
    @Override
	public ArrayList<String> getExtras() {
		ArrayList<String> extras = new ArrayList<>(comida.getExtras());
		if (!extras.contains("salsa chipotle")) {
			extras.add("salsa chipotle");
		}
		return extras;
	}
}
