package uninettuno.designpatterns.behavioural.template;

/*CONCRETE CLASS*/
public class PastaAlPesto extends PastaAsciutta {
	
	@Override
	public void preparazioneSugo() {
		System.out.println("In una padella scalda l'olio e aggiungi il guanciale, il peperoncino, il vino bianco, i pomodori pelati,\nsale e cuoci per il tempo di cottura della pasta.");
	}
	
	public void servizioTavola() {
		System.out.println("Scola la pasta al dente e trasferiscila nella padella con il sugo. Fuori dal fuoco \naggiungi il pecorino grattuggiato e regola di pepe fresco di mulinello a piacere.");
	}
	
	

}
