package uninettuno.designpatterns.structural.proxy;

/*Client che si occupa di invocare il metodo stampa del proxy, il quale invocherà il metodo stampa del realSubject*/
public class Client {
	
	private Subject subject;
	
	public static void main(String[] args) {
		
		new Client().invocazione();
		
	}
	
	public void invocazione() {
		subject = new MioProxy();
		subject.stampa();
	}

}
