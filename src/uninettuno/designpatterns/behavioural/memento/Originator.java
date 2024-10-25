package uninettuno.designpatterns.behavioural.memento;

/* Caretaker: 	interessato allo stato di originator e detiene l'oggetto memento
 * Originator: 	memorizza il proprio stato transitorio attraverso l'utilizzo delle proprietà interne
 * 				mentre memorizza il proprio stato esterno attraverso l'uso del Memento
 * Memento:		è l'oggetto che si occupa di detenere lo stato dell'Originator e consente
 * 				solo a questi di accedervi.*/

public class Originator {
	
	private Object statoOriginale;
	
	public void setStatoOriginale(Object statooriginale) {
		this.statoOriginale = statooriginale;
	}
	
	public Object getStatoOriginale() {
		return this.statoOriginale;
	}
	
	public Memento creaMemento() {
		Memento memento = new Memento();
		memento.setStatoMemento(this.statoOriginale);
		return memento;
	}
	
	public void ripristinaMemento(Memento memento) {
		this.statoOriginale = memento.getStatoMemento();
	}


	//classe Memento Interna
	public class Memento {
		
		private Object statoMemento;
		
		private void setStatoMemento(Object statomemento) {
			this.statoMemento = statomemento;
		}
		
		private Object getStatoMemento() {
			return this.statoMemento;
		}
	}
}
