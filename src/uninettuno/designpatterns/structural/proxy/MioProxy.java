package uninettuno.designpatterns.structural.proxy;

/*Proxy che si occupa di "proxare" l'invocazione del client verso il realsubject*/
public class MioProxy implements Subject {
	
	private RealSubject realSubject = new RealSubject();
	
	@Override
	public void stampa() {
		System.out.println("\nStampa da MioProxy!");
		realSubject.stampa();
	}

}
