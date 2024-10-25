package uninettuno.designpatterns.behavioural.visitor;

//CLIENT
public class Client {

	public static void main(String[] args) {
		ElementiRettangolo r1 = new ElementiRettangolo();
		r1.setAltezza(25);
		r1.setBase(32);
		r1.accept(new VisitorRettangoloArea());
	}
}
