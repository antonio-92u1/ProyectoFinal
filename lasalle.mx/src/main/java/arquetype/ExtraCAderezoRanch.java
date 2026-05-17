package arquetype;

import java.util.ArrayList;

public class ExtraCAderezoRanch extends EDComida {

	public ExtraCAderezoRanch(InterComida comida) {
		super(comida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		return comida.getId();
	}

	@Override
	public String getNombre() {
		return comida.getNombre() + " + aderezo Ranch";
	}

	@Override
	public double getPrecio() {
		return comida.getPrecio() + 7;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(comida.getIngredientes());
		if (!ingredientes.contains("aderezo Ranch")) {
			ingredientes.add("aderezo Ranch");
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
		if (!extras.contains("aderezo ranch")) {
			extras.add("aderezo ranch");
		}
		return extras;
	}

}
