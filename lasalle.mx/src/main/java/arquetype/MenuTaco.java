package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuTaco {

	public static CATaco tacoPastor() {
		return new CATaco(1, "Taco al Pastor", 20,
				new ArrayList<>(Arrays.asList("tortilla", "cerdo", "piña", "cebolla", "cilantro")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoBistec() {
		return new CATaco(2, "Taco de Bistec", 20,
				new ArrayList<>(Arrays.asList("tortilla", "res", "cebolla", "cilantro")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoArracherra() {
		return new CATaco(3, "Taco Arracherra", 25,
				new ArrayList<>(Arrays.asList("tortilla", "arrachera", "cebolla", "cilantro")),
				new ArrayList<>(Arrays.asList("gluten", "lácteos")));
	}

	public static CATaco tacoSuadero() {
		return new CATaco(4, "Taco Suadero", 20,
				new ArrayList<>(Arrays.asList("tortilla", "res", "cebolla", "cilantro")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoLonganiza() {
		return new CATaco(5, "Taco Longaniza", 22,
				new ArrayList<>(Arrays.asList("tortilla", "embutido longaniza", "cebolla", "cilantro")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoPollo() {
		return new CATaco(6, "Taco Pollo", 20,
				new ArrayList<>(Arrays.asList("tortilla", "pollo", "cebolla", "cilantro")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoCecina() {
		return new CATaco(7, "Taco Cecina", 25,
				new ArrayList<>(Arrays.asList("tortilla", "cecina", "cebolla", "cilantro")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoCostilla() {
		return new CATaco(8, "Taco Costilla", 27,
				new ArrayList<>(Arrays.asList("tortilla", "costilla", "cilantro", "cebolla")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoChuleta() {
		return new CATaco(9, "Taco Chuleta", 29,
				new ArrayList<>(Arrays.asList("tortilla", "cerdo", "cilantro", "cebolla")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CATaco tacoVegetariano() {
		return new CATaco(10, "Taco Vegetariano", 29,
				new ArrayList<>(Arrays.asList("tortilla", "queso", "cilantro", "cebolla")),
				new ArrayList<>(Arrays.asList("gluten", "lácteos")));
	}
}
