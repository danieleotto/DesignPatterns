package uninettuno.designpatterns.structural.flyweight;

/*Concrete Flyweight*/
public class ConcreteFlyweightCarattere implements FlyweightCarattere{

	Character carattere;
	//stato interno
	public ConcreteFlyweightCarattere(Character carattere) {
		this.carattere = Character.toUpperCase(carattere);
	}
	
	public Character operazione() {
		return carattere;
	}
	
	public void setColore(String colore) {
		System.out.println("Colore: "+colore);
	}
}
