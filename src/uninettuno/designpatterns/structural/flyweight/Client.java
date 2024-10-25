package uninettuno.designpatterns.structural.flyweight;

/*client*/
public class Client {

	public static void main(String[] args) {
		
		FlyweightCarattere a1 = FlyweightFactory.getFlyweight('a');
		System.out.println("\nHashcode: "+ a1.hashCode());
		System.out.println("Valore: "+a1.operazione());
		a1.setColore("Rosso");
		
		FlyweightCarattere a2 = FlyweightFactory.getFlyweight('A');
		System.out.println("\nHashcode: "+ a2.hashCode());
		System.out.println("Valore: "+a2.operazione());
		a2.setColore("Blu");
	}
}
	
	
	
