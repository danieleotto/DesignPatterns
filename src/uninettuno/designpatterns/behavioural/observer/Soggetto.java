package uninettuno.designpatterns.behavioural.observer;

import java.util.*;

//SUBJECT
public abstract class Soggetto {
	
	private List<Osservatore> lista = new ArrayList<Osservatore>();
	
	public void addOsservatore(Osservatore osservatore) {
		lista.add(osservatore);
	}
	
	public void removeOsservatore(Osservatore osservatore) {
		lista.remove(osservatore);
	}
	
	public void notificaOsservatore() {
		for(Osservatore osservatore: lista) {
			osservatore.upDate();
		}
	}
}

