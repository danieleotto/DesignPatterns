package uninettuno.designpatterns.structural.flyweight;

import java.util.Hashtable;

/*FlyweightFactory*/
public class FlyweightFactory {

	private static Hashtable<Character, FlyweightCarattere> cache = new Hashtable<Character, FlyweightCarattere>();
	
	public static FlyweightCarattere getFlyweight(Character carattere) {
		carattere = Character.toUpperCase(carattere);
		FlyweightCarattere flyweight = null;
		if(cache.containsKey(carattere)) {
			flyweight = cache.get(carattere);
		} else {
			flyweight = new ConcreteFlyweightCarattere(carattere);
			cache.put(carattere, flyweight);
		}
		return flyweight;
	}
}
