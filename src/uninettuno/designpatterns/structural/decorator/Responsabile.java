package uninettuno.designpatterns.structural.decorator;

/*Decorator*/
public abstract class Responsabile implements Dipendente{
	
	protected Dipendente responsabile;
	
	public Responsabile(Dipendente dipendente) {
		this.responsabile = dipendente;
	}
	
	@Override
	public String getNome() {
		return this.responsabile.getNome();
	}
	
	@Override
	public String getUfficio() {
		return this.responsabile.getUfficio();
	}
	
	@Override
	public void chiSono() {
		this.responsabile.chiSono();
	}	
}
