package uninettuno.designpatterns.structural.decorator;

/*Client*/
public class Client {

	public static void main(String[] args) {
		Dipendente dip1 = new Ingegnere("Mario Rossi","Ufficio progetti");
		dip1.chiSono();
		dip1 = new ResponsabileAmministrativo(dip1);
		dip1.chiSono();
		dip1 = new ResponsabileDelProgetto(dip1,"DOS Project");
		dip1.chiSono();
	}
}
