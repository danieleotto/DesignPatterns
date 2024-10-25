package uninettuno.designpatterns.creational.factory;

public class CommessoTennis extends Commesso{
	
	public static Scarpe getScarpe() {
		return new ScarpeTennis();
	}

}
