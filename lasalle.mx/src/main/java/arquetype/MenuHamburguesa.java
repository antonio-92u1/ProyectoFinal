package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuHamburguesa {

	public static CAHamburguesa hamburguesaClasica() {
		return new CAHamburguesa(11, "Hamburguesa Clásica", 75,
				new ArrayList<>(Arrays.asList("carne", "pan", "queso", "lechuga")),
				new ArrayList<>(Arrays.asList("gluten", "lácteos")));
	}

	public static CAHamburguesa bbqBaconBurger() {
		return new CAHamburguesa(12, "BBQ Bacon Burger", 85,
				new ArrayList<>(Arrays.asList("carne", "pan", "tocino", "salsa bbq", "queso")),
				new ArrayList<>(Arrays.asList("gluten", "lácteos")));
	}

	public static CAHamburguesa dobleQuesoBurger() {
		return new CAHamburguesa(13, "Doble Queso Burger", 90,
				new ArrayList<>(Arrays.asList("carne", "pan", "doble queso")),
				new ArrayList<>(Arrays.asList("gluten", "lácteos")));
	}

	public static CAHamburguesa chickenBurger() {
		return new CAHamburguesa(14, "Chicken Burger", 80,
				new ArrayList<>(Arrays.asList("pollo", "pan", "lechuga", "jitomate", "queso")),
				new ArrayList<>(Arrays.asList("gluten", "lácteos")));
	}

	public static CAHamburguesa burgerMexicana() {
		return new CAHamburguesa(15, "Burger Mexicana", 88,
				new ArrayList<>(Arrays.asList("carne", "pan", "guacamole", "jalapeño", "queso", "jitomate")),
				new ArrayList<>(Arrays.asList("gluten", "lácteos")));
	}

	public static CAHamburguesa burgerHawaiana() {
		return new CAHamburguesa(16, "Burger Hawaiana", 87,
				new ArrayList<>(Arrays.asList("carne", "pan", "piña", "jamón", "queso", "jitomate")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CAHamburguesa burgerChampinon() {
		return new CAHamburguesa(17, "Burger Champiñon", 84,
				new ArrayList<>(Arrays.asList("carne", "pan", "champiñones", "queso", "lechuga")),
				new ArrayList<>(Arrays.asList("gluten")));
	}

	public static CAHamburguesa burgerVegetal() {
		return new CAHamburguesa(18, "Burger Vegetal", 82,
				new ArrayList<>(Arrays.asList("legumbres", "pan", "tofu", "jengibre", "pimentón")),
				new ArrayList<>(Arrays.asList("gluten, soya")));
	}

}
