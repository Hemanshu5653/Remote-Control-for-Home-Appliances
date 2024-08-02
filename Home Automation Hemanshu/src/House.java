import java.util.ArrayList;
import java.util.List;

public class House {
       int House_no;
       String ownerName;
      // Room[] rooms=new Room[10];
       List<Room> rooms;//=new ArrayList();
       int ctrroom;
       public House() {
    	   this.rooms=new ArrayList<Room>();
		// TODO Auto-generated constructor stub
	}
	public House(int house_no, String ownerName) {
		House_no = house_no;
		this.ownerName = ownerName;
		this.rooms=new ArrayList<Room>();
		//this.rooms = rooms;
		//this.ctrroom=0;
	}
	public int getCtrroom() {
		return ctrroom;
	}
	public void setCtrroom() {
		this.ctrroom++;
	}
	public int getHouse_no() {
		return House_no;
	}
	public void setHouse_no(int house_no) {
		House_no = house_no;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	
       
}
