package uninettuno.designpatterns.behavioural.template;

/*ABSTRACT CLASS*/
public abstract class PastaAsciutta {

	//template method
	public final void cuociPasta() {
		preparazioneBasePasta();
		eventualeIngredienteBase();
		preparazioneSugo();
		servizioTavola();
	}
	
	public void preparazioneBasePasta() {
		System.out.println("\nPortare a ebollizione l'acqua, salarla e far cuocere la pasta per il tempo necessario.\n");
	}
	
	//metodo hook che può essere implementato
	protected void eventualeIngredienteBase() {}
	
	//metodi primitivi che devono essere implementati
	protected void preparazioneSugo() {};
	protected void servizioTavola() {};
	
	
}
