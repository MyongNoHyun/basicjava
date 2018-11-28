package F_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String str = og.upMethod();
		
		
		
	}
}

class OverUp{
	int x = 3;
	int y = 3;
	
	String upMethod(){
		return "하이" +x+y;
	}
}

class OverGo extends OverUp{
	int z = 5;
	
	@Override //부모의 것을 재정의해서 사용
	String upMethod(){
		return x+y+z+"오버라이드";
	}
	
	String upMethod(int k){
		return x+y+k+"오버로딩";
	}
}

