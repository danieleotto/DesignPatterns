package uninettuno.designpatterns.creational.prototype;

public class MacchinaPerBiscotti {

	private Biscotto biscotto;
	
	public MacchinaPerBiscotti(Biscotto biscotto) {
		this.biscotto = biscotto;
	}
	
	public Biscotto cuociBiscotto() {
		return (Biscotto)biscotto.clone();
	}
	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Biscotto tempBiscotto;
		Biscotto prot = new BiscottoAlCocco();
		MacchinaPerBiscotti cm = new MacchinaPerBiscotti(prot);
		for (int i=0; i<100; i++) {
			tempBiscotto = cm.cuociBiscotto();
		}
	}
	
	
}
