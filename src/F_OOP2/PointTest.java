package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3d = new Point3D(10,20,30);
		
		
	}
}


class Point2{
	
	int x;
	int y;
	
	Point2(int x,int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2{
	int z;
	Point3D(int x,int y, int z){
		super(x,y);
		this.x = 100;	//자손 인스턴스에 없기 때문에 조상클래스에서 찾는다. // 변수 :지역 전역 부모
		super.y = 200;										// 메서드 :자식 부모
		this.z=z;
	}

}