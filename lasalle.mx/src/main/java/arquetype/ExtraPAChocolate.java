package arquetype;

import java.util.ArrayList;

public class ExtraPAChocolate extends EDPan {

	public ExtraPAChocolate(InterPan pan) {
		super(pan);
	}

	@Override
	public int getId() {
		return pan.getId();
	}

	@Override
	public String getNombre() {
		return pan.getNombre() + " + chocolate";
	}

	@Override
	public double getPrecio() {
		return pan.getPrecio() + 12;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(pan.getIngredientes());
		if (!ingredientes.contains("chocolate")) {
			ingredientes.add("chocolate");
		}
		return ingredientes;
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return new ArrayList<>(pan.getAlergenos());
	}
	@Override
	public double getPrecioInicial() {
		// TODO Auto-generated method stub
		return pan.getPrecioInicial();
	}
	
    @Override
    public String nombreBase() {
    	// TODO Auto-generated method stub
        return pan.nombreBase();
    }
    
    @Override
	public ArrayList<String> getExtras() {
		ArrayList<String> extras = new ArrayList<>(pan.getExtras());
		if (!extras.contains("chocolate")) {
			extras.add("chocolate");
		}
		return extras;
	}
}
