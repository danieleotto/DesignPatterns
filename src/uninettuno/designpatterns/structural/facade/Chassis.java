package uninettuno.designpatterns.structural.facade;

import java.util.ArrayList;

public class Chassis implements Device{
	
	private ArrayList<Device> deviceList = new ArrayList<Device>();
	private ArrayList<Device> connectionList = new ArrayList<Device>();
	
	public void addDevice(Device device) {
		deviceList.add(device);
	}
	
	public void addConnection(Device device) {
		connectionList.add(device);
	}
}
