package uninettuno.designpatterns.creational.prototype;

public class Biscotto implements Cloneable {

	public Object clone() {
		try {
			Biscotto copy = (Biscotto)super.clone();
			return copy;
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
