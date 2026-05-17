package arquetype;

import java.util.ArrayList;

public class ExtraPHelado extends EDPostre {

	public ExtraPHelado(InterPostre postre) {
		super(postre);
	}

	@Override
	public int getId() {
		return postre.getId();
	}

	@Override
	public String getNombre() {
		return postre.getNombre() + " + Helado";
	}

	@Override
	public double getPrecio() {
		return postre.getPrecio() + 12;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(postre.getIngredientes());
		if (!ingredientes.contains("Helado")) {
			ingredientes.add("Helado");
		}
		return ingredientes;
	}

	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return postre.getCalorias() + 60;
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
   		if (!extras.contains("helado")) {
   			extras.add("helado");
   		}
   		return extras;
   	}

}
