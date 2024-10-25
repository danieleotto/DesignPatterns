package uninettuno.designpatterns.behavioural.memento;

/* Caretaker: 	interessato allo stato di originator e detiene l'oggetto memento
 * Originator: 	memorizza il proprio stato transitorio attraverso l'utilizzo delle proprietà interne
 * 				mentre memorizza il proprio stato esterno attraverso l'uso del Memento
 * Memento:		è l'oggetto che si occupa di detenere lo stato dell'Originator e consente
 * 				solo a questi di accedervi.*/

public class Caretaker {
	
	public static void main(String[] args) {
		Originator oggetto = new Originator();
		oggetto.setStatoOriginale("stato iniziale");
		oggetto.creaMemento();
		Originator.Memento memento = oggetto.creaMemento();
		System.out.println(oggetto.getStatoOriginale());
		
		//modifica stato
		oggetto.setStatoOriginale("stato modificato");
		System.out.println(oggetto.getStatoOriginale());
		
		//ripristino stato
		oggetto.ripristinaMemento(memento);
		System.out.println(oggetto.getStatoOriginale());
	}

}
