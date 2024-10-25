package uninettuno.designpatterns.behavioural.visitor;

//ELEMENT
public class ElementiRettangolo {

	int altezza;
	int base;
	
	public int getAltezza() {
		return altezza;
	}
	
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void accept(VisitorRettangoloArea visitor) {
		visitor.visitRettangoloArea(this);
	}
}
