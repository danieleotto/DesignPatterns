package uninettuno.designpatterns.structural.composite;

/*LEAF*/
public class File implements Archivio {

	public String nomeFile;
	
	public File(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	
	@Override
	public void aggiungi(Archivio archivio) {
		System.out.println("Aggiunto all'archivio");
	}
	
	@Override
	public void rimuovi(Archivio archivio) {
		System.out.println("Rimosso dall'archivio");
	}
	
	@Override
	public void stampa() {
		System.out.println(nomeFile);
	}
}
