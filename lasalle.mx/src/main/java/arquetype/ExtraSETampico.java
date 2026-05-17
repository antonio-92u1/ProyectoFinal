package arquetype;

import java.util.ArrayList;

public class ExtraSETampico extends EDSushiEnsalada {

	public ExtraSETampico(InterSushiEnsalda sushi) {
		super(sushi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		return sushi.getId();
	}

	@Override
	public String getNombre() {
		return sushi.getNombre() + " + tampico";
	}

	@Override
	public double getPrecio() {
		return sushi.getPrecio() + 7;
	}

	@Override
	public ArrayList<String> getIngredientes() {
		ArrayList<String> ingredientes = new ArrayList<>(sushi.getIngredientes());
		if (!ingredientes.contains("tampico")) {
			ingredientes.add("tampico");
		}
		return ingredientes;
	}

	@Override
	public ArrayList<String> getAlergenos() {
		return new ArrayList<>(sushi.getAlergenos());
	}
	@Override
	public double getPrecioInicial() {
		// TODO Auto-generated method stub
		return sushi.getPrecioInicial();
	}
	
	
    @Override
    public String nombreBase() {
    	// TODO Auto-generated method stub
        return sushi.nombreBase();
    }
    
    @Override
   	public ArrayList<String> getExtras() {
   		ArrayList<String> extras = new ArrayList<>(sushi.getExtras());
   		if (!extras.contains("tampico")) {
   			extras.add("tampico");
   		}
   		return extras;
   	}

}
