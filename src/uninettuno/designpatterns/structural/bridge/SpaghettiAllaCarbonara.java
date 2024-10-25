package uninettuno.designpatterns.structural.bridge;

/*ConcreteImplementor*/
public class SpaghettiAllaCarbonara implements Pasto{

	public Pasto getPiatto() {
		return this;
	}
	
}
