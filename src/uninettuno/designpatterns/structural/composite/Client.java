package uninettuno.designpatterns.structural.composite;

/*Client*/
public class Client {

	public static void main(String[] args) {
		Archivio file2 = new File("File 2");
		Archivio file3 = new File("File 3");
		Archivio cartella2 = new Cartella("Cartella 2");
		cartella2.aggiungi(file2);
		cartella2.aggiungi(file3);
		Archivio file1 = new File("File 1");
		Archivio cartella1 = new Cartella("Cartella 1");
		cartella1.aggiungi(file1);
		cartella1.aggiungi(cartella2);
		
		//il metodo stampa viene invocato su tutti gli oggetti dell'albero
		cartella1.stampa();
	}
}
