package arquetype;

public class MainPrueba {

	public static void main(String[] args) {
		InterComida burger = MenuHamburguesa.hamburguesaClasica();
		InterBebida b = MenuBebida.cafeAmericano();
		b.mostrarInfo();
		b = new ExtraBCremaBatida(b);
		b.mostrarInfo();
		System.out.println(b.getPrecioInicial());
		burger.mostrarInfo();
		burger = new ExtraCQueso(burger);
		burger = new ExtraCTocino(burger);
		burger = new ExtraCAguacate(burger);
		burger = new ExtraCSalsaBBQ(burger);
		b.mostrarInfo();
		burger.mostrarInfo();
		System.out.println(burger.nombreBase());
		System.out.println(burger.getPrecioInicial());
		System.out.println(burger.getExtras());
	}

}
