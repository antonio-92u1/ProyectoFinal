package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuPostres {

	public static CAPostre cheesecakeFresa() {
		return new CAPostre(40, "Cheesecake de Fresa", 450, 95,
				new ArrayList<>(Arrays.asList("queso crema", "fresa", "azúcar", "huevo", "galleta", "mantequilla")),
				new ArrayList<>(Arrays.asList("lácteos", "gluten", "huevo")));
	}

	public static CAPostre cheesecakeLotus() {
		return new CAPostre(41, "Cheesecake Lotus", 500, 110,
				new ArrayList<>(Arrays.asList("queso crema", "galleta lotus", "azúcar", "huevo", "mantequilla")),
				new ArrayList<>(Arrays.asList("lácteos", "gluten", "huevo")));
	}

	public static CAPostre brownie() {
		return new CAPostre(42, "Brownie de Chocolate Intenso", 380, 70,
				new ArrayList<>(Arrays.asList("chocolate", "harina", "azúcar", "huevo", "mantequilla")),
				new ArrayList<>(Arrays.asList("gluten", "huevo", "lácteos")));
	}

	public static CAPostre churros() {
		return new CAPostre(43, "Churros con Azúcar y Canela", 320, 65,
				new ArrayList<>(Arrays.asList("harina", "azúcar", "canela", "aceite")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CAPostre flanNapolitano() {
		return new CAPostre(44, "Flan Napolitano Tradicional", 300, 60,
				new ArrayList<>(Arrays.asList("leche", "huevo", "azúcar", "vainilla")),
				new ArrayList<>(Arrays.asList("lácteos", "huevo")));
	}

	public static CAPostre pastelZanahoria() {
		return new CAPostre(45, "Pastel de Zanahoria Casero", 420, 85,
				new ArrayList<>(Arrays.asList("zanahoria", "harina", "azúcar", "huevo", "nuez", "queso crema")),
				new ArrayList<>(Arrays.asList("gluten", "huevo", "lácteos", "frutos secos")));
	}
}