package uninettuno.designpatterns.structural.composite;

/*COMPONENT*/
public interface Archivio {
	public void aggiungi(Archivio archivio);
	public void rimuovi(Archivio archivio);
	public void stampa();
}
