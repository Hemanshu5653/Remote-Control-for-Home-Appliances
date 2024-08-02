
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Lights extends Devices implements Switchable{
	public Lights(int id,String name,String deviceType) {
		super(id,name, deviceType);
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

	
}

