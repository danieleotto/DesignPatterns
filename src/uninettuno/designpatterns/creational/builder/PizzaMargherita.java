package uninettuno.designpatterns.creational.builder;

/* Director: 			costruisce un oggetto con l'interfaccia Builder
 * Abstract Builder:	specifica una interfaccia astratta che crea le parti dell'oggetto Product
 * Concrete Builder: 	costruisce il product in base ai metodi definiti nel Builder
 * Product:				rappresenta l'oggetto complesso da costruire*/


/* CONCRETE BUILDER */
public class PizzaMargherita extends CuocoPizza{
	
	@Override
	public void buildPrimoIngrediente() {
		pizza.setPrimoIngrediente("Pomodoro");
	}
	
	@Override
	public void buildSecondoIngrediente() {
		pizza.setSecondoIngrediente("Mozzarella");
	}
	
	@Override
	public void buildTerzoIngrediente() {
		pizza.setTerzoIngrediente("Basilico");
	}

}
