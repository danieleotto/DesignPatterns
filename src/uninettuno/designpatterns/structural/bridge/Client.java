package uninettuno.designpatterns.structural.bridge;

/*Client*/
public class Client {
	
	public static void main(String[] args) {
		
		Cameriere[] cameriere = new Cameriere[2];
		cameriere[0] = new CamerierePizzeria();
		Pasto pasto = cameriere[0].ordinazione(new PizzaAlTonno());
		System.out.println(pasto);
		
		cameriere[1] = new CameriereRistorante();
		pasto = cameriere[1].ordinazione(new SpaghettiAllaCarbonara());
		System.out.println(pasto);
		
		
	}
}
