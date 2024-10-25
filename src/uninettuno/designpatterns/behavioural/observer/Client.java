package uninettuno.designpatterns.behavioural.observer;

//CLIENT
public class Client {

	public static void main(String[] args) {
		SoggettoConcreto soggetto = new SoggettoConcreto();
		Osservatore oss1 = new OsservatoreConcreto();
		Osservatore oss2 = new OsservatoreConcreto();
		
		//aggiungo 2 observer che saranno modificati
		soggetto.addOsservatore(oss1);
		soggetto.addOsservatore(oss2);
		
		//modifico lo stato del soggetto
		soggetto.setStato(true);
		
		//rimuovo il primo osservatore che non sarà più notificato
		soggetto.removeOsservatore(oss1);
		
		//modifico di nuovo lo stato
		soggetto.setStato(false);
		
		
	}
}
