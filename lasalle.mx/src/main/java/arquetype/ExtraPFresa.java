package arquetype;

import java.util.ArrayList;

public class ExtraPFresa extends EDPostre {

	public ExtraPFresa(InterPostre postre) {
		super(postre);
	}

	@Override
	public int getId() {
		return postre.getId();
	}

	@Override
	public String getNombre() {
		return postre.getNombre() + " + Fresa";
	}

	@Override
	public double getPrecio() {
		return postre.getPrecio() + 12;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(postre.getIngredientes());
		if (!ingredientes.contains("Fresa")) {
			ingredientes.add("Fresa");
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
		return postre.getCalorias() + 20;
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
   		if (!extras.contains("fresa")) {
   			extras.add("fresa");
   		}
   		return extras;
   	}

}
