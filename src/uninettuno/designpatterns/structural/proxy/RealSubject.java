package uninettuno.designpatterns.structural.proxy;

/*RealSubject che si occupa di implementare l'interfaccia subject*/
public class RealSubject implements Subject{
	
	@Override
	public void stampa() {
		System.out.println("\nStampa da RealSubject!");
	}
	
}
