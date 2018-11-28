package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. SmartTv 3대 저장하세요
		Tv[] st = new SmartTv[3];
		SmartTv st1 = new SmartTv();
		st[0]= st1;
//		st[0]= new SmartTv();
//		st[1]= new SmartTv();
//		st[2]= new SmartTv();
		for (int i = 0; i < st.length; i++) {
			st[i]= new SmartTv();
		}
		//2. ThreeDTv 2대 저장하세요
		ThreeDTv[] tdt = new ThreeDTv[2];
//		tdt[0]= new ThreeDTv();
//		tdt[1]= new ThreeDTv();
		for (int i = 0; i < tdt.length; i++) {
			tdt[i]= new ThreeDTv();
		}
		//3. AfreecaTv 4대 저장하세요
		AfreecaTv[] at = new AfreecaTv[4];
//		at[0]= new AfreecaTv();
//		at[1]= new AfreecaTv();
//		at[2]= new AfreecaTv();
//		at[3]= new AfreecaTv();
		for (int i = 0; i < at.length; i++) {
			at[i]= new AfreecaTv();
		}
		
		Tv[] t = new Tv[9]; //다형성
		t[0] = (Tv)new SmartTv();//up-casting(생략가능)
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
	
		SmartTv st4 =(SmartTv)t[2];//down-casting
		
//		SmartTv tt = (SmartTv)new Tv();//문법적으로 맞지만 터진다 
	
	
	
	
	}
}

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void internet(){
		
	}
}

class ThreeDTv extends Tv{
	void tHreeD(){
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}


