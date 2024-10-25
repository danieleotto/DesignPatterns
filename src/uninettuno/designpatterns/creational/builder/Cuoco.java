package uninettuno.designpatterns.creational.builder;

/* Director: 			costruisce un oggetto con l'interfaccia Builder
 * Abstract Builder:	specifica una interfaccia astratta che crea le parti dell'oggetto Product
 * Concrete Builder: 	costruisce il product in base ai metodi definiti nel Builder
 * Product:				rappresenta l'oggetto complesso da costruire*/


/* DIRECTOR */
public class Cuoco {
	private CuocoPizza cuocoPizza;
	
	public void setPizze(CuocoPizza pb) {
		cuocoPizza = pb;
	}
	
	public Pizza getPizza() {
		return cuocoPizza.getPizza();
	}
	
	public void produciPizza() {
		cuocoPizza.createNewPizzaProduct();
		cuocoPizza.buildPrimoIngrediente();
		cuocoPizza.buildSecondoIngrediente();
		cuocoPizza.buildTerzoIngrediente();
	}
	
	public String sfornaPizza() {
		return cuocoPizza.sforna();
	}
	
}
