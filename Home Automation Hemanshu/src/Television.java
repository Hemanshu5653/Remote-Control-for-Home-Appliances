import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Television extends Devices implements Switchable,Controlable {

	int volume;
	public Television(int id, String name,String deviceType) {
		super(id,name, deviceType);
		// TODO Auto-generated constructor stub
		this.volume=0;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		//this.setStatus("ON");
		//this.setTime(LocalTime.now());
		if(this.getStatus().equalsIgnoreCase("ON"))
		{
			System.out.println("The Device Is Already ON Since:"+this.getTime());
			return;
		}
		this.setStatus("ON");
		this.setTime(LocalTime.now());
		System.out.println("device on successfully");
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(this.getStatus().equalsIgnoreCase("OFF"))
		{
			System.out.println("The Device Is Already OFF Since:"+this.getTime());
			return;
		}
		this.setStatus("OFF");
		this.setTime(LocalTime.now());
		//this.setStatus("off");
		System.out.println("device off successfully");
	}

	@Override
	public void timeCal() {
		// TODO Auto-generated method stub
		LocalTime oldTime=this.getTime();
		  LocalTime CurrTime=LocalTime.now();
		 long  hoursDifference=0;
		 long minutesDifference=0;
		 long secondsDifference=0;
		 long miliSecondsDifference=0;
		 hoursDifference=ChronoUnit.MINUTES.between(oldTime, CurrTime);
		 minutesDifference=ChronoUnit.HOURS.between(oldTime, CurrTime);
		 secondsDifference=ChronoUnit.SECONDS.between(oldTime, CurrTime);
		 miliSecondsDifference=ChronoUnit.MILLIS.between(oldTime, CurrTime);
		 System.out.println("The Lights Are Int Status:"+this.getStatus()+ " Since "+hoursDifference+" hours, "+minutesDifference + "Minutes ,"+secondsDifference+" seconds,and  "+ miliSecondsDifference+" miliseconds"); 
	
	}

	@Override
	public void increse() {
		// TODO Auto-generated method stub
		if(this.getStatus().equalsIgnoreCase("ON"))
		{  
			if(this.getVolume()<10)
			{
				this.setVolume(this.getVolume()+1);	
			}	
			else 
				System.out.println("Volume is full");
		}	
		else	
			System.out.println("Tv is off");
		
	}

	@Override
	public void decrese() {
		// TODO Auto-generated method stub
		if(this.getStatus().equalsIgnoreCase("on"))
		{
			if(this.getVolume()>0)
			{
				this.setVolume(this.getVolume()-1);
			}	
			else
				System.out.println("volume is 0");
		}
		else	
			System.out.println("Tv is off");
		
	}


	

}
