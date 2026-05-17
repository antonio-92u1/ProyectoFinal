package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuBebida {

	public static CABebida cocaCola() {
		return new CABebida(32, "Coca-Cola", 25, new ArrayList<>(
				Arrays.asList("Exceso calorías", "Exceso azúcares", "Contiene edulcorantes", "Contiene cafeína")),
				new ArrayList<>(Arrays.asList("")),false); // No tiene alergenos
	}

	public static CABebida cocaColaZero() {
		return new CABebida(33, "Coca Cola Zero", 25,
				new ArrayList<>(Arrays.asList("Contiene edulcorantes", "Contiene cafeína", "No recomendable en niños")),
				new ArrayList<>(Arrays.asList("")),false);
	}

	public static CABebida aguaMineral() {
		return new CABebida(34, "Agua Mineral", 15, new ArrayList<>(Arrays.asList("")),
				new ArrayList<>(Arrays.asList("")),false);
	}

	public static CABebida cafeAmericano() {
		return new CABebida(35, "Café Americano", 30,
				new ArrayList<>(Arrays.asList("Contiene cafeína", "No recomendable en niños")),
				new ArrayList<>(Arrays.asList("")),true);
	}

	public static CABebida capuccino() {
		return new CABebida(36, "Capuccino", 45,
				new ArrayList<>(Arrays.asList("Contiene cafeína", "Exceso calorías", "Exceso azúcares")),
				new ArrayList<>(Arrays.asList("lácteos")),true);
	}

	public static CABebida jugoVerde() {
		return new CABebida(37, "Jugo Verde", 35, new ArrayList<>(Arrays.asList("Exceso azúcares")),
				new ArrayList<>(Arrays.asList("piña")),false);
	}

	public static CABebida jugoNaranja() {
		return new CABebida(38, "Jugo de Naranja", 30, new ArrayList<>(Arrays.asList("Exceso azúcares")),
				new ArrayList<>(Arrays.asList("cítricos")),false);
	}

	public static CABebida malteadaChocolate() {
		return new CABebida(39, "Malteada de Chocolate", 55, new ArrayList<>(
				Arrays.asList("Exceso calorías", "Exceso azúcares", "Exceso grasas saturadas", "Contiene cafeína")),
				new ArrayList<>(Arrays.asList("lácteos")),true);
	}
}
