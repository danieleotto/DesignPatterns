package uninettuno.designpatterns.creational.factory;

public class CommessoGinnastica extends Commesso{
	
	public static Scarpe getScarpe() {
		return new ScarpeGinnastica();
	}

}
