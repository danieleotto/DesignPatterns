package uninettuno.designpatterns.structural.bridge;

/*RefinedAbstraction*/
public class CamerierePizzeria implements Cameriere{
	
	public Pasto ordinazione (Pasto pasto) {
		return pasto;
	}

}
