

import java.time.LocalTime;
public class Devices {
      int id;
      String deviceType;
      String name;
      String status;  
      LocalTime Time;
	public Devices(int id, String deviceType, String name) {
		super();
		this.id = id;
		this.deviceType = deviceType;
		this.name = name;
		this.status = "off";
		Time = LocalTime.now();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalTime getTime() {
		return Time;
	}
	public void setTime(LocalTime time) {
		Time = time;
	}
    

      
}

