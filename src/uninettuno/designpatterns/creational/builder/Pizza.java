package uninettuno.designpatterns.creational.builder;

/* Director: 			costruisce un oggetto con l'interfaccia Builder
 * Abstract Builder:	specifica una interfaccia astratta che crea le parti dell'oggetto Product
 * Concrete Builder: 	costruisce il product in base ai metodi definiti nel Builder
 * Product:				rappresenta l'oggetto complesso da costruire*/

/* PRODUCT */
public class Pizza {
	
	private String primoIngrediente;
	private String secondoIngrediente;
	private String terzoIngrediente;
	
	public void setPrimoIngrediente(String primoingrediente) {
		this.primoIngrediente = primoingrediente;
	}
	
	public void setSecondoIngrediente(String secondoingrediente) {
		this.secondoIngrediente = secondoingrediente;
	}
	public void setTerzoIngrediente(String terzoingrediente) {
		this.terzoIngrediente = terzoingrediente;
	}
	
	public String getPrimoIngrediente() {
		return this.primoIngrediente;
	}
	
	public String getSecondoIngrediente() {
		return this.secondoIngrediente;
	}
	
	public String getTerzoIngrediente() {
		return this.terzoIngrediente;
	}
	
	
}
