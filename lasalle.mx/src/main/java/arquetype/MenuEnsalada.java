package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuEnsalada {

	public static CAEnsalada ensaladaCesar() {
		return new CAEnsalada(
				27, "Ensalada César", 120, new ArrayList<>(Arrays.asList("lechuga romana", "crutones", "pollo",
						"anchoas", "huevo", "aderezo césar", "queso paremsano")),
				new ArrayList<>(Arrays.asList("lácteos", "huevo")));
	}

	public static CAEnsalada ensaladaPollo() {
		return new CAEnsalada(28, "Ensalada de Pollo", 105,
				new ArrayList<>(
						Arrays.asList("lechuga", "aguacate", "pollo", "espinacas", "tomate cherry", "cebolla morada")),
				new ArrayList<>(Arrays.asList(""))); // No tiene alergenos
	}

	public static CAEnsalada ensaladaAtun() {
		return new CAEnsalada(29, "Ensalada de Atún", 80,
				new ArrayList<>(Arrays.asList("atún", "elote", "chícharo", "cebolla", "jitomate", "mayonesa")),
				new ArrayList<>(Arrays.asList("pescado", "huevo")));
	}

	public static CAEnsalada ensaladaVeggie() {
		return new CAEnsalada(30, "Ensalada Veggie", 135,
				new ArrayList<>(Arrays.asList("espinaca", "champiñones", "apio", "pasas", "nuez", "pimiento")),
				new ArrayList<>(Arrays.asList("nueces")));
	}

	public static CAEnsalada ensaladaCaprese() {
		return new CAEnsalada(31, "Ensalada Veggie", 160,
				new ArrayList<>(Arrays.asList("jitomate", "queso mozzarella", "albahaca")),
				new ArrayList<>(Arrays.asList("lácteos")));
	}

}
