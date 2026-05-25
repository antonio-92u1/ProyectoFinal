package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuPan {

	public static CAPan conchaChocolate() {
		return new CAPan(40, "Concha de Chocolate", 20,
				new ArrayList<>(Arrays.asList("harina", "azúcar", "huevo", "mantequilla", "cocoa")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CAPan chocolatin() {
		return new CAPan(41, "Chocolatín", 35,
				new ArrayList<>(Arrays.asList("harina", "azúcar", "huevo", "mantequilla", "chocolate")),
				new ArrayList<>(Arrays.asList("lácteos", "gluten")));
	}

	public static CAPan muffinChocolate() {
		return new CAPan(42, "Muffin de Chocolate", 35,
				new ArrayList<>(Arrays.asList("chocolate", "harina", "azúcar", "huevo", "mantequilla", "cocoa")),
				new ArrayList<>(Arrays.asList("gluten", "huevo")));
	}

	public static CAPan donaAzucar() {
		return new CAPan(43, "Dona de Azúcar", 20,
				new ArrayList<>(Arrays.asList("harina", "azúcar", "manteca", "leche")),
				new ArrayList<>(Arrays.asList("gluten")));
	}


}
