package arquetype;

import java.util.ArrayList;

public class ExtraBCremaBatida extends EDBebida {
	public ExtraBCremaBatida(InterBebida bebida) {
		super(bebida);
	}

	@Override
	public int getId() {
		return bebida.getId();
	}

	@Override
	public String getNombre() {
		if(!bebida.isExtra())
			return bebida.getNombre();
		return bebida.getNombre() + " + Crema  batida";
	}

	@Override
	public double getPrecio() {
		if(!bebida.isExtra())
			return bebida.getPrecio();
		return bebida.getPrecio() + 6;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(bebida.getIngredientes());
		if (!ingredientes.contains("Ingrediente: crema batida") && bebida.isExtra()) {
			ingredientes.add("Ingrediente: crema batida");
		}
		return ingredientes;
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return new ArrayList<>(bebida.getAlergenos());
	}

	@Override
	public double getPrecioInicial() {
		// TODO Auto-generated method stub
		return bebida.getPrecioInicial();
	}
	
    @Override
    public String nombreBase() {
    	// TODO Auto-generated method stub
        return bebida.nombreBase();
    }

	@Override
	public ArrayList<String> getExtras() {
		ArrayList<String> extras = new ArrayList<>(bebida.getExtras());
		if (!extras.contains("crema batida") && bebida.isExtra()) {
			extras.add("crema batida");
		}
		return extras;
	}

	@Override
	public boolean isExtra() {
		// TODO Auto-generated method stub
		return bebida.isExtra();
	}

}
