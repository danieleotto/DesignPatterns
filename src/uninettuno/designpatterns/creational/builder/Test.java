package uninettuno.designpatterns.creational.builder;

/* Director: 			costruisce un oggetto con l'interfaccia Builder
 * Abstract Builder:	specifica una interfaccia astratta che crea le parti dell'oggetto Product
 * Concrete Builder: 	costruisce il product in base ai metodi definiti nel Builder
 * Product:				rappresenta l'oggetto complesso da costruire*/

public class Test {

	public static void main(String[] args) {
		
		Cuoco cuoco = new Cuoco();
		CuocoPizza pizzaCapricciosa = new PizzaCapricciosa();
		CuocoPizza pizzaMargherita = new PizzaMargherita();
		cuoco.setPizze(pizzaMargherita);
		cuoco.produciPizza();
		System.out.println(cuoco.sfornaPizza());
		cuoco.setPizze(pizzaCapricciosa);
		cuoco.produciPizza();
		System.out.println(cuoco.sfornaPizza());

	}

}
