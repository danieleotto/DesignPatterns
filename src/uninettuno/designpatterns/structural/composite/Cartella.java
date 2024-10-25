package uninettuno.designpatterns.structural.composite;

import java.util.ArrayList;

/*Composite*/
public class Cartella implements Archivio {

	public String nomeCartella;
	public ArrayList<Archivio> cartella;
	
	public Cartella (String nomeCartella) {
		this.nomeCartella = nomeCartella;
		cartella = new ArrayList<Archivio>();
	}
	
	@Override
	public void aggiungi(Archivio archivio) {
		cartella.add(archivio);
	}
	
	@Override
	public void rimuovi(Archivio archivio) {
		cartella.remove(archivio);
	}
	
	@Override
	public void stampa() {
		System.out.println(nomeCartella);
		for(int i = 0; i<cartella.size();i++) {
			cartella.get(i).stampa();
		}
	}
	
	
}
