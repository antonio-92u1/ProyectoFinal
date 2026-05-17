package arquetype;

import java.util.ArrayList;

public class ExtraCQueso extends EDComida {

	public ExtraCQueso(InterComida comida) {
		super(comida);
	}

	@Override
	public int getId() {
		return comida.getId();
	}

	@Override
	public String getNombre() {
		return comida.getNombre() + " + queso";
	}

	@Override
	public double getPrecio() {
		return comida.getPrecio() + 10;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(comida.getIngredientes());
		if (!ingredientes.contains("queso")) {
			ingredientes.add("queso");
		}
		return ingredientes;
	}

	@Override
	public ArrayList<String> getAlergenos() {
		ArrayList<String> alergenos = new ArrayList<>(comida.getAlergenos());

		if (!alergenos.contains("lácteos")) {
			alergenos.add("lácteos");
		}

		return alergenos;
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
		if (!extras.contains("queso")) {
			extras.add("queso");
		}
		return extras;
	}

}