package uninettuno.designpatterns.behavioural.observer;

//CONCRETE OBSERVER
public class OsservatoreConcreto implements Osservatore {

	@Override
	public void upDate() {
		System.out.println("Sono "+ this + " il soggetto è stato modificato.");
	}
	
}
