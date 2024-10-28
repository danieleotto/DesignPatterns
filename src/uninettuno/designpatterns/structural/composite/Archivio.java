package uninettuno.designpatterns.structural.composite;

/*COMPONENT*/
public interface Archivio {
	void aggiungi(Archivio archivio);
	void rimuovi(Archivio archivio);
	void stampa();
}
