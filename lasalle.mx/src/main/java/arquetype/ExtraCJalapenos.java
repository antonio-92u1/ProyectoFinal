package arquetype;

import java.util.ArrayList;

public class ExtraCJalapenos extends EDComida {

	public ExtraCJalapenos(InterComida comida) {
		super(comida);
	}

	@Override
	public int getId() {
		return comida.getId();
	}

	@Override
	public String getNombre() {
		return comida.getNombre() + " + jalapeños";
	}

	@Override
	public double getPrecio() {
		return comida.getPrecio() + 8;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(comida.getIngredientes());
		if (!ingredientes.contains("jalapeños")) {
			ingredientes.add("jalapeños");
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
		if (!extras.contains("jalapeños")) {
			extras.add("jalapeños");
		}
		return extras;
	}

}