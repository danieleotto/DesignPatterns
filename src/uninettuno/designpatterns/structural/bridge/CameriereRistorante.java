package uninettuno.designpatterns.structural.bridge;

/*RefinedAbstraction*/
public class CameriereRistorante implements Cameriere{
	
	public Pasto ordinazione (Pasto pasto) {
		return pasto;
	}

}
