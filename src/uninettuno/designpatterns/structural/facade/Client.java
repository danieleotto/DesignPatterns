package uninettuno.designpatterns.structural.facade;

public class Client {
	
	public static void main(String[] args) {
		Chassis chassis = new ComputerFacade().createComputer();
		System.out.println(chassis);
	}

}
