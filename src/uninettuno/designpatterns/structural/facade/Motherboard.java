package uninettuno.designpatterns.structural.facade;

import java.util.ArrayList;

public class Motherboard implements Device{
	
	private ArrayList<Device> deviceList = new ArrayList<Device>();
	
	public void addDevice(Device device) {
		deviceList.add(device);
	}
}
