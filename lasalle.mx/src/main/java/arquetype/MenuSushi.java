package arquetype;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuSushi {

	public static CASushi californiaRoll() {
		return new CASushi(19, "California Roll", 121,
				new ArrayList<>(Arrays.asList("arroz", "alga nori", "surimi", "aguacate", "pepino", "ajonjoli")),
				new ArrayList<>(Arrays.asList("mariscos", "sésamo")));
	}

	public static CASushi filadelfiaRoll() {
		return new CASushi(20, "Filadelfia Roll", 115,
				new ArrayList<>(Arrays.asList("arroz", "alga nori", "salmón", "queso crema", "pepino", "aguacate")),
				new ArrayList<>(Arrays.asList("pescado", "lácteos")));
	}

	public static CASushi spicytunaRoll() {
		return new CASushi(21, "Spicy Tuna Roll", 130,
				new ArrayList<>(
						Arrays.asList("arroz", "alga nori", "atún fresco", "mayonesa picante", "pepino", "aguacate")),
				new ArrayList<>(Arrays.asList("pescado", "huevo")));
	}

	public static CASushi ebiRoll() {
		return new CASushi(22, "Ebi Roll", 135,
				new ArrayList<>(
						Arrays.asList("arroz", "alga nori", "camarón empanizado", "queso crema", "pepino", "aguacate")),
				new ArrayList<>(Arrays.asList("mariscos", "lácteos", "gluten", "huevo")));
	}

	public static CASushi tampicoRoll() {
		return new CASushi(23, "Tampico Roll", 125,
				new ArrayList<>(Arrays.asList("arroz", "alga nori", "surimi", "tampico", "pepino", "aguacate")),
				new ArrayList<>(Arrays.asList("mariscos", "huevo")));
	}

	public static CASushi avocadoRoll() {
		return new CASushi(24, "Avocado Roll", 120,
				new ArrayList<>(Arrays.asList("arroz", "alga nori", "zanahoria", "pepino", "aguacate", "ajonjoli")),
				new ArrayList<>(Arrays.asList("sésamo")));
	}

	public static CASushi dragonRoll() {
		return new CASushi(25, "Dragon Roll", 140,
				new ArrayList<>(Arrays.asList("arroz", "alga nori", "camarón en tempura", "pepino", "aguacate",
						"salsa anguila", "ajonjoli")),
				new ArrayList<>(Arrays.asList("mariscos", "gluten", "soya", "sésamo")));
	}

	public static CASushi mangoRoll() {
		return new CASushi(26, "Mango Roll", 145,
				new ArrayList<>(Arrays.asList("arroz", "alga nori", "salmón", "mango", "queso crema", "aguacate")),
				new ArrayList<>(Arrays.asList("pescado", "lácteos")));
	}

}
