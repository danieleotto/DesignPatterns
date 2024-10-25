package uninettuno.designpatterns.structural.decorator;

/*Concrete decorator*/
public class ResponsabileAmministrativo extends Responsabile{
	
	public ResponsabileAmministrativo(Dipendente dipendente) {
		super(dipendente);
	}
	
	@Override
	public void chiSono() {
		this.sonoIlCapo();
		super.chiSono();
	}
	
	public void sonoIlCapo() {
		System.out.print("Sono il responsabile amministrativo e ");
	}

}
