package uninettuno.designpatterns.structural.adapter;

/* La classe Client passa per Adapter per invocare Employee utilizzando gli stessi metodi usati per invocare
 * la classe Impiegato*/

public class Client {

	public static void main(String[] args) {
		Impiegato impiegato = new Impiegato();
		impiegato.setCognome("Ottorogo");
		System.out.println("\nImpiegato: "+impiegato.getCognome());
		
		Adapter adattatoreEmployee = new Adapter(new Employee());
		adattatoreEmployee.setCognome("Rossi");
		System.out.println("\nadattatoreEmployee: "+adattatoreEmployee.getCognome());
	}
}
