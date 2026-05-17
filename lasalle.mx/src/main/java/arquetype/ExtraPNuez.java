package arquetype;

import java.util.ArrayList;

public class ExtraPNuez extends EDPostre {

	public ExtraPNuez(InterPostre postre) {
		super(postre);
	}

	@Override
	public int getId() {
		return postre.getId();
	}

	@Override
	public String getNombre() {
		return postre.getNombre() + " + nuez";
	}

	@Override
	public double getPrecio() {
		return postre.getPrecio() + 12;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(postre.getIngredientes());
		if (!ingredientes.contains("nuez")) {
			ingredientes.add("nuez");
		}
		return ingredientes;
	}

	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return postre.getCalorias() + 15;
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return new ArrayList<>(postre.getAlergenos());
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
   		if (!extras.contains("nuez")) {
   			extras.add("nuez");
   		}
   		return extras;
   	}

}
