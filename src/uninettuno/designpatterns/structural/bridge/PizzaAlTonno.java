package uninettuno.designpatterns.structural.bridge;

/*ConcreteImplementor*/
public class PizzaAlTonno implements Pasto{

	public Pasto getPiatto() {
		return this;
	}
	
}
