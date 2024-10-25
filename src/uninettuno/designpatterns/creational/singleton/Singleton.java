package uninettuno.designpatterns.creational.singleton;

public class Singleton {
	
	//dichiariamo privato il costruttore
	private static Singleton mySingleton = new Singleton();
	
	//metodo pubblico che instanzia solo se non già istanziato
	public static Singleton getInstance() {
		if(mySingleton == null) {
			mySingleton = new Singleton();
		}
		return mySingleton;
	}
	
	private Singleton() {
		System.out.println("Singleton instanziato! valore hashcode: " + hashCode());
	}
}
