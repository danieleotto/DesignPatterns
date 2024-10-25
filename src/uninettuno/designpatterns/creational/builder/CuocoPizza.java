package uninettuno.designpatterns.creational.builder;

/* Director: 			costruisce un oggetto con l'interfaccia Builder
 * Abstract Builder:	specifica una interfaccia astratta che crea le parti dell'oggetto Product
 * Concrete Builder: 	costruisce il product in base ai metodi definiti nel Builder
 * Product:				rappresenta l'oggetto complesso da costruire*/


/* ABSTRACT BUILDER*/
abstract class CuocoPizza {
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizzaProduct() {
		this.pizza = new Pizza();
	}
	
	public abstract void buildPrimoIngrediente();
	public abstract void buildSecondoIngrediente();
	public abstract void buildTerzoIngrediente();
	
	public String sforna() {
		return pizza.getPrimoIngrediente()+" "+pizza.getSecondoIngrediente()+" "+pizza.getTerzoIngrediente(); 
	}
}
