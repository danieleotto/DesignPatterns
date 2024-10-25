package uninettuno.designpatterns.behavioural.template;

/*CONCRETE CLASS*/
public class PastaAmatriciana extends PastaAsciutta {
	
	@Override
	public void eventualeIngredienteBase() {
		System.out.println("Nell'acqua di cottura della pasta aggiungete una patata e alcuni fagiolini a cubetti");
	}
	
	@Override
	public void preparazioneSugo() {
		System.out.println("Mettete in un frullatore le foglie di basilico, due spicchi d'aglio, pinoli, pecorino e cominciate a frullare a bassa velocità,\nversate l'olio a filo, molto lentamente, con il frullatore sempre a velocità bassa.");
	}
	
	public void servizioTavola() {
		System.out.println("Scola la pasta al dente e unite il pesto precedentemente preparato, mescolate bene gli ingredienti \naggiungete il bicchiere d'acqua di cottura e 50 grammi di formaggio grattuggiato.");
	}
	
	

}
