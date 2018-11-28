package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(100);
		int hour = t.getHour();
		System.out.println(hour);//4
		t.setMinute(150);
		int hour2 = t.getHour();
		int minute = t.getMinute();
		System.out.println(hour2+":"+minute);//6:30
		t.setSeconds(10000);
		int hour3 = t.getHour();
		int minute2 = t.getMinute();
		int seconds = t.getSeconds();
		System.out.println(hour3+":"+minute2+":"+seconds);//9:36:40
		
		
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour){
			this.hour = hour%24;
	}
	
	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
			this.setHour(this.hour+minute/60);
			this.minute = minute%60;
	}

	int getMinute(){
		return minute;
	}
	
	void setSeconds(int second){
		this.setMinute(this.minute+second/60);
		this.second = second%60;
	}
	
	int getSeconds(){
		return second;
	}
	
	
}