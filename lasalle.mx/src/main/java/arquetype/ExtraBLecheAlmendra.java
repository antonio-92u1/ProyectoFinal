package arquetype;

import java.util.ArrayList;

public class ExtraBLecheAlmendra extends EDBebida {
	public ExtraBLecheAlmendra(InterBebida bebida) {
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
		return bebida.getNombre() + " + leche de almendra";
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
		if (!ingredientes.contains("Ingrediente: leche de almendra") && bebida.isExtra()) {
			ingredientes.add("Ingrediente: leche de almendra");
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
		if (!extras.contains("leche de almendra") && bebida.isExtra()) {
			extras.add("leche de almendra");
		}
		return extras;
	}
    
	@Override
	public boolean isExtra() {
		// TODO Auto-generated method stub
		return bebida.isExtra();
	}

}
