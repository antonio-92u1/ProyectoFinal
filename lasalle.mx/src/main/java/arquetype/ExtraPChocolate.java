package arquetype;

import java.util.ArrayList;

public class ExtraPChocolate extends EDPostre {

	public ExtraPChocolate(InterPostre postre) {
		super(postre);
	}

	@Override
	public int getId() {
		return postre.getId();
	}

	@Override
	public String getNombre() {
		return postre.getNombre() + " + chococlate";
	}

	@Override
	public double getPrecio() {
		return postre.getPrecio() + 12;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(postre.getIngredientes());
		if (!ingredientes.contains("chocolate")) {
			ingredientes.add("chocolate");
		}
		return ingredientes;
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return new ArrayList<>(postre.getAlergenos());
	}

	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return postre.getCalorias() + 40;
	}
	@Override
	public double getPrecioInicial() {
		// TODO Auto-generated method stub
		return postre.getPrecioInicial();
	}
	
    @Override
    public String nombreBase() {
    	// TODO Auto-generated method stub
        return postre.nombreBase();
    }
    
    @Override
	public ArrayList<String> getExtras() {
		ArrayList<String> extras = new ArrayList<>(postre.getExtras());
		if (!extras.contains("chocolate")) {
			extras.add("chocolate");
		}
		return extras;
	}

}
