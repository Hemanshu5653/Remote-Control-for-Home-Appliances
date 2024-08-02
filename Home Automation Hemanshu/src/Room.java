import java.util.ArrayList;
import java.util.List;

public class Room {
     String roomType;
     //Devices[] devices=new Devices[10];
     List<Devices> devices;
     int ctrd;
	public Room(String roomType) {
		this.roomType = roomType;
		//this.devices=new Devices[10];
		this.devices=new ArrayList<Devices>();
		ctrd=0;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public List<Devices> getDevices() {
		return devices;
	}
	public void setDevices(List<Devices> devices) {
		this.devices = devices;
	}
	public int getCtrd() {
		return ctrd;
	}
	public void setCtrd() {
		this.ctrd++;
	}
	
     
}