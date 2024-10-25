package uninettuno.designpatterns.structural.decorator;

/*Concrete decorator*/
public class ResponsabileDelProgetto extends Responsabile{
	
	private String progetto;
	
	public ResponsabileDelProgetto(Dipendente dipendente, String progetto) {
		super(dipendente);
		this.progetto = progetto;
	}
	
	@Override
	public void chiSono() {
		this.sonoIlCapo();
		super.chiSono();
	}
	
	public void sonoIlCapo() {
		System.out.print("Sono il responsabile del progetto "+this.progetto+" e ");
	}

}
