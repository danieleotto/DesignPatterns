package uninettuno.designpatterns.structural.facade;

/* FACADE */

public class ComputerFacade {
	
	public Chassis createComputer() {
		Motherboard motherboard = new Motherboard();
		motherboard.addDevice(new Cpu());
		motherboard.addDevice(new Ram());
		motherboard.addDevice(new Videocard());
		
		Chassis chassis = new Chassis();
		chassis.addDevice(motherboard);
		chassis.addConnection(new Monitor());
		chassis.addConnection(new Mouse());
		chassis.addConnection(new Keyboard());
		
		return chassis;
	
	
	}
}
