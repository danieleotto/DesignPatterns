package uninettuno.designpatterns.behavioural.observer;

//CONCRETE SUBJECT
public class SoggettoConcreto extends Soggetto{

	private boolean stato;
	
	public void setStato(boolean stato) {
		this.stato = stato;
		notificaOsservatore();
	}
	
	public boolean getStato() {
		return this.stato;
	}
	
}
