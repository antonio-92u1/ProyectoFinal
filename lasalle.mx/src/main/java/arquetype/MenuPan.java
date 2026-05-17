package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuPan {

	public static CAPan cheesecakeFresa() {
		return new CAPan(40, "Cheesecake de Fresa", 95,
				new ArrayList<>(Arrays.asList("queso crema", "fresa", "azúcar", "huevo", "galleta", "mantequilla")),
				new ArrayList<>(Arrays.asList("lácteos", "gluten", "huevo")));
	}

	public static CAPan cheesecakeLotus() {
		return new CAPan(41, "Cheesecake Lotus", 500,
				new ArrayList<>(Arrays.asList("queso crema", "galleta lotus", "azúcar", "huevo", "mantequilla")),
				new ArrayList<>(Arrays.asList("lácteos", "gluten", "huevo")));
	}

	public static CAPan brownie() {
		return new CAPan(42, "Brownie de Chocolate Intenso", 70,
				new ArrayList<>(Arrays.asList("chocolate", "harina", "azúcar", "huevo", "mantequilla")),
				new ArrayList<>(Arrays.asList("gluten", "huevo", "lácteos")));
	}

	public static CAPan churros() {
		return new CAPan(43, "Churros con Azúcar y Canela", 65,
				new ArrayList<>(Arrays.asList("harina", "azúcar", "canela", "aceite")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CAPan flanNapolitano() {
		return new CAPan(44, "Flan Napolitano Tradicional", 60,
				new ArrayList<>(Arrays.asList("leche", "huevo", "azúcar", "vainilla")),
				new ArrayList<>(Arrays.asList("lácteos", "huevo")));
	}

}
